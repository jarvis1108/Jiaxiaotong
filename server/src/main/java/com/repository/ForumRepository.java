package com.repository;


import java.util.ArrayList;
import java.util.List;
import com.entity.Forum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForumRepository extends JpaRepository<Forum,Integer> {
    List<Forum> findByUserID(String userid);
    List<Forum> findAll();
    Forum findByForumID(int forumid);
    List<Forum> findByForumContenLike(String content);
}

