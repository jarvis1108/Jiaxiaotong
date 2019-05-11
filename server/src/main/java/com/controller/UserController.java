package com.controller;

import com.entity.User;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;


@RestController
public class UserController {


    @Autowired
    private UserRepository userRepository;

//    设置个人信息
//    localhost:8888/SetUserInfo?userId=ll&userName=bf&userSchool=cd&userTeacher=as&examTime=1000-02-02
    @GetMapping(value = "SetUserInfo")
    public Boolean SetUserInfo(String userId, String userName, String userSchool,
                               String userTeacher, String examTime) throws ParseException {
        Boolean nameChangeResult=false;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date examTime1=new Date();
        examTime1=sdf.parse(examTime);
        try{
            User user0=userRepository.findByUserID(userId);
            User user1 = new User(userId,userName,userSchool,userTeacher,examTime1,
                    user0.getcommentPost(),user0.getlikePost());
            userRepository.save(user1);
            nameChangeResult=true;
            return nameChangeResult;
        }
        catch (Exception e){
            return nameChangeResult;
        }

    }

//    设置考试时间
//    http://localhost:8888/SetExamTime?userId=ll&examTime=1000-02-04
    @GetMapping(value = "SetExamTime")
    public Boolean SetExamTime(String userId, String examTime) throws ParseException {
        Boolean timeChangeResult=false;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date examTime1=new Date();
        examTime1=sdf.parse(examTime);
        try{
            User user0=userRepository.findByUserID(userId);
            User user1 = new User(userId,user0.getuserName(),user0.getschoolID(),user0.getteacherID(),
                    examTime1, user0.getcommentPost(),user0.getlikePost());
            userRepository.save(user1);
            timeChangeResult=true;
            return timeChangeResult;
        }
        catch (Exception e){
            return timeChangeResult;
        }

    }


//    获取个人信息
    @GetMapping(value = "GetUserInfo")
    public User GetUserInfo(String userId) throws ParseException {
        User user=userRepository.findByUserID(userId);
        return user;
    }
}
