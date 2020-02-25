
var FuncCommBnsApp = FuncCommBnsApp || {};


FuncCommBnsApp.ObjWebCfg =
	{
		//环境类型，Product：生产类型，Dvlp：开发环境
		strEnvironmentType: "Dvlp"
	};

FuncCommBnsApp.funcGetCurAjaxType = function (strType) {
	var strRetVal = "";

	strType = strType || "GET";

	strRetVal = (this.strEnvironmentType == "Product" ? strType : "GET");

	return strRetVal;
};

FuncCommBnsApp.funcGetCurAjaxUrl = function (arrUrl) {
	var strRetVal = "";

	if (typeof (arrUrl) == "object" && arrUrl instanceof Array) {
		if (this.strEnvironmentType == "Proudct") {
			strRetVal = "http://strongestscholar.dxtwangxiao.com:8089/strongestscholar/" + arrUrl[0];
		}
		else {
			strRetVal = arrUrl[1];
		}
	}
	else {
		strRetVal = "http://strongestscholar.dxtwangxiao.com:8089/strongestscholar/ " + arrUrl;
	}

	return strRetVal;
};
FuncCommBnsApp.randomNum4 =function() {
	return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);
  }

FuncCommBnsApp.funcGeneralUUID = function () {
	return (this.randomNum4() + this.randomNum4() + '-' + this.randomNum4() + '-' + this.randomNum4() + '-' + this.randomNum4() + '-' + this.randomNum4() + this.randomNum4() + this.randomNum4())
}


/**
 * @summary 实现功能:得到请求数据
 * @param {object}   objCurData  			当前数据
 * @param {string}   objCurData.reqType  	当前数据.请求类型
 * @param {string}   objCurData.reqID  		当前数据.请求ID，空则由系统自动生成
 * @param {string}   objCurData.curUserID	当前数据.当前登陆用户ID
 * @param {object}   objCurData.reqParam	当前数据.请求参数
 * @param {object}   objCurData.reqRefData	当前数据.请求相关数据
 * @param {object}   objCurData.pageSize	当前数据.页面最大记录数
 * @param {object}   objCurData.curPage		当前数据.当前页序号，从1开始的
 * @param {object}   objOpt  				当前杂项
 * @param {Boolean}  objOpt.blIsKeyString	当前杂项.是否生成blIsKeyString格式
 * @returns {object} objRetVal 装配好的记录数
 * 
 */
FuncCommBnsApp.funcGeneralRequestData = function (objCurData, objOpt) {
	var objRetVal = {};

	if (!objCurData) {
		return objRetVal;
	}

	// 参数预处理
	objCurData.reqType = objCurData.reqType || "DefaultReqType";
	objCurData.reqID = objCurData.reqID || this.funcGeneralUUID();
	objCurData.strType = objCurData.strType || "POST";

	objOpt = objOpt || {};
	objOpt.blIsKeyString = (objOpt.blIsKeyString == null ? true : objOpt.blIsKeyString);


	//装配页面信息		
	objRetVal.reqType = objCurData.reqType || "DefaultReqType";
	objRetVal.reqID = objCurData.reqId || this.funcGeneralUUID();
	objRetVal.reqUserInfo = objCurData.reqUserInfo;
	objRetVal.reqParam = objCurData.reqParam || {};
	objRetVal.reqRefData = objCurData.reqRefData || {};
	objRetVal._method = objCurData._method || {};

	
	if ("reqPageInfo" in objCurData) {
		objRetVal.reqPageInfo = {};

		objRetVal.reqPageInfo.pageSize = (objCurData.reqPageInfo.pageSize == null ? 10 : objCurData.reqPageInfo.pageSize);
		objRetVal.reqPageInfo.curPage = (objCurData.reqPageInfo.curPage == null ? 1 : objCurData.reqPageInfo.curPage);

		//补充封装
		//objRetVal.reqPageInfo.pageNum = (objCurData.reqPageInfo.pageNum == null ? 1 : objCurData.reqPageInfo.pageNum);
	}

	if(objCurData.strType=="GET"||objCurData.strType=="get")
	{
		objRetVal.reqUserInfo = JSON.stringify(objRetVal.reqUserInfo);
		objRetVal.reqParam = JSON.stringify(objRetVal.reqParam);
		objRetVal.reqPageInfo = JSON.stringify(objRetVal.reqPageInfo);
		objRetVal.reqRefData = JSON.stringify(objCurData.reqRefData);
	}
	else if(objCurData.strType=="POST"||objCurData.strType=="post"||objCurData.strType=="DELETE")
	{
		console.log(objRetVal);
		objRetVal = JSON.stringify(objRetVal);
		//var obj = JSON.stringify(objRetVal);
	}
	// if (objOpt.blIsKeyString)
	// {
	// 	objRetVal.reqUserInfo = JSON.stringify(objRetVal.reqUserInfo);
	// 	objRetVal.reqParam = JSON.stringify(objRetVal.reqParam);
	// 	objRetVal.reqRefData = JSON.stringify(objRetVal.reqRefData);
	// 	objRetVal.pageInfo = JSON.stringify(objRetVal.pageInfo);
	// }

	return objRetVal;
};