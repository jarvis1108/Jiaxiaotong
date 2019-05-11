package com.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="comment")
public class Comment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int commentID;
    private String userID;
    private int forumID;
    private String commentCon;


    public Comment(){};
    public Comment(int commentID ){
        this.commentID=commentID;
    }
    public Comment(String userID,int forumID,String commentCon){
        this.userID=userID;
        this.forumID=forumID;
        this.commentCon=commentCon;
    }
    public Comment(int commentID, String userID,int forumID,String commentCon){
        this.userID=userID;
        this.forumID=forumID;
        this.commentID=commentID;
        this.commentCon=commentCon;
    }

    public int getcommentID() {
        return commentID;
    }

    public String getuserID() {
        return userID;
    }

    public String getcommentCon() {
        return commentCon;
    }
    public void setcommentCon(String commentCon) {
        this.commentCon = commentCon;
    }

    public int getforumID() {
        return forumID;
    }


}
