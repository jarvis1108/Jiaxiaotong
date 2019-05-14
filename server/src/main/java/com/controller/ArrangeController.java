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

    //     查询用户已预约的时间
    //     http://localhost:8888/GetArrange?userID=ll
    @GetMapping(value = "GetArrange")
    public String GetArrange (String userID){
        Arrange arrange = arrangeRepository.findByUserID(userID);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String arrangeTime = sdf.format(arrange.getarrangeTime()) + "-" + arrange.getarrangeTimeIndex();
        return arrangeTime;
    }

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

    public static Date getThisWeekSunday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getThisWeekMonday(date));
        cal.add(Calendar.DATE, 6);
        return cal.getTime();
    }

    public static Date getNextWeekSunday(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getThisWeekMonday(date));
        cal.add(Calendar.DATE, 13);
        return cal.getTime();
    }


    //    获取不可用时间
    //    http://localhost:8888/GetTimeList?userID=ll
    @GetMapping(value = "GetTimeList")
    public List<String> GetTimeList (String userID){

        User user = userRepository.findByUserID(userID);
        String teacherID = user.getteacherID();

        Date dt = new Date();
        dt.setHours(23);
        dt.setMinutes(59);
        dt.setSeconds(59);
        Date startDate = getThisWeekSunday(dt);
        Date endDate = getNextWeekSunday(dt);
        List<Arrange> arranges = arrangeRepository.findByTeacherIDAndArrangeTimeBetween(teacherID, startDate, endDate);

        //"2019-05-12-0",4
        Map<String, Integer> arrangeTimes = new HashMap<String, Integer>();
        String arrangeTime;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Arrange arrange:arranges){
            arrangeTime = sdf.format(arrange.getarrangeTime()) + "-" + arrange.getarrangeTimeIndex();
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
            if(entry.getValue() == MAXARRANGE){
                res.add(entry.getKey());
            }
        }
        return res;

    }

    //     新建预约
    //     http://localhost:8888/NewArrange?userID=ll&arrangeDate=2019-05-20&arrangeTimeIndex=0
    @GetMapping(value = "NewArrange")
    public Boolean NewArrange (String userID, String arrangeDate, int arrangeTimeIndex){
        Boolean arrangeResult=false;
        try{
            User user = userRepository.findByUserID(userID);
            String teacherID = user.getteacherID();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date arrangeTime = sdf.parse(arrangeDate);

            //检查是否已有预约
            //与Leave方法冲突，前端限制预约数目
            //Arrange arrange = arrangeRepository.findByUserID(userID);
            //if(arrange. != null){
            //   return arrangeResult;
            //}

            //检查该时段预约数目
            List<Arrange> arranges = arrangeRepository.findByTeacherIDAndArrangeTimeAndArrangeTimeIndex(teacherID, arrangeTime, arrangeTimeIndex);
            if(arranges.size() < MAXARRANGE){
                Arrange newArrange = new Arrange(arrangeTime , teacherID, userID, arrangeTimeIndex);
                arrangeRepository.save(newArrange);
                arrangeResult = true;
            }
            return arrangeResult;
        }
        catch (Exception e){
            return arrangeResult;
        }
    }

    //     请假
    //     http://localhost:8888/Leave?userID=ll&changeTime=2019-05-21&changeTimeIndex=1
    @GetMapping(value = "Leave")
    public Boolean Leave (String userID, String changeTime, int changeTimeIndex){
        Boolean leaveResult = false;
        Boolean changeResult = false;
        try{
            Arrange arrangeBefore = arrangeRepository.findByUserID(userID);
            String arrangeIDBefore = arrangeBefore.getarrangeID();
            changeResult = NewArrange (userID, changeTime, changeTimeIndex);
            if(changeResult){
                arrangeRepository.delete(arrangeBefore);
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
