package com.repository;

import com.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    Teacher findByTeacherID(String teacherId);
    Teacher findByTeacherNameAndSchoolID(String teacherName,String schoolId);
}