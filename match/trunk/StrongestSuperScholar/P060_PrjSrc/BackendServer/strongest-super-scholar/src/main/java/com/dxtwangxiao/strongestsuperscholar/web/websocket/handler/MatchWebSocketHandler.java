package com.dxtwangxiao.strongestsuperscholar.web.websocket.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchService;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.UserService;
import com.dxtwangxiao.strongestsuperscholar.web.dto.MatchRecordDTO;
import com.dxtwangxiao.strongestsuperscholar.module.question.vo.QuestionMultipleChoiceVO;
import com.dxtwangxiao.strongestsuperscholar.web.dto.UserDTO;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResultData;
import com.dxtwangxiao.strongestsuperscholar.web.websocket.common.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 匹配对战 WebSocket处理类，真正的匹配及出题业务逻辑在此
 * <p>
 * Created by Devin
 * 2018-07-25 下午 03:10
 */
@Component
public class MatchWebSocketHandler implements WebSocketHandler {

    // 启动类set方法注入，解决无法注入Bean的问题
    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    private static final Map<String, WebSocketSession> users;    // 用户列表
    private static final Map<Integer, List<UserDTO>> matchPool; // 匹配池

    static {
        users = new ConcurrentHashMap<>();
        matchPool = new ConcurrentHashMap<>();
        // 创建11个等级（小学初中1-9年级，高中，大学）的匹配队列
        for (int i = 1; i <= 11; i++) {
            List<UserDTO> userList = Collections.synchronizedList(new LinkedList<>());
            matchPool.put(i, userList);
        }
    }

    /**
     * 新增socket，实际上就是建立了一个新的连接
     * 连接建立后，处理业务逻辑
     *
     * @param session 当前会话
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // 添加相关服务信息
        UserService userService = applicationContext.getBean(UserService.class);
        MatchService matchService = applicationContext.getBean(MatchService.class);

        // 1.从session中获取当前用户ID
        String userId = (String) session.getAttributes().get("MATCH_USER_ID");

        // 2.根据用户ID获取其信息
        UserDTO userDTO = userService.getUserDTOById(userId);

        // 3. 将用户加入到在线用户列表
        users.put(userId, session);

        // 4.开始匹配
        List<UserDTO> userList = matchPool.get(userDTO.getInternalLevel());
        if (userList.isEmpty()) {
            userList.add(userDTO);
        } else {
            // (1) 匹配成功，将对手从列表中移除
            UserDTO opponent = userList.get(0);
            userList.remove(0);

            // (2) 创建战局记录，并将用户及对手加入到战局中
            MatchRecordDTO matchRecordDTO = matchService.createMatchRecord(userId, Byte.valueOf("0"));
            matchService.addUser(matchRecordDTO.getMatchRecordId(), userDTO, Byte.valueOf("1"));
            matchService.addUser(matchRecordDTO.getMatchRecordId(), opponent, Byte.valueOf("0"));

            // (3)向客户端发送消息，表明匹配成功
            Message result = new Message();
            result.setMsgType("A");
            result.setMsgDesc("匹配成功");
            result.setMsgID(UUID.randomUUID().toString());
            Map<String, Object> curData = new HashMap<>();
            curData.put("opponent", opponent);
            curData.put("matchId", matchRecordDTO.getMatchRecordId());
            result.setMsgData(new ResultData(curData));
            sendMessageToUser(userId, new TextMessage(JSON.toJSONString(result)));

            // (4)向对手发送消息，表明匹配成功
            curData.replace("opponent", userDTO);
            sendMessageToUser(opponent.getUserId(), new TextMessage(JSON.toJSONString(result)));
        }
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        String userId = (String) session.getAttributes().get("MATCH_USER_ID");

        JSONObject jsonObject = JSON.parseObject(message.getPayload().toString());
        String msgType = jsonObject.getString("msgType");
        JSONObject msgData = jsonObject.getJSONObject("msgData");

        MatchService matchService = applicationContext.getBean(MatchService.class);

        if (msgType.equals("A")) {
            // 消息类型为A时，表示客户端请求出题，根据试题索引，获取战局记录
            String matchId = msgData.getString("matchId");
            Integer no = msgData.getInteger("no");

            // (1)根据战局ID获取战局记录，进而获取战局题目
            matchService.addRequestQuestionCount(matchId);
            MatchRecordDTO match = matchService.getMatchByMatchId(matchId);
            QuestionMultipleChoiceVO questionMultipleChoiceVO = match.getQuestionList().get(no - 1);

            // (2)等待所有用户均请求出题，则向客户端发送消息，表明出题成功
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

        if (msgType.equals("B")) {
            // 客户端请求计算该题分数，并返回给客户端和对手
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
                score = timeLeft * (200 / 10);
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
            result.setMsgDesc("发送给客户端的成绩");
            sendMessageToUser(userId, new TextMessage(JSON.toJSONString(result)));

            result.setMsgType("C-2");
            curData.put("answer", userAnswer);
            result.setMsgDesc("发送给对手的成绩");
            for (UserDTO userDTO : matchService.getMatchByMatchId(matchId).getUserList()) {
                String userDTOId = userDTO.getUserId();
                if (!userDTOId.equals(userId)) {
                    sendMessageToUser(userDTOId, new TextMessage(JSON.toJSONString(result)));
                }
            }
        }
    }

    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {

    }

    /**
     * 连接关闭后的处理
     *
     * @param session     当前会话
     * @param closeStatus 关闭状态
     * @throws Exception 当前异常
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        if (session.isOpen()) {
            session.close();
        }

        MatchService matchService = applicationContext.getBean(MatchService.class);
        UserService userService = applicationContext.getBean(UserService.class);

        // (1) 从当前在线用户列表中删除用户，如果用户在匹配队列，则从队列中删除
        String userId = (String) session.getAttributes().get("MATCH_USER_ID");
        UserDTO userDTO = userService.getUserDTOById(userId);
        users.remove(userId);

        List<UserDTO> userList = matchPool.get(userDTO.getInternalLevel());
        if (userList.contains(userDTO)) {
            userList.remove(userDTO);
        }

        // (2) 通知战局中其他用户，告知其断开连接并删除战局记录
        MatchRecordDTO match = matchService.getMatchByUserId(userId);
        if (match != null) {
            if (match.getUserFactCount() == 2) {
                List<UserDTO> userDTOList = match.getUserList();
                // 战局中的一方已经退出，向当前其他用户发送消息
                Message result = new Message();
                result.setMsgID(UUID.randomUUID().toString());
                result.setMsgType("Z");
                result.setMsgData(null);
                result.setMsgDesc("战局一方已经退出");
                for (UserDTO user : userDTOList) {
                    if (!user.getUserId().equals(userId)) {
                        WebSocketSession webSocketSession = users.get(user.getUserId());
                        if (webSocketSession != null && webSocketSession.isOpen()) {
                            sendMessageToUser(user.getUserId(), new TextMessage(JSON.toJSONString(result)));
                        }
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

    private void sendMessageToUser(String userID, TextMessage message) {
        if (users.get(userID) == null) {
            return;
        }

        WebSocketSession session = users.get(userID);
        if (!session.isOpen()) {
            return;
        }

        try {
            session.sendMessage(message);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void sendMessageToList(List<UserDTO> list, TextMessage message) {
        for (UserDTO userDTO : list) {
            String userId = userDTO.getUserId();
            if (users.get(userId) == null) {
                continue;
            }
            WebSocketSession session = users.get(userId);
            if (!session.isOpen()) {
                continue;
            }

            try {
                session.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}