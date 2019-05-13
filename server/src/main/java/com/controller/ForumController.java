package com.controller;
import java.util.*;

import com.entity.Forum;
import com.entity.User;
import com.repository.ForumRepository;
import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;


@RestController
public class ForumController {


    @Autowired
    private ForumRepository forumRepository;

    @Autowired
    private UserRepository userRepository;

//    获取帖子
//    http://localhost:8888/GetForum?userId=ll
    @GetMapping(value = "GetForum")
    public List<Forum> GetForum(String userId) throws ParseException {
        List<Forum> forums =forumRepository.findAll();

        for (Forum f :forums){
            String s=String.valueOf(f.getforumID());
            f.setuserLike(isNotlike(s,userId));
        }

        return forums;
    }


//    发帖
//    http://localhost:8888/PublishForums?userId=ll&postTime=1000-02-04&forumConten=aj12&picture=
    @GetMapping(value = "PublishForums")
    public Boolean PublishForums(String userId, String postTime,String forumConten,
                  String picture) throws ParseException {
        Boolean PublishResult=false;
//        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date postTime1=new Date();
        postTime1=sdf.parse(postTime);
        try{
            Forum forum=new Forum(userId,postTime1,forumConten,picture);

            forumRepository.save(forum);
            PublishResult=true;
            return PublishResult;
        }
        catch (Exception e){
            return PublishResult;
        }

    }


//    我的发帖
//    http://localhost:8888/MyForums?userId=h&userId=
    @GetMapping(value = "MyForums")
    public List<Forum> MyForums(String userId) throws ParseException {
        List<Forum> forums =forumRepository.findByUserID(userId);

        for (Forum o :forums){
            String s=String.valueOf(o.getforumID());
            o.setuserLike(isNotlike(s,userId));
        }


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
        int[] forumNums=new int[f.length-1];
        for(int i=0;i<f.length-1;i++){
            forumNums[i]=Integer.parseInt(f[i+1]);
        }

        List<Forum> forums=new ArrayList<>();
        for(int i=0;i<f.length-1;i++){
            forums.add(forumRepository.findByForumID(forumNums[i]));
        }

        for (Forum r:forums){
            r.setuserLike(true);
        }
        return forums;
    }





//    取消点赞
//    http://localhost:8888/CancelLike?userId=ll&forumId=5
    @GetMapping(value = "CancelLike")
    public Boolean CancelLike(String forumId,String userId) throws ParseException {
        Boolean CancelLikeResult=false;
        int forumId1=Integer.parseInt(forumId);
        try{
//          点赞数减一
            Forum forum=forumRepository.findByForumID(forumId1);
            forum.setlikeNumber(forum.getlikeNumber()-1);
            forumRepository.save(forum);

//          取消点赞贴与user的关联
            User user=userRepository.findByUserID(userId);
            String s=user.getlikePost().replace("-"+forumId+"-","-");
            user.setlikePost(s);
            userRepository.save(user);


            CancelLikeResult=true;
            return CancelLikeResult;
        }
        catch (Exception e){
            return CancelLikeResult;
        }

    }



//   搜索 按点赞数降序s排列
//   localhost:8888/Search?content=fw&userId=
    @GetMapping(value = "Search")
    public List<Forum> Search(String content,String userId ) throws ParseException {
        List<Forum> forums = new ArrayList<Forum>();
        forums = forumRepository.findByForumContenLike("%"+content+"%");
        Collections.sort(forums);

        for (Forum u :forums){
            String s=String.valueOf(u.getforumID());
            u.setuserLike(isNotlike(s,userId));
        }
        return forums;
    }




    //    判断某一用户是否点赞某一帖子  内置函数
//    http://localhost:8888/isNotlike?userId=ll&forumId=4
//    @GetMapping(value = "isNotlike")
    public Boolean isNotlike(String forumId,String userId) throws ParseException {
        Boolean isNotlikeResult=false;
        try{
            User user=userRepository.findByUserID(userId);
            String s=user.getlikePost();
            isNotlikeResult=s.contains(forumId+"-");
            return isNotlikeResult;
        }
        catch (Exception e){
            return isNotlikeResult;
        }

    }
}
