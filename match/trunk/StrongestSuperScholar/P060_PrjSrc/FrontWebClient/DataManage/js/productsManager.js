
var productUp = function(obj){
	var list = obj.parentNode.parentNode.cells;
	
	console.log(list[12].innerHTML);
	if(list[10].innerHTML=="1")
	{
		return;
	}
	var reqData = FuncCommBnsApp.funcGeneralRequestData({
		reqId:"1",
		reqType:"BAM_PRO_010_ProductUpOrDown",
		reqUserInfo:{
			userId:"1"
		},
		reqParam:{
			productNo:list[0].innerHTML
		}
	});
	FuncCommJQuery.FuncAjaxRequest({
        strType:"POST",
        strUrl:"/api/v1/bam/productManage/upOrDown/"+list[12].innerHTML,
        objData:reqData,
        funcPrsForSuccess:function(res,textStatues){
        	list[10].innerHTML = "有效";
        	console.log("success"+res);
        },
        funcPrsForFail:function(res){
        	console.log("fail"+res);
        }
    })
}

var productDown = function(obj){
	var list = obj.parentNode.parentNode.cells;
	
	console.log(list[12].innerHTML);
	if(list[10].innerHTML=="0")
	{
		return;
	}
	var reqData = FuncCommBnsApp.funcGeneralRequestData({
		reqId:"1",
		reqType:"BAM_PRO_010_ProductUpOrDown",
		reqUserInfo:{
			userId:"1"
		},
		reqParam:{
			productNo:list[0].innerHTML
		}
	});
	FuncCommJQuery.FuncAjaxRequest({
        strType:"POST",
        strUrl:"/api/v1/bam/productManage/upOrDown/"+list[12].innerHTML,
        objData:reqData,
        funcPrsForSuccess:function(res,textStatues){
        	list[10].innerHTML = "无效";
        	console.log("success"+res);
        },
        funcPrsForFail:function(res){
        	console.log("fail"+res);
        }
    })
}
var lists = document.getElementById("goodsInfoModifyDiv").getElementsByClassName("good-stem");
var productModify = function(obj){
	var product = obj.parentNode.parentNode.cells;
	document.getElementById("goodsInfoModifyDiv").className = "goodsInfoModifyDiv";
	document.getElementById("goodsManagerDiv").className = "hide";
	document.getElementById("goods-Check-Div").className = "hide";
	console.log(lists.length);
	for(var i = 0;i<11;i++){
		lists[i].textContent = product[i].textContent;
		lists[i].value = product[i].textContent;
	}
	lists[11].textContent = product[12].textContent;
}

var cancelModify = function(){
	document.getElementById("goodsInfoModifyDiv").className = "hide";
	document.getElementById("goodsManagerDiv").className = "goodsManagerDiv";
	document.getElementById("goods-Check-Div").className = "goods-Check-Div";
}

var submitModification = function(){
	var reqData = FuncCommBnsApp.funcGeneralRequestData({
		reqId:"1",
		reqType:"BAM_PRO_010_ProductModify",
		reqUserInfo:{
			userId:"1"
		},
		reqParam:{
			productPrice:lists[2].value,
			productType:lists[3].value,
			unitOfNumerator:lists[4].value,
			unitOfDenominator:lists[5].value,
			paymentType:lists[6].value,
			beginTime:lists[7].value,
			endTime:lists[8].value
		}
	});
	console.log(reqData);
	FuncCommJQuery.FuncAjaxRequest({
        strType:"POST",
        strUrl:"/api/v1/bam/productManage/update/"+lists[11].textContent,
        objData:reqData,
        funcPrsForSuccess:function(res,textStatues){
        	console.log("success"+res);
        	cancelModify();
        },
        funcPrsForFail:function(res){
        	console.log("fail"+res);
        }
    })
}

var getGoods = function(page){
	var inputs = document.getElementById("goods-Check-Div").getElementsByTagName("input");
	var value = [];
	for(var i=0;i<3;i++){
		if(inputs[i].value==""){
			value[i]=null;
		}else{
			value[i]=inputs[i].value;
		}
		console.log(value[i]);
	}
	if(inputs[2].value=="无效")
	{
		value[2] = "0";
	}else if(inputs[2].value == "有效")
	{
		value[2] = "1";
	}
	layui.use(['laytpl','laypage', 'layer'], function () {
        var laytpl = layui.laytpl;
        var laytpl = layui.laytpl;
        var laypage = layui.laypage,
		layer = layui.layer;
        var reqData = FuncCommBnsApp.funcGeneralRequestData({
        	reqId:"32b8caa6-8a0c-4ee4-bc74-87242d2f4ee5",
        	reqType:"BAM_PRO_010_ProductQuery",
        	reqUserInfo:{
        		userId:"1"
        	},
        	strType:"GET",
        	reqParam:{
        		productType:value[0],
        		paymentType:value[1],
        		isValid:value[2],
        		productId:null,
        		productNo:null,
		        productName:null,
		        productPrice:null,
		        unitOfNumerator:null,
		        unitOfDenominator:null,
		        paymentType:null,
		        beginTime:null,
		        endTime:null,
		        lastUpdUser:null
        	},
        	reqPageInfo:{
        		pageSize:10,
        		curPage:page
        	}
        });
        FuncCommJQuery.FuncAjaxRequest({
        	strType:"GET",
        	strUrl:"/api/v1/bam/productManage/list",
        	objData:reqData,
        	funcPrsForSuccess:function(res,textStatues){
        		var resultData = res.resResult.curData;
        		productElement = resultData.totalElements;
                var getTpl = goodsManagerModel.innerHTML;
                var goodsManagerTable = my$("goodsManagerTable");
                console.log(productElement);
                var code = '<table class="layui-table">';
                code += '<thead><tr><th>商品编码</th><th>商品名称</th><th>单价</th><th>商品类型</th><th>计量分子</th><th>计量分母</th><th>可支付类型</th><th>生效时间</th><th>失效时间</th><th>维护人</th><th>商品状态</th><th>操作</th></tr></thead><tbody>';
                
                laytpl(getTpl).render(resultData, function (html) {
                   	goodsManagerTable.innerHTML = code + html + '</tbody></table>';
                });
                laypage.render({
					elem:"goodsPage",
					count:productElement,
					jump: function (obj,first){
						if(first){				
							return;
						}
						getGoods(obj.curr);
					}
				});
        	},
        	funcPrsForFail:function(res){
        		console.log("fail"+res);
        	}
        })
   	})
}
console.log("page:"+ productElement)
//layui.use(['laypage', 'layer'], function(){
//	var laypage = layui.laypage,
//	layer = layui.layer;
//	laypage.render({
//		elem:"goodsPage",
//		count:productElement,
//		jump: function (obj,first){
//			if(first){
//				return;
//			}
//			getGoods(obj.curr);
//			
//		}
//	})
//})