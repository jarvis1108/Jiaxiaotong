package com.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String userID;
    private String userName;
    private String schoolID;
    private String teacherID;
    private Date examTime;
    private String likePost;



    public User(){};
//    public User(String userID ){
//        this.userID=userID;
//    }
    public User(String userID, String userName, String schoolID, String teacherID, Date examTime){
        this.userID=userID;
        this.userName=userName;
        this.schoolID=schoolID;
        this.teacherID = teacherID;
        this.examTime = examTime;
    }
    public User(String userID, String userName, String schoolID, String teacherID, Date examTime,
                String likePost){
        this.userID=userID;
        this.userName=userName;
        this.schoolID=schoolID;
        this.teacherID = teacherID;
        this.examTime = examTime;
        this.likePost=likePost;
    }

    public String getuserID() {
        return userID;
    }

    public String getuserName() {
        return userName;
    }
    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getschoolID() {
        return schoolID;
    }
    public void setschoolID(String schoolID) {
        this.schoolID = schoolID;
    }

    public String getteacherID() {
        return teacherID;
    }
    public void setteacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public Date getexamTime() {
        return examTime;
    }
    public void setexamTime(Date examTime) {
        this.examTime = examTime;
    }


    public String getlikePost() {
        return likePost;
    }
    public void setlikePost(String likePost) {
        this.likePost = likePost;
    }

}
