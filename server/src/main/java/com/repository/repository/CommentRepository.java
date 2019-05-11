package com.repository;



import java.util.ArrayList;
import java.util.List;

import com.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
    List<Comment> findByUserID(String userid);
    List<Comment> findByForumID(int forumid);
}

