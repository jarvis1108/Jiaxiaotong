package com.controller;

import com.entity.School;
import com.entity.Teacher;
import com.entity.User;
import com.entity.Arrange;
import com.repository.ArrangeRepository;
import com.repository.UserRepository;


import org.aspectj.apache.bcel.classfile.Constant;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class ArrangeController {

    @Autowired
    private ArrangeRepository arrangeRepository;
    @Autowired
    private UserRepository userRepository;

    private static int MAXARRANGE = 4;


    public static Date getThisWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // 获得当前日期是一个星期的第几天
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK);
        if (1 == dayWeek) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
        cal.setFirstDayOfWeek(Calendar.MONDAY);
        // 获得当前日期是一个星期的第几天
        int day = cal.get(Calendar.DAY_OF_WEEK);
        // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
        cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
        return cal.getTime();
    }

    public static Date getNextWeekMonday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getThisWeekMonday(date));
        cal.add(Calendar.DATE, 7);
        return cal.getTime();
    }

    public static Date getThisWeekSunday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getThisWeekMonday(date));
        cal.add(Calendar.DATE, 6);
        return cal.getTime();
    }

    //    获取可用时间
    @GetMapping(value = "GetTimeList")
    public List<String> GetTimeList (String userId){

        User user = userRepository.findByUserID(userId);
        String teacherID = user.getteacherID();
        Date dt = new Date();
        Date startDate = getNextWeekMonday(dt);
        Date endDate = getThisWeekMonday(startDate);
        List<Arrange> arranges = arrangeRepository.findByTeacherIDAndArrangeTimeBetween(teacherID, startDate, endDate);

        //"2019-05-12-0",4
        Map<String, Integer> arrangeTimes = new HashMap<String, Integer>();
        String arrangeTime;
        for (Arrange arrange:arranges){
            arrangeTime = arrange.getarrangeTime().toString() + "-" + arrange.getarrangeTimeIndex();
            //累计每个时段预约数目
            if(arrangeTimes.get(arrangeTime)!=null){
                arrangeTimes.put(arrangeTime,arrangeTimes.get(arrangeTime)+1);
            }
            else {
                arrangeTimes.put(arrangeTime,1);
            }
        }

        List<String> res = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : arrangeTimes.entrySet()) {
            if(entry.getValue() < MAXARRANGE){
                res.add(entry.getKey());
            }
        }
        return res;

    }

    //     新建预约
    @GetMapping(value = "NewArrange")
    public Boolean NewArrange (String userID, Date arrangeTime, int arrangeTimeIndex){
        Boolean arrangeResult=false;
        try{
            User user = userRepository.findByUserID(userID);
            String teacherID = user.getteacherID();
            //检查该时段预约数目
            List<Arrange> arranges = arrangeRepository.findByTeacherIDAndArrangeTimAndArrangeTimeIndex(teacherID, arrangeTime, arrangeTimeIndex);
            if(arranges.size() < MAXARRANGE){
                Arrange arrange = new Arrange(arrangeTime , teacherID, userID, arrangeTimeIndex);
                arrangeRepository.save(arrange);
                arrangeResult = true;
            }
            return arrangeResult;
        }
        catch (Exception e){
            return arrangeResult;
        }
    }

    //     请假
    @GetMapping(value = "Leave")
    public Boolean Leave (String userID, Date changeTime, int changeTimeIndex){
        Boolean leaveResult = false;
        Boolean changeResult = false;
        try{
            changeResult = NewArrange (userID, changeTime, changeTimeIndex);
            if(changeResult){
                Arrange arrange = arrangeRepository.findByUserID(userID);
                arrangeRepository.delete(arrange);
                leaveResult = true;
                return leaveResult;
            }else{
                return leaveResult;
            }
        }
        catch (Exception e){
            return leaveResult;
        }
    }

}
