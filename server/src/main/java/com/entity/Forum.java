package com.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="forum")
public class Forum implements Comparable<Forum>{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int forumID;
    private String userID;
    private Date postTime;
    private String forumConten;
    private int likeNumber;
    private int commentNum;
    private boolean userLike=false; // 用于对某一用户是否点赞判断

//    @Lob
//    @Basic(fetch = FetchType.LAZY)
//    @Column(name=" picture", columnDefinition="longblob", nullable=true)
    private String picture;


    public Forum(){};
    public Forum(int forumID ){
        this.forumID=forumID;
    }
    public Forum(String userID, Date postTime,String forumConten,String picture){
        this.userID=userID;
        this.postTime = postTime;
        this.forumConten=forumConten;

        this.picture=picture;
    }
    public Forum(int forumID, String userID, Date postTime,String forumConten,
                 int likeNumber, int commentNum,String picture,boolean userLike){
        this.userID=userID;
        this.forumID=forumID;
        this.postTime=postTime;
        this.forumConten=forumConten;
        this.likeNumber=likeNumber;
        this.commentNum=commentNum;

        this.userLike=userLike;
        this.picture=picture;
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


    public String getpicture() {
        return picture;
    }
    public void setpicture(String picture) {
        this.picture = picture;
    }

    public boolean getuserLike() {
        return userLike;
    }
    public void setuserLike(boolean userLike) {
        this.userLike = userLike;
    }

    @Override
    public int compareTo(Forum forum) {
        return forum.getlikeNumber()- this.likeNumber;
    }
}
