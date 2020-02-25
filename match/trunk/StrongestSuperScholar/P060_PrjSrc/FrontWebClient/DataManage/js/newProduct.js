var newProductButton = my$("newGood-submit");
var productInfo = {};
newProductButton.onclick = function(){
	productInfo.productName = my$("good-Name").value;
	productInfo.productNo = my$("good-No").value;
	productInfo.productType = my$("good-Type").value;
	productInfo.paymentType = my$("good-PayType").value;
	productInfo.unitOfNumerator = my$("good-Numerator").value;
	productInfo.unitOfDenominator = my$("good-Denominator").value;
	productInfo.productPrice = my$("good-Price").value;
	productInfo.productDesc = my$("good-Info").value;
	//productInfo.remark = my$("good-Remark").value;
	productInfo.beginTime=my$("good-StartTime").value;
	productInfo.endTime = my$("good-EndTime").value;
	productInfo.isValid = my$("good-isValid").value;
	
	var reqData = FuncCommBnsApp.funcGeneralRequestData({
        	reqId:"1",
        	reqType:"BAM_PRO_010_ProductQuery",
        	reqUserInfo:{
        		userId:"1"
        	},
        	reqParam:productInfo,
        	reqPageInfo:{
        		
        	}
       });
        FuncCommJQuery.FuncAjaxRequest({
        	strType:"POST",
        	strUrl:"/api/v1/bam/productManage",
        	objData:reqData,
        	funcPrsForSuccess:function(res,textStatues){
        		alert("新增商品成功!");
        		my$("good-Name").value = "";
				my$("good-No").value = "";
				my$("good-Type").value = "";
				my$("good-PayType").value = "";
				my$("good-Numerator").value = "";
				my$("good-Denominator").value = "";
				my$("good-Price").value = "";
				my$("good-Info").value = "";
				my$("good-StartTime").value = "";
				my$("good-EndTime").value = "";
				my$("good-isValid").value = "";
				my$("good-Remark").value = "";
        	},
        	funcPrsForFail:function(res){
        		console.log("fail"+res);
        	}
        })
}
