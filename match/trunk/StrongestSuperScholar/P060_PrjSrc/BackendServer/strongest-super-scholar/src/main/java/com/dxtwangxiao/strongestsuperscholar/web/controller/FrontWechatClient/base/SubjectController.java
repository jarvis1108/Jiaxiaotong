package com.dxtwangxiao.strongestsuperscholar.web.controller.FrontWechatClient.base;

import com.alibaba.fastjson.JSONObject;
import com.dxtwangxiao.strongestsuperscholar.module.base.service.SubjectService;
import com.dxtwangxiao.strongestsuperscholar.web.dto.SubjectDTO;
import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.util.WebUtil;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import com.dxtwangxiao.strongestsuperscholar.web.vo.RequestInfo;
import com.dxtwangxiao.strongestsuperscholar.web.vo.ResponseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 科目 控制器
 * <p>
 * Created By Devin
 * 2018-09-03 下午 07:47
 */
@RestController
@RequestMapping("/api/v1/base/subject")
public class SubjectController {

	@Autowired
	private SubjectService subjectService;

	@GetMapping("/list")
	public ResponseInfo listSubjectByGrade(HttpServletRequest request) {
		RequestInfo requestInfo = WebUtil.parseGetRequest(request);
		JSONObject reqParam = requestInfo.getReqParam();
		String gradePhaseId = reqParam.getString("gradePhaseId");
		String gradeId = reqParam.getString("gradeId");
		if (gradePhaseId == null || gradeId == null) {
			throw new StrongestScholarException(CommonError.REQ_PARAM_ERR.getCode(), CommonError.REQ_PARAM_ERR.getMessage());
		}

		JSONObject jsonObject = new JSONObject();
		List<SubjectDTO> subjectDTOList = subjectService.getByGrade(gradePhaseId, gradeId);
		jsonObject.put("subjectList", subjectDTOList);
		return new ResponseInfo(requestInfo, jsonObject);
	}

}
