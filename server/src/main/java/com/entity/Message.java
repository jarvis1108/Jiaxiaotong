package com.entity;


import javax.persistence.*;


@Entity
@Table(name="message")
public class Message {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String messageID;
    private String schoolID;
    private String teacherID;
    private String userID;
    private String message_cont;
    private boolean message_recev;

    public Message(){};
    public Message(String messageID ,String schoolID ,String teacherID,String userID ,String messageCont ,boolean message_recev ){
        this.messageID=messageID;
        this.schoolID=schoolID;
        this.teacherID=teacherID;
        this.userID=userID;
        this.message_cont=message_cont;
        this.message_recev=message_recev;
    }

    public Message(String userID){
        this.userID=userID;
    }


    public String getmessageID() {
        return messageID;
    }
    public void setmessageID(String messageID) {
        this.messageID = messageID;
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

    public String getuserID() {
        return userID;
    }
    public void setuserID(String userID) {
        this.userID = userID;
    }

    public String getmessage_cont() {
        return message_cont;
    }
    public void setmessage_cont(String message_cont) {
        this.message_cont = message_cont;
    }

    public boolean getmessage_recev() {
        return message_recev;
    }
    public void setmessage_recev(boolean message_recev) {
        this.message_recev = message_recev;
    }
}
