package com.repository;

import com.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Integer> {
    Message findByUserID(String userId);

}
