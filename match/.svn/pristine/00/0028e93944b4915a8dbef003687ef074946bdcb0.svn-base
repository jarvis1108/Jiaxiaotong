function toScan(){
    console.log("获取二维码成功");
    var authUrl = "";
    var objReqData = FuncCommBnsApp.funcGeneralRequestData({

        reqType: "QFL_LOG_010_getAuthUrl",
        reqId: "",
        strType: "GET",
        reqParam: {
        },
        reqUserInfo: {
            userId: '1'
        },
        reqPageInfo: {
            pageSize: 5,
            curPage: 1
        }

    });
    console.log("获取二维码成功");
    FuncCommJQuery.FuncAjaxRequest({
        strType: "GET",
        strUrl: "/api/v1/question/questionForLibLogin/getAuthUrl",
        objData: objReqData,
        dataType: "json",
        funcPrsForSuccess: function (res) {
            console.log("获取二维码成功");
            authUrl = res.resResult.curData.authUrl;
             window.location.href = authUrl;//跳转到二维码界面
            console.log(JSON.stringify(res));
        },
        funcPrsForFail: function (res) {
            console.log("获取二维码失败");
            console.log(res);

        }

    })
}