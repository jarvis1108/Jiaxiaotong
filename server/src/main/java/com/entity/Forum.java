package com.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="forum")
public class Forum {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int forumID;
    private String userID;
    private Date postTime;
    private String forumConten;
    private int likeNumber;
    private int commentNum;


    public Forum(){};
    public Forum(int forumID ){
        this.forumID=forumID;
    }
    public Forum(String userID, Date postTime,String forumConten){
        this.userID=userID;
        this.forumID=forumID;
        this.postTime = postTime;
        this.forumConten=forumConten;
    }
    public Forum(int forumID, String userID, Date postTime,String forumConten,
                 int likeNumber, int commentNum){
        this.userID=userID;
        this.forumID=forumID;
        this.postTime=postTime;
        this.forumConten=forumConten;
        this.likeNumber=likeNumber;
        this.commentNum=commentNum;
    }

    public int getforumID() {
        return forumID;
    }

    public String getuserID() {
        return userID;
    }


    public Date getpostTime() {
        return postTime;
    }
    public void setpostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getforumConten() {
        return forumConten;
    }
    public void setforumConten(String forumConten) {
        this.forumConten = forumConten;
    }

    public int getlikeNumber() {
        return likeNumber;
    }
    public void setlikeNumber(int likeNumber) {
        this.likeNumber = likeNumber;
    }

    public int getcommentNum() {
        return commentNum;
    }
    public void setcommentNum(int commentNum) {
        this.commentNum = commentNum;
    }
}
