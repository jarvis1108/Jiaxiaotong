package com.controller;

import com.entity.User;
import com.entity.School;
import com.entity.Teacher;
import com.repository.UserRepository;
import com.repository.SchoolRepository;
import com.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@RestController
public class UserController {


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    private TeacherRepository teacherRepository;

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
                    user0.getlikePost());
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
                    examTime1,user0.getlikePost());
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


//    验证码绑定驾校和老师
    @GetMapping(value = "GetSchoolInfo")
    public Map<String, Object> GetSchoolInfo(String userId,String identyCode){
        Map<String, Object> map = new HashMap<String, Object>();

        User user=userRepository.findByUserID(userId);
        String schoolID = String.valueOf(Integer.valueOf(identyCode.substring(0, 4)).intValue());
        String teacherID = String.valueOf(Integer.valueOf(identyCode.substring(4)).intValue());

        user.setschoolID(schoolID);
        user.setteacherID(teacherID);
        userRepository.save(user);
        School school=schoolRepository.findBySchoolID(schoolID);
        Teacher teacher=teacherRepository.findByTeacherID(teacherID);

        map.put("schoolName", school.getschoolName());
        map.put("schoolId", school.getschoolID());
        map.put("teacherName", teacher.getteacherName());
        map.put("teacherId", teacher.getteacherID());

        return map;
    }




}
