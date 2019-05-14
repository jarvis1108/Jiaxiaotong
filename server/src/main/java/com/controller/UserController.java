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
    public int SetUserInfo(String userId, String userName, String userSchool,
                           String userTeacher, String examTime) throws ParseException {
        int nameChangeResult=0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date examTime1=new Date();
        examTime1=sdf.parse(examTime);

        User user0=userRepository.findByUserID(userId);
        int schoolId=GetSchoolId(userSchool);
        if (schoolId==0){
            return nameChangeResult;
        }

        int teacherId=GetTeacherId(userTeacher,String.valueOf(schoolId));

        if (teacherId==0){
            return nameChangeResult+1;
        }

        User user1 = new User(userId,userName,String.valueOf(schoolId),String.valueOf(teacherId),examTime1,
                user0.getlikePost());
        userRepository.save(user1);

        return nameChangeResult+2;


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
        School school=schoolRepository.findBySchoolID(user.getschoolID());
        Teacher teacher=teacherRepository.findByTeacherID(user.getteacherID());
        user.setschoolID(school.getschoolName());
        user.setteacherID(teacher.getteacherName());
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

    //获取学校名 返回学校名 沒找到返回0
//    @GetMapping(value = "GetSchoolId")
    public int GetSchoolId(String schoolName) throws ParseException {
        try{
            School school=schoolRepository.findBySchoolName(schoolName);
            int schoolID = Integer.valueOf(school.getschoolID()).intValue();
            return schoolID;
        }
        catch (Exception e){
            return 0;
        }
    }

    //获取老师名 返回老师名 沒找到返回0
//    @GetMapping(value = "GetTeacherId")
    public int GetTeacherId(String teacherName,String schoolId) throws ParseException {
        try{
            Teacher teacher=teacherRepository.findByTeacherNameAndSchoolID(teacherName,schoolId);
            System.out.println(teacher.getteacherID());
            int teacherId = Integer.valueOf(teacher.getteacherID()).intValue();
            return teacherId;
        }
        catch (Exception e){
            return 0;
        }
    }


}
