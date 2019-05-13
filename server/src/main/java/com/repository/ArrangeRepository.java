package com.repository;

import com.entity.Arrange;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ArrangeRepository extends JpaRepository<Arrange,Integer> {
    List<Arrange> findByTeacherIDAndArrangeTimeBetween(String teacherID, Date startDate, Date endDate);
    List<Arrange> findByTeacherIDAndArrangeTimeAndArrangeTimeIndex(String teacherID, Date arrangeTime, int arrangeTimeIndex);
    Arrange findByUserID(String userID);
}