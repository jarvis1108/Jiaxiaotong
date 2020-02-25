package com.dxtwangxiao.strongestsuperscholar.module.mall.dao;

import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.BackOrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.OrderRecordVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/18 20:24
 * @Description TODO
 */
public interface BackOrderRecordVORepository extends CrudRepository<BackOrderRecordVO, String>, JpaSpecificationExecutor<BackOrderRecordVO> {

    /**
     * 功能描述: 根据订单号id搜索
     *
     * @auther: 程志强
     * @date: 2018/10/18 21:57
     */
    BackOrderRecordVO findByOrderRecordID(String orderRecordId);

}
