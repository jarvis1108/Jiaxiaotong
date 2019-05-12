package com.controller;

import com.entity.Message;
import com.repository.MessageRepository;

import java.util.HashMap;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

@Autowired
private MessageRepository messageRepository;
    // 获取通告 以及 看过了沒
    @GetMapping(value = "GetMessage")
    public Map<String, Object> GetMessage(String userId){
        Map<String, Object> map = new HashMap<String, Object>();
        Message message = messageRepository.findByUserID(userId);
        map.put("message", message.getmessage_cont());
        map.put("message_recev", message.getmessage_recev());
        return map;
    }


    // 上传已经看过的信息
    @GetMapping(value = "SetRecev")
    public Map<String, Object> SetRecev(String userId){
        Map<String, Object> map = new HashMap<String, Object>();
        Message message = messageRepository.findByUserID(userId);
        message.setmessage_recev(true);
        messageRepository.save(message);
        message = messageRepository.findByUserID(userId);
        map.put("message_recev", message.getmessage_recev());
        return map;
    }



}
