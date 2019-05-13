package com.entity;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Table(name="arrange")

public class Arrange {

    @Id//主键
    @GeneratedValue(generator = "uuid")//主键生成策略使用UUID
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String arrangeID;

    private Date arrangeTime;
    private String teacherID;
    private String userID;
    private int arrangeTimeIndex;

    public Arrange(){};
    public Arrange(Date arrangeTime , String teacherID, String userID, int arrangeTimeIndex){
        this.arrangeTime=arrangeTime;
        this.teacherID=teacherID;
        this.userID=userID;
        //arrangeTimeIndex 预约时段，0表示上午，1表示下午
        this.arrangeTimeIndex=arrangeTimeIndex;

    }

    public Arrange(String userID){
        this.userID=userID;
    }


    public String getarrangeID() {
        return arrangeID;
    }
    public void setarrangeID(String arrangeID) {
        this.arrangeID = arrangeID;
    }

    public Date getarrangeTime() {
        return arrangeTime;
    }
    public void setarrangeTime(Date arrangeTime) {
        this.arrangeTime = arrangeTime;
    }

    public String getteacherID() {
        return teacherID;
    }
    public void setteacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getuserID() {
        return userID;
    }
    public void setuserID(String userID) {
        this.userID = userID;
    }

    public int getarrangeTimeIndex() {
        return arrangeTimeIndex;
    }
    public void setarrangeTimeIndex(int arrangeTimeIndex) {
        this.arrangeTimeIndex = arrangeTimeIndex;
    }

}
