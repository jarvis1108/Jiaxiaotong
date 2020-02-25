package com.dxtwangxiao.strongestsuperscholar.web.websocket.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecordUser;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceVO;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.UserService;
import com.dxtwangxiao.strongestsuperscholar.web.dto.MatchRecordDTO;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResultData;
import com.dxtwangxiao.strongestsuperscholar.web.websocket.common.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.web.socket.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 好友对战 WebSocket处理类，真正的匹配及出题业务逻辑在此
 * <p>
 * Created by Devin
 * 2018-08-08 上午 09:32
 */
public class PkWebSocketHandler implements WebSocketHandler {

    // 启动类set方法注入，解决无法注入Bean的问题
    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    private static final Map<String, WebSocketSession> users;    // 用户列表

    static {
        users = new ConcurrentHashMap<>();
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        // 1.从session中获取当前用户Id和战局Id
        String userId = (String) session.getAttributes().get("MATCH_USER_ID");
        String matchId = (String) session.getAttributes().get("MATCH_ID");

        // 2.根据用户ID获取其信息，并将用户信息存到用户列表中
        UserService userService = applicationContext.getBean(UserService.class);
        UserDTO userDTO = userService.getUserDTOById(userId);
        users.put(userId, session);

        // 3.判断战局是否达到最大人数
        MatchService matchService = applicationContext.getBean(MatchService.class);
        MatchRecordDTO matchRecordDTO = matchService.getMatchByMatchId(matchId);
        if (matchRecordDTO.getUserMaxCount().intValue() == matchRecordDTO.getUserFactCount().intValue()) {
            Message message = new Message();
            message.setMsgType("Z-1");
            message.setMsgDesc("战局达到最大人数");
            message.setMsgID(UUID.randomUUID().toString());
            message.setMsgData(null);
            sendMessageToUser(userId, new TextMessage(JSON.toJSONString(message)));
            return;
        }

        // 4.更新战局信息，向战局中添加用户
        Message result = new Message();
        result.setMsgType("A");
        result.setMsgDesc("好友信息");
        result.setMsgID(UUID.randomUUID().toString());
        Map<String, Object> curData = new HashMap<>();
        curData.put("matchId", matchRecordDTO.getMatchRecordId());

        if (matchRecordDTO.getUserId().equals(userId)) {
            // 当前用户是战局创建者
            matchService.addUser(matchId, userDTO, Byte.valueOf("1"));
        } else {
            // 当前用户不是战局创建者
            matchService.addUser(matchId, userDTO, Byte.valueOf("0"));

            // (1)向好友发送客户端信息
            curData.put("friend", userDTO);
            result.setMsgData(new ResultData(curData));
            sendMessageToUser(matchRecordDTO.getUserId(), new TextMessage(JSON.toJSONString(result)));

            // (2)向客户端发送好友信息
            UserDTO friendDto = userService.getUserDTOById(matchRecordDTO.getUserId());
            curData.replace("friend", friendDto);
            result.setMsgData(new ResultData(curData));
            sendMessageToUser(userId, new TextMessage(JSON.toJSONString(result)));
        }
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) {
        MatchService matchService = applicationContext.getBean(MatchService.class);

        String userId = (String) session.getAttributes().get("MATCH_USER_ID");
        JSONObject jsonObject = JSON.parseObject(message.getPayload().toString());
        String msgType = jsonObject.getString("msgType");
        JSONObject msgData = jsonObject.getJSONObject("msgData");

        // 客服端发送消息类型为A-0时，表示战局发起者点击开始对战，通知战局内所有用户
        if (msgType.equals("A-0")) {
            String matchId = msgData.getString("matchId");
            MatchRecordDTO match = matchService.getMatchByMatchId(matchId);

            Message result = new Message();
            result.setMsgID(UUIDUtil.getUUID());
            result.setMsgType("A-0");
            result.setMsgDesc("开始对战");
            result.setMsgData(null);

            sendMessageToList(match.getUserList(), new TextMessage(JSON.toJSONString(result)));
        }


        if (msgType.equals("A")) {
            // 客户端请求出题，根据战局Id和题目索引获取战局信息
            String matchId = msgData.getString("matchId");
            Integer no = msgData.getInteger("no");

            // (1) 根据战局ID获取战局记录，进而获取战局题目
            matchService.addRequestQuestionCount(matchId);
            MatchRecordDTO match = matchService.getMatchByMatchId(matchId);
            QuestionMultipleChoiceVO questionMultipleChoiceVO = match.getQuestionList().get(no - 1);

            // (2) 向客户端发送消息，表明出题成功
            if (match.getRequestQuestionUserCount() == match.getUserFactCount()) {
                Message result = new Message();
                result.setMsgID(UUID.randomUUID().toString());
                result.setMsgType("B");
                Map<String, Object> curData = new HashMap<>();
                curData.put("question", questionMultipleChoiceVO);
                result.setMsgData(new ResultData(curData));
                result.setMsgDesc("出题成功");
                sendMessageToList(match.getUserList(), new TextMessage(JSON.toJSONString(result)));
                matchService.initRequestQuestionCount(matchId);
            }
        } else if (msgType.equals("B")) {
            // 客户端请求计算分数，同时需要返回给对手
            String matchId = msgData.getString("matchId");
            String correctAnswer = msgData.getString("correctAnswer");
            String userAnswer = msgData.getString("userAnswer");
            Integer timeLeft = msgData.getInteger("timeLeft");
            Integer questionIndex = msgData.getInteger("no");

            // 存储用户学点消耗到数据库
            Integer amount = 10 - timeLeft;
            Byte isTrue;
            if (userAnswer.equals(correctAnswer)) {
                isTrue = Byte.valueOf("1");
            } else {
                isTrue = Byte.valueOf("0");
            }
            matchService.saveLpConsumeRecord(matchId, userId, questionIndex, userAnswer, amount, isTrue);

            // 计算分数
            int score;
            if (correctAnswer.equals(userAnswer)) {
                score = timeLeft * 20;
            } else {
                score = 0;
            }

            // 向客户端发送消息
            Message result = new Message();
            result.setMsgID(UUID.randomUUID().toString());
            result.setMsgType("C-1");
            Map<String, Object> curData = new HashMap<>();
            curData.put("score", score);
            result.setMsgData(new ResultData(curData));
            result.setMsgDesc("发送给用户的成绩");
            sendMessageToUser(userId, new TextMessage(JSON.toJSONString(result)));

            result.setMsgType("C-2");
            curData.put("answer", userAnswer);
            result.setMsgDesc("发送给对手的成绩");
            for (UserDTO userDTO : matchService.getMatchByMatchId(matchId).getUserList()) {
                String userDTOId = userDTO.getUserId();
                if (!userDTOId.equals(userId))
                    sendMessageToUser(userDTOId, new TextMessage(JSON.toJSONString(result)));
            }
        }
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws IOException {
        if (session.isOpen()) {
            session.close();
        }

        // (1) 从当前在线用户列表中删除用户
        String userId = (String) session.getAttributes().get("MATCH_USER_ID");
        users.remove(userId);

        // (2) 获得该用户所在的好友对战 战局信息
        MatchService matchService = applicationContext.getBean(MatchService.class);
        MatchRecordDTO match = matchService.getMatchByUserId(userId);
        if (match != null) {
            // 战局创建者退出战局
            if (userId.equals(match.getUserId())) {
                List<UserDTO> userDTOList = match.getUserList();

                // 通知战局中的另一方，告知其战局创建者已经退出
                Message result = new Message();
                result.setMsgID(UUID.randomUUID().toString());
                result.setMsgType("Z-2");
                result.setMsgData(null);
                result.setMsgDesc("战局创建者退出");
                for (UserDTO user : userDTOList) {
                    if (!user.getUserId().equals(userId)) {
                        WebSocketSession webSocketSession = users.get(user.getUserId());
                        if (webSocketSession != null && webSocketSession.isOpen()) {
                            sendMessageToUser(user.getUserId(), new TextMessage(JSON.toJSONString(result)));
                        }
                    }
                }
                matchService.removeMatchByMatchId(match.getMatchRecordId());
            } else {
                // 战局中的被邀请的一方已经退出，向当前战局创建者发送消息
                Message result = new Message();
                result.setMsgID(UUID.randomUUID().toString());
                result.setMsgType("Z-3");
                result.setMsgData(null);
                result.setMsgDesc("被邀请好友退出");
                sendMessageToUser(match.getUserId(), new TextMessage(JSON.toJSONString(result)));

                // 清除战局中相关信息，同时需要数据库删除对应战局用户信息
                matchService.removeUser(userId, match.getMatchRecordId());
            }
        }
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

    private void sendMessageToUser(String userID, TextMessage message) {
        if (users.get(userID) == null) return;

        WebSocketSession session = users.get(userID);
        if (!session.isOpen()) return;

        try {
            session.sendMessage(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessageToList(List<UserDTO> list, TextMessage message) {
        for (UserDTO userDTO : list) {
            String userId = userDTO.getUserId();
            if (users.get(userId) == null) continue;
            WebSocketSession session = users.get(userId);
            if (!session.isOpen()) continue;

            try {
                session.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
