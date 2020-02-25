var mainPage = 1;     //页码
var myPageSize = 10;  //pageSize
var orderIdQuery = null;
var OrderWechatNameQuery = null;
var totalNumber = 100;
var orderInfoList = [];//保存基本订单信息
//初始加载
orderInfoPage();
// 获取订单基本信息
function orderInfoPage() {
    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage;
        layer = layui.layer;
        var data = [];
        var objReqData = FuncCommBnsApp.funcGeneralRequestData({

            reqType: "BAM_USR_010_GetOrderRecordInfoList",
            reqId: "",
            strType: "GET",
            reqParam: {
                orderRecordID: orderIdQuery,
                wechatName: OrderWechatNameQuery
            },
            reqUserInfo: {
                userId: '1'
            },
            reqPageInfo: {
                pageSize: myPageSize,
                curPage: mainPage
            }

        });
        FuncCommJQuery.FuncAjaxRequest({
            strType: "GET",
            strUrl: "/api/v1/bam/user/orderRecord/list",
            objData: objReqData,
            dataType: "json",
            funcPrsForSuccess: function (res) {
                totalNumber = res.resResult.curData.totalElements;
                console.log(mainPage);
                //执行一个laypage实例
                laypage.render({
                    elem: 'orderPage',
                    count: totalNumber,
                    jump: function (obj, first) {
                        if (first) {
                            mainPage = 1;
                        } else {
                            mainPage = obj.curr;
                        }
                        var objReqData = FuncCommBnsApp.funcGeneralRequestData({

                            reqType: "BAM_USR_010_GetOrderRecordInfoList",
                            reqId: "",
                            strType: "GET",
                            reqParam: {
                                orderRecordID: orderIdQuery,
                                wechatName: OrderWechatNameQuery
                            },
                            reqUserInfo: {
                                userId: '1'
                            },
                            reqPageInfo: {
                                pageSize: myPageSize,
                                curPage: mainPage
                            }

                        });
                        FuncCommJQuery.FuncAjaxRequest({
                            strType: "GET",
                            strUrl: "/api/v1/bam/user/orderRecord/list",
                            objData: objReqData,
                            dataType: "json",
                            funcPrsForSuccess: function (res) {
                                var resultData = res.resResult.curData;
                                orderInfoList = resultData.content;
                                data = res.resResult.curData.content;
                                if (data) {
                                    document.getElementById('tableOrder').innerHTML = function () {
                                        console.log(data);
                                        var arr = [],
                                            thisData = data.concat().splice(0, obj.limit);
                                        console.log(thisData);

                                        layui.each(thisData, function (index, item) {
                                            var button1 = "<a role='button' onclick='toOrderUpdate(" + index + ")'><button>修改</button></a>";
                                            var button2 = "<a role='button' onclick='toOrderUpdate(" + index + ")'><button>有效/无效</button></a>";
                                            arr.push('<tr>');
                                            arr.push('<td>' + item.orderRecordID + '</td>');
                                            arr.push('<td>' + item.productName + '</td>');
                                            arr.push('<td>' + item.productAmount + '</td>');
                                            arr.push('<td>' + item.productPrice + '</td>');
                                            arr.push('<td>' + item.sumPrice + '</td>');
                                            arr.push('<td>' + item.actualSumPrice + '</td>');
                                            arr.push('<td>' + item.purchaseWay + '</td>');
                                            arr.push('<td>' + item.wechatName + '</td>');
                                            arr.push('<td>' + item.createTime + '</td>');
                                            arr.push('<td>' + item.status + '</td>');
                                            arr.push('<td>' + item.isValid + '</td>');
                                            arr.push('<td>' + button1 + " " + button2 + '</td>');
                                            // arr.push('<td> <button onclick="toOrderUpdate({{index}})">修改</button> <button style="margin-left: 5px">有效/无效</button></td>');
                                            arr.push('</tr>');
                                        });
                                        return arr.join('');
                                    }();
                                } else {
                                    console.log("数据为空");
                                }
                            },
                            funcPrsForFail: function (res) {
                                console.log(res);
                            }
                        })
                    }
                });
            },
            funcPrsForFail: function (res) {
                console.log(res);
            }
        })
    });

}
function toOrderUpdate(index) {
    hideAll();
    orderManagerLeftDiv.className = "show";
    orderUpdateDiv.className = "show";
    document.getElementById("upOrderRecordID").value = orderInfoList[index].orderRecordID;
    document.getElementById("upProductName").value = orderInfoList[index].productName;
    document.getElementById("upProductAmount").value = orderInfoList[index].productAmount;
    document.getElementById("upProductPrice").value = orderInfoList[index].productPrice;
    document.getElementById("upSumPrice").value = orderInfoList[index].sumPrice;
    document.getElementById("upActualSumPrice").value = orderInfoList[index].actualSumPrice;
    document.getElementById("upPurchaseWay").value = orderInfoList[index].purchaseWay;
    document.getElementById("upOrderWechatName").value = orderInfoList[index].wechatName;
    document.getElementById("upCreateTime").value = orderInfoList[index].createTime;
    document.getElementById("upStatus").value = orderInfoList[index].status;
    document.getElementById("upIsValid").value = orderInfoList[index].isValid;
}
function toSaveOrder() {
    var upOrderRecordID = document.getElementById("upOrderRecordID").value;
    var upProductName = document.getElementById("upProductName").value;
    var upProductAmount = document.getElementById("upProductAmount").value;
    var upProductPrice = document.getElementById("upProductPrice").value;
    var upSumPrice = document.getElementById("upSumPrice").value;
    var upActualSumPrice = document.getElementById("upActualSumPrice").value;
    var upPurchaseWay = document.getElementById("upPurchaseWay").value;
    var upStatus = document.getElementById("upStatus").value;
    var upIsValid = document.getElementById("upIsValid").value;
    var objReqData = FuncCommBnsApp.funcGeneralRequestData({

        reqType: "BAM_USR_010_UpdateOrderRecordInfo",
        reqId: "",
        reqUserInfo: {
            userId: '1'
        },
        reqParam: {
            productAmount: upProductAmount,
            sumPrice: upSumPrice,
            actualSumPrice: upActualSumPrice,
            purchaseWay: upPurchaseWay,
            status: upStatus,
            isValid: upIsValid,
            productName: upProductName,
            productPrice: upProductPrice
        },
        reqPageInfo: {
            pageSize: 2,
            curPage: 1
        }

    });
    FuncCommJQuery.FuncAjaxRequest({
        strType: "POST",
        strUrl: "/api/v1/bam/user/orderRecord/update//" + upOrderRecordID,
        objData: objReqData,
        dataType: "json",
        funcPrsForSuccess: function (res) {

            var resultData = res.resResult.curData;
            console.log(JSON.stringify(resultData));
            // userBaseInfoList=resultData.backUserBaseInfoList;  
        },
        funcPrsForFail: function (res) {
            console.log(res);

        }

    })


}
function toCloseOrder() {
    console.log("执行了关闭操作");
    hideAll();
    document.getElementById("firstMenu").innerText = "订单管理";
    document.getElementById("secondMenu").innerText = "订单信息查询与修改";
    orderManagerLeftDiv.className = "show";
    orderManagerDiv.className = "show";
    // 获取订单基本信息,关闭的时候更新界面数据
    orderInfoPage();
}
function toSearchOrder() {
    orderIdQuery = document.getElementById("orderIdQuery").value || null;
    OrderWechatNameQuery = document.getElementById("OrderWechatNameQuery").value || null;
    orderInfoPage();

}