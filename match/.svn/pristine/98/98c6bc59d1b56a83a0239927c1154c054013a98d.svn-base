package com.dxtwangxiao.strongestsuperscholar.module.community.dao;

import com.dxtwangxiao.strongestsuperscholar.module.community.entity.SpecialTraining;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpecialTrainingRepository extends CrudRepository<SpecialTraining, String> {

	Page<SpecialTraining> findAll(Pageable pageable);

	List<SpecialTraining> findAll();

	SpecialTraining findBySpecialTrainingId(String specialTrainingId);

	SpecialTraining save(SpecialTraining specialTraining);

	void deleteBySpecialTrainingId(String specialTrainingId);

	/**
	 * 根据用户id获取其所属的训练营信息。
	 *
	 * @param userId
	 * @return
	 */

	SpecialTraining findByUserId(String userId);

	/**
	 * 根据当前用户获得属于其训练营下的用户list
	 *
	 * @param lastUserId
	 * @return
	 */
	List<SpecialTraining> findByLastUserId(String lastUserId);
}
