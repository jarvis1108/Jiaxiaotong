package com.dxtwangxiao.strongestsuperscholar.module.system.dao;

import com.dxtwangxiao.strongestsuperscholar.module.mall.vo.BackOrderRecordVO;
import com.dxtwangxiao.strongestsuperscholar.module.system.vo.BackUserBaseInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 程志强
 * @date 2018/10/11 22:42
 * @Description TODO
 */
@Repository
public interface BackUserBaseInfoVORepository extends CrudRepository<BackUserBaseInfo, String>, JpaSpecificationExecutor<BackUserBaseInfo> {

    /**
     * 功能描述: 根据当前用户id查找行数据（唯一）
     *
     * @return:
     * @auther: 程志强
     * @date: 2018/10/11 23:06
     */
    BackUserBaseInfo findByUserId(String userId);
}
