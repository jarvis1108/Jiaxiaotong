package com.controller;
import java.util.ArrayList;
import java.util.List;
import com.entity.*;
import com.repository.*;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private ForumRepository forumRepository;

//    评论
//    http://localhost:8888/GiveComment?userId=ll&forumId=4&commentCon=niceAgain
    @GetMapping(value = "GiveComment")
    public Boolean GiveComment(String forumId,String userId,String commentCon) throws ParseException {
        Boolean GiveCommentResult=false;
        int forumId1=Integer.parseInt(forumId);
        try{
//          评论数加一
            Forum forum=forumRepository.findByForumID(forumId1);
            forum.setcommentNum(forum.getcommentNum()+1);
            forumRepository.save(forum);

//          添加评论
            Comment comment=new Comment(userId,forumId1,commentCon);
            commentRepository.save(comment);

            GiveCommentResult=true;
            return GiveCommentResult;
        }
        catch (Exception e){
            return GiveCommentResult;
        }

    }



//    我的评论
//    http://localhost:8888/MyComment?userId=ll
    @GetMapping(value = "MyComment")
    public Map<String, Object> myComment(String userId) {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Comment> comments = commentRepository.findByUserID(userId);
        map.put("comments",comments);
        return map;
    }


//    某一帖子的评论
//    http://localhost:8888/Forum_Comment?forumId=4
    @GetMapping(value = "Forum_Comment")
    public List<Comment> Forum_Comment(String forumId) throws ParseException {
        int forumId1=Integer.parseInt(forumId);
        List<Comment> comments =commentRepository.findByForumID(forumId1);

        return comments;
    }

}
