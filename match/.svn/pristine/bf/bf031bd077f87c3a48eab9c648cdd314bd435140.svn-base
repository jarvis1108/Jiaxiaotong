package com.dxtwangxiao.strongestsuperscholar.module.community.dao;

import com.dxtwangxiao.strongestsuperscholar.module.community.entity.CommunityRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CommunityRoleRepository extends CrudRepository<CommunityRole, String> {
    Page<CommunityRole> findAll(Pageable pageable);

    List<CommunityRole> findAll();

    CommunityRole findByCommunityRoleId(String communityRoleId);

    CommunityRole save(CommunityRole communityRole);

    @Transactional
    void deleteByCommunityRoleId(String communityRoleId);
}
