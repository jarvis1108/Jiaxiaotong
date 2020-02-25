package com.dxtwangxiao.strongestsuperscholar.module.userManager;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.dxtwangxiao.strongestsuperscholar.module.mall.dao.OrderRecordRepository;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.BackOrderRecordService;
import com.dxtwangxiao.strongestsuperscholar.module.mall.service.MallService;
import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.OrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.module.match.entity.MatchRecordUser;
import com.dxtwangxiao.strongestsuperscholar.module.match.service.MatchRecordUserService;
import com.dxtwangxiao.strongestsuperscholar.module.system.dao.BackUserBaseInfoVORepository;
import com.dxtwangxiao.strongestsuperscholar.module.system.entity.UserCoinDetail;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.BackUserBaseInfoService;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.BackUserDetaiService;
import com.dxtwangxiao.strongestsuperscholar.module.system.service.UserCoinDetailService;
import com.dxtwangxiao.strongestsuperscholar.module.system.vo.BackUserBaseInfo;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/14 18:33
 * @Description TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired
    BackOrderRecordService backOrderRecordService;
    @Autowired
    BackUserBaseInfoVORepository backUserBaseInfoVORepository;
    @Autowired
    BackUserBaseInfoService backUserBaseInfoService;
    @org.junit.Test
    public void test(){

    }

}
