
var FuncCommJQuery = FuncCommJQuery || {};

/**
 * 
 * @param {Object} objReqParam.strServiceUrl
 * @param {Object} objReqParam.strEnvironmentType
 * @param {Object} objReqParam.strType
 * @param {Object} objReqParam.strUrl
 * @param {Object/String} objReqParam.objData
 * @param {String} objReqParam.strDataType
 * @param {String} objReqParam.funcPrsForSuccess
 * @param {String} objReqParam.funcPrsForFail
 * @param {String} objReqParam.funcPrsForComplete
 * @param {Object} objOpt
 * @param {Object} objOpt.blIsKeyString
 */
FuncCommJQuery.FuncAjaxRequest = function(objReqParam,objOpt)
{
	console.log(objReqParam);
	objReqParam = objReqParam || {};
	objReqParam.strType = objReqParam.strType || "GET";
	objReqParam.strDataType = objReqParam.strDataType || "json";


	if(objReqParam.async == false){
		objReqParam.async = false;
	}else{
		objReqParam.async = true;
	}
	
	
	objReqParam.funcPrsForSuccess = objReqParam.funcPrsForSuccess ||
	    function(data)
	    {
	    	console.log(data);    	
	    };
	objReqParam.funcPrsForFail = objReqParam.funcPrsForFail ||
	    function(data)
	    {
	    	console.log(data);    	
	    };
	objReqParam.funcPrsForComplete = objReqParam.funcPrsForComplete ||
	    function(data)
	    {
	    	//console.log(data);    	
	    };

	objOpt = objOpt || {};
	objOpt.blIsKeyString = (objOpt.blIsKeyString == null?true:objOpt.blIsKeyString);
	console.log(objReqParam.objData);
	console.log(objReqParam.async);
	jQuery.ajax({
		type: objReqParam.strType,
		url: "http://120.79.191.240:8089/strongestscholar" + objReqParam.strUrl,
		data: objReqParam.objData,
		async: objReqParam.async,
        crossDomain: true,
        xhrFields: {withCredentials: true},
        contentType: "application/json; charset=utf-8",
		cache: false,
		//dataType: objReqParam.strDataType,
		success: objReqParam.funcPrsForSuccess,
		error: objReqParam.funcPrsForFail,
		complete: objReqParam.funcPrsForComplete
	});
};