package com.controller;
import java.util.ArrayList;
import java.util.List;
import com.entity.Forum;
import com.entity.User;
import com.repository.ForumRepository;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.UUID;


@RestController
public class ForumController {


    @Autowired
    private ForumRepository forumRepository;

    @Autowired
    private UserRepository userRepository;

//    获取帖子
//    http://localhost:8888/GetForum?
    @GetMapping(value = "GetForum")
    public List<Forum> GetForum() throws ParseException {
        List<Forum> forums =forumRepository.findAll();

        return forums;
    }


//    发帖
//    http://localhost:8888/PublishForums?userId=ll&postTime=1000-02-04&forumConten=aj12
    @GetMapping(value = "PublishForums")
    public Boolean PublishForums(String userId, String postTime,String forumConten) throws ParseException {
        Boolean PublishResult=false;
//        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date postTime1=new Date();
        postTime1=sdf.parse(postTime);
        try{
            Forum forum=new Forum(userId,postTime1,forumConten);
            forumRepository.save(forum);
            PublishResult=true;
            return PublishResult;
        }
        catch (Exception e){
            return PublishResult;
        }

    }


//    我的发帖
//    http://localhost:8888/MyForums?userId=h
    @GetMapping(value = "MyForums")
    public List<Forum> MyForums(String userId) throws ParseException {
        List<Forum> forums =forumRepository.findByUserID(userId);

        return forums;
    }


//    删帖
//    http://localhost:8888/DeleteForums?forumId=13
    @GetMapping(value = "DeleteForums")
    public Boolean DeleteForums(String forumId) throws ParseException {
        Boolean DeleteResult=false;
        int forumId1=Integer.parseInt(forumId);
        try{
            Forum forum=new Forum(forumId1);
            forumRepository.delete(forum);
            DeleteResult=true;
            return DeleteResult;
        }
        catch (Exception e){
            return DeleteResult;
        }

    }


//    点赞
//    http://localhost:8888/GiveLike?forumId=4&userId=ll
    @GetMapping(value = "GiveLike")
    public Boolean GiveLike(String forumId,String userId) throws ParseException {
        Boolean GiveLikeResult=false;
        int forumId1=Integer.parseInt(forumId);
        try{
//          点赞数加一
            Forum forum=forumRepository.findByForumID(forumId1);
            forum.setlikeNumber(forum.getlikeNumber()+1);
            forumRepository.save(forum);

//          点赞贴关联到user
            User user=userRepository.findByUserID(userId);
            String s=user.getlikePost()+forumId+"-";
            user.setlikePost(s);
            userRepository.save(user);

            GiveLikeResult=true;
            return GiveLikeResult;
        }
        catch (Exception e){
            return GiveLikeResult;
        }

    }


//    我的点赞
//    http://localhost:8888/MyLike?userId=ll
    @GetMapping(value = "MyLike")
    public List<Forum> MyLike(String userId) throws ParseException {
        User user=userRepository.findByUserID(userId);
        String s =user.getlikePost();
        String[] f = s.split("-");
        int[] forumNums=new int[f.length];
        for(int i=0;i<f.length;i++){
            forumNums[i]=Integer.parseInt(f[i]);
        }

        List<Forum> forums=new ArrayList<>();
        for(int i=0;i<f.length;i++){
            forums.add(forumRepository.findByForumID(forumNums[i]));
        }
        return forums;
    }


}
