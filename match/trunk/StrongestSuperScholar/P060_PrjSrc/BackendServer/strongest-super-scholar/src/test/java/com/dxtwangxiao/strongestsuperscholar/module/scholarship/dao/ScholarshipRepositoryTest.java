package com.dxtwangxiao.strongestsuperscholar.module.scholarship.dao;

import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.ScholarshipRepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.entity.Scholarship;
import com.dxtwangxiao.strongestsuperscholar.web.util.UUIDUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created By Devin
 * 2018-09-28 下午 03:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ScholarshipRepositoryTest {

    @Autowired
    private ScholarshipRepository scholarshipRepository;

    @Test
    public void findAll() {
    }

    @Test
    public void save() {
        String uuid = UUIDUtil.getUUID();

        Scholarship scholarship = new Scholarship();
        scholarship.setScholarshipId(uuid);
        scholarship.setScholarshipNo(uuid);
        scholarship.setScholarshipCode(uuid);
        scholarship.setAmount(50);
        scholarship.setAcquiredGP(4000);
        scholarship.setCreateTime(new Timestamp(new Date().getTime()));
        scholarship.setLastUpdTime(new Timestamp(new Date().getTime()));
        scholarship.setIsValid(Byte.valueOf("1"));

        System.out.println(scholarshipRepository.save(scholarship));
    }

}