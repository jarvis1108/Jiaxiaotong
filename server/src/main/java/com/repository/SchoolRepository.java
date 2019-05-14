package com.repository;

import com.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Integer> {
    School findBySchoolID(String schoolId);
    School findBySchoolName(String schoolName);
}
