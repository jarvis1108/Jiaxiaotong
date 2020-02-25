package com.dxtwangxiao.strongestsuperscholar.web.websocket.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchService;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceVO;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.UserService;
import com.dxtwangxiao.strongestsuperscholar.web.dto.MatchRecordDTO;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.util.SortUtil;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResultData;
import com.dxtwangxiao.strongestsuperscholar.web.websocket.common.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 群PK WebSocket处理类，真正的匹配及出题业务逻辑在此
 * <p>
 * Created By Devin
 * 2018-08-29 上午 09:05
 */
@Component
public class GroupWebSocketHandler implements WebSocketHandler {

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
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // 1.从session中获取当前用户ID和战局Id
        String userId = (String) session.getAttributes().get("MATCH_USER_ID");
        String matchId = (String) session.getAttributes().get("MATCH_ID");

        // 2.根据用户ID获取其信息
        UserService userService = applicationContext.getBean(UserService.class);
        UserDTO userDTO = userService.getUserDTOById(userId);

        // 3.如果用户存在，则将其加入到在线用户列表
        users.put(userId, session);

        // 4.判断战局是否达到最大人数
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

        // 5.更新战局信息
        if (matchRecordDTO.getUserId().equals(userId)) {
            matchService.addUser(matchId, userDTO, Byte.valueOf("1"));
        } else {
            List<UserDTO> userDTOList = matchRecordDTO.getUserList();
            // 将自己信息发给战局内的其他用户
            Message message = new Message();
            message.setMsgType("A-1");
            message.setMsgDesc("用户信息");
            message.setMsgID(UUID.randomUUID().toString());
            Map<String, Object> curData = new HashMap<>();
            curData.put("user", userDTO);
            curData.put("matchId", matchId);
            message.setMsgData(new ResultData(curData));
            sendMessageToList(userDTOList, new TextMessage(JSON.toJSONString(message)));

            // 将战局中的创建者及其他用户信息发给自己
            UserDTO creator = userService.getUserDTOById(matchRecordDTO.getUserId());
            message.setMsgType("A-2");
            curData.remove("user");
            curData.put("creator", creator);
            curData.put("userList", userDTOList);
            sendMessageToUser(userId, new TextMessage(JSON.toJSONString(message)));

            // 将用户添加到战局用户列表
            matchService.addUser(matchId, userDTO, Byte.valueOf("0"));
        }

        // 6.初始化战局各用户分数
        matchRecordDTO.getMatchScoreMap().put(userId, 0);
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        String userId = (String) session.getAttributes().get("MATCH_USER_ID");

        JSONObject jsonObject = JSON.parseObject(message.getPayload().toString());
        String msgType = jsonObject.getString("msgType");
        JSONObject msgData = jsonObject.getJSONObject("msgData");

        MatchService matchService = applicationContext.getBean(MatchService.class);
        // 战局发起者点击开始对战，通知战局内所有用户
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

        // 战局用户请求出题
        if (msgType.equals("A")) {
            String matchId = msgData.getString("matchId");
            Integer no = msgData.getInteger("no");

            // (1)根据战局ID获取战局记录，进而获取战局题目
            matchService.addRequestQuestionCount(matchId);
            MatchRecordDTO match = matchService.getMatchByMatchId(matchId);
            QuestionMultipleChoiceVO questionMultipleChoiceVO = match.getQuestionList().get(no - 1);

            // (2)向客户端发送消息，表明出题成功
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
        }

        // 客户端请求计算分数
        if (msgType.equals("B")) {
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

            // 计算分数并存储
            int score;
            if (correctAnswer.equals(userAnswer)) {
                score = timeLeft * (200 / 10);
            } else {
                score = 0;
            }

            matchService.addAnsweredCountForMatch(matchId);
            matchService.addScore(matchId, userId, score);


            // 将用户成绩返回给当前用户
            Message result = new Message();
            result.setMsgID(UUID.randomUUID().toString());
            result.setMsgType("C");
            Map<String, Object> curData = new HashMap<>();
            curData.put("score", score);
            result.setMsgData(new ResultData(curData));
            result.setMsgDesc("用户成绩");
            sendMessageToUser(userId, new TextMessage(JSON.toJSONString(result)));

            MatchRecordDTO match = matchService.getMatchByMatchId(matchId);
            // 所有用户已经答完题,通知所有用户可以请求下一题
            if (match.getAnsweredCount() == match.getUserList().size()) {
                Message result2 = new Message();
                result2.setMsgID(UUIDUtil.getUUID());
                result2.setMsgType("D");
                result2.setMsgDesc("可以请求下一题");
                sendMessageToList(match.getUserList(), new TextMessage(JSON.toJSONString(result2)));

                // 初始化答完题人数为零
                matchService.initAnsweredCountForMatch(matchId);
            }
        }

        // 发送最终成绩给所有用户
        if (msgType.equals("C")) {
            String matchId = msgData.getString("matchId");
            Message result = new Message();
            result.setMsgID(UUIDUtil.getUUID());
            result.setMsgType("E");
            result.setMsgDesc("战局各用户的成绩");
            Map<String, Object> curData = new HashMap<>();
            Map<String, Integer> matchScoreMap = matchService.getMatchByMatchId(matchId).getMatchScoreMap();
            Map<String, Integer> resultMap = SortUtil.scoreSort(matchScoreMap);
            curData.put("matchScoreMap", resultMap);
            curData.put("matchUserMap", matchService.getMatchByMatchId(matchId).getMatchScoreUser());
            result.setMsgData(new ResultData(curData));
            sendMessageToUser(userId, new TextMessage(JSON.toJSONString(result)));
        }
    }

    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {

        System.out.println("Closed......");

        // (1) 从当前在线用户列表中删除用户
        String userId = (String) session.getAttributes().get("MATCH_USER_ID");
        users.remove(userId);

        // (2) 通知战局中其他用户，告知其断开连接并删除战局记录
        MatchService matchService = applicationContext.getBean(MatchService.class);
        MatchRecordDTO match = matchService.getMatchByUserId(userId);
        if (match != null) {
            if (match.getUserFactCount() == 2) {
                List<UserDTO> userDTOList = match.getUserList();
                // 战局中的一方已经退出，向当前其他用户发送消息
                Message result = new Message();
                result.setMsgID(UUID.randomUUID().toString());
                result.setMsgType("Z-2");
                result.setMsgData(null);
                result.setMsgDesc("战局一方已经退出");
                for (UserDTO user : userDTOList) {
                    if (!user.getUserId().equals(userId)) {
                        sendMessageToUser(user.getUserId(), new TextMessage(JSON.toJSONString(result)));
                        users.remove(userId);
                    }
                }
            }
            matchService.removeMatchByMatchId(match.getMatchRecordId());
        }
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

    private void sendMessageToUser(String userId, TextMessage message) {
        if (users.get(userId) == null) return;
        WebSocketSession session = users.get(userId);
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
