var totalNumber = 100;
var userBaseInfoList = [];// 获取用户基本信息
var mainPage = 1;           //保存用户基本信息的page
var myPageSize = 2;               //设置pageSize
var wechatNameQuery = null;
var lowLPQuery = -1;
var highLPQuery = Infinity;
var lowGPQuery = -1;
var highGPQuery = Infinity;
var lowCoinQuery = -1;
var highCoinQuery = Infinity;
//初始加载
baseInfoPage();
detailInfoPage();
function toBaseUpdate(index) {
    hideAll();
    document.getElementById("userQueryAndUpdateBtn").className = "selected";
    document.getElementById("userDetailQueryBtn").className = "recently";
    userManagerLeftDiv.className = "show";
    userBaseUpdateDiv.className = "show";
    document.getElementById("upUserId").value = userBaseInfoList[index].userId;
    document.getElementById("upWechatName").value = userBaseInfoList[index].wechatName;
    document.getElementById("upCreatTime").value = userBaseInfoList[index].createTime;
    document.getElementById("upLoginTime").value = userBaseInfoList[index].loginTime;
    document.getElementById("upLPAmount").value = userBaseInfoList[index].learningPoint;
    document.getElementById("upGPAmount").value = userBaseInfoList[index].gradePoint;
    document.getElementById("upCPAmount").value = userBaseInfoList[index].coin;
    document.getElementById("upTAmount").value = 0;
    document.getElementById("upGrade").value = userBaseInfoList[index].externalLevel;
    document.getElementById("upExperice").value = userBaseInfoList[index].experience;
    document.getElementById("upMatchAmount").value = userBaseInfoList[index].matchSumCount;
    document.getElementById("upWinAmount").value = userBaseInfoList[index].matchWinCount;
    document.getElementById("upLossAmount").value = userBaseInfoList[index].matchLoseCount;
    document.getElementById("upTieAmount").value = userBaseInfoList[index].matchDogFallCount;

}
function baseInfoPage() {
    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage;
        layer = layui.layer;
        var data = [];
        var objReqData = FuncCommBnsApp.funcGeneralRequestData({

            reqType: "BAM_USR_010_GetUserBaseInfoList",
            reqId: "",
            strType: "GET",
            reqUserInfo: {
                userId: '1'
            },
            reqParam: {
                wechatName: wechatNameQuery,
                minLearningPoint: lowLPQuery,
                maxLearningPoint: highLPQuery,
                minGradePoint: lowGPQuery,
                maxGradePoint: highGPQuery,
                minCoin: lowCoinQuery,
                maxCoin: highCoinQuery
            },
            reqPageInfo: {
                pageSize: myPageSize,
                curPage: mainPage
            }
        });
        FuncCommJQuery.FuncAjaxRequest({
            strType: "GET",
            strUrl: "/api/v1/bam/user/userBaseInfo/list",
            objData: objReqData,
            dataType: "json",
            funcPrsForSuccess: function (res) {
                totalNumber = res.resResult.curData.totalElements;
                //执行一个laypage实例
                laypage.render({
                    elem: 'baseInfoPage',
                    count: totalNumber,
                    jump: function (obj, first) {
                        if (first) {
                            mainPage = 1;
                        } else {
                            mainPage = obj.curr;
                        }
                        var objReqData = FuncCommBnsApp.funcGeneralRequestData({

                            reqType: "BAM_USR_010_GetUserBaseInfoList",
                            reqId: "",
                            strType: "GET",
                            reqUserInfo: {
                                userId: '1'
                            },
                            reqParam: {
                                wechatName: wechatNameQuery,
                                minLearningPoint: lowLPQuery,
                                maxLearningPoint: highLPQuery,
                                minGradePoint: lowGPQuery,
                                maxGradePoint: highGPQuery,
                                minCoin: lowCoinQuery,
                                maxCoin: highCoinQuery
                            },
                            reqPageInfo: {
                                pageSize: myPageSize,
                                curPage: mainPage
                            }
                        });

                        FuncCommJQuery.FuncAjaxRequest({
                            strType: "GET",
                            strUrl: "/api/v1/bam/user/userBaseInfo/list",
                            objData: objReqData,
                            dataType: "json",
                            funcPrsForSuccess: function (res) {
                                var resultData = res.resResult.curData;
                                userBaseInfoList = resultData.content;
                                if (userBaseInfoList) {//判定是否有数据
                                    for (var i = 0; userBaseInfoList && i < userBaseInfoList.length; i++) {
                                        if (resultData.content[i].telephone == null) {
                                            resultData.content[i].telephone = "无";
                                            console.log(resultData.content[i].telephone + "电话号码");
                                        }
                                        if (resultData.content[i].isValid) {
                                            resultData.content[i].isValid = "有效";
                                            console.log(resultData.content[i].isValid + "有效");
                                        }
                                        else {
                                            resultData.content[i].isValid = "无效";
                                        }
                                    }
                                    data = res.resResult.curData.content;
                                    document.getElementById('tableBaseUser').innerHTML = function () {
                                        console.log(data);
                                        var arr = [],
                                            thisData = data.concat().splice(0, obj.limit);
                                        console.log(thisData);
                                        layui.each(thisData, function (index, item) {
                                            var button1 = "<a role='button' onclick='toBaseUpdate(" + index + ")'><button>信息修改</button></a>";
                                            var button2 = "<a role='button' onclick='toLockOrUnlockUser(" + index + ")'><button >有效/无效</button></a>";
                                            arr.push('<tr>');
                                            arr.push('<td>' + item.userId + '</td>');
                                            arr.push('<td>' + item.wechatName + '</td>');
                                            arr.push('<td>' + item.createTime + '</td>');
                                            arr.push('<td>' + item.loginTime + '</td>');
                                            arr.push('<td>' + item.learningPoint + '</td>');
                                            arr.push('<td>' + item.gradePoint + '</td>');
                                            arr.push('<td>' + item.coin + '</td>');
                                            arr.push('<td>' + 0 + '</td>');
                                            arr.push('<td>' + item.matchSumCount + '</td>');
                                            arr.push('<td>' + item.externalLevel + '</td>');
                                            arr.push('<td>' + item.experience + '</td>');
                                            arr.push('<td>' + item.telephone + '</td>');
                                            arr.push('<td>' + item.isValid + '</td>');
                                            arr.push('<td>' + button1 + "  " + button2 + '</td>');
                                            // arr.push('<td> <button onclick="toBaseUpdate({{index}})">信息修改</button><button style="margin-left: 5px">有效/无效</button></td>');
                                            arr.push('</tr>');
                                        });
                                        return arr.join('');
                                    }();
                                }
                                else {
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
//存在问题
function toLockOrUnlockUser(index){
    var Valid;
    if(userBaseInfoList[index].isValid=="有效")
    {
        Valid=1;
    }
    else{
           Valid=0;   
    }
    console.log(userBaseInfoList[index].isValid);

    var objReqData = FuncCommBnsApp.funcGeneralRequestData({
        //  strType: "GET", 
        reqType: "BAM_USR_010_LockOrUnlockUser",
        reqId: "",
        reqParam: {
            isValid: Valid,
        },
    });

    FuncCommJQuery.FuncAjaxRequest({
        strUrl: "/api/v1/bam/user/userBaseInfo/lock/"+userBaseInfoList[index].userId,
        strType: "POST",
        objData: objReqData,
        dataType: "json",
        funcPrsForSuccess: function (res) {
            var resultData = res.resResult.curData;  
            console.log(JSON.stringify(resultData))       
        },
        funcPrsForFail: function (res) {
            console.log(res);
        }
    })
}
function detailInfoPage() {
    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage;
        layer = layui.layer;
        var data = [];
        var objReqData = FuncCommBnsApp.funcGeneralRequestData({

            reqType: "BAM_USR_010_GetUserBaseInfoList",
            reqId: "",
            strType: "GET",
            reqUserInfo: {
                userId: '1'
            },
            reqParam: {
            },
            reqPageInfo: {
                pageSize: myPageSize,
                curPage: mainPage
            }
        });
        FuncCommJQuery.FuncAjaxRequest({
            strType: "GET",
            strUrl: "/api/v1/bam/user/userBaseInfo/list",
            objData: objReqData,
            dataType: "json",
            funcPrsForSuccess: function (res) {
                totalNumber = res.resResult.curData.totalElements;
                laypage.render({
                    elem: 'detailInfoPage',
                    count: totalNumber,
                    jump: function (obj, first) {
                        if (first) {
                            mainPage = 1;
                        } else {
                            mainPage = obj.curr;
                        }
                        var objReqData = FuncCommBnsApp.funcGeneralRequestData({

                            reqType: "BAM_USR_010_GetUserBaseInfoList",
                            reqId: "",
                            strType: "GET",
                            reqUserInfo: {
                                userId: '1'
                            },
                            reqParam: {
                            },
                            reqPageInfo: {
                                pageSize: myPageSize,
                                curPage: mainPage
                            }
                        });
                        FuncCommJQuery.FuncAjaxRequest({
                            strType: "GET",
                            strUrl: "/api/v1/bam/user/userBaseInfo/list",
                            objData: objReqData,
                            dataType: "json",
                            funcPrsForSuccess: function (res) {
                                var resultData = res.resResult.curData;
                                userBaseInfoList = resultData.content;
                                if (userBaseInfoList) {
                                    for (var i = 0; i < userBaseInfoList.length; i++) {
                                        if (resultData.content[i].telephone == null) {
                                            resultData.content[i].telephone = "无";
                                            console.log(resultData.content[i].telephone + "电话号码");
                                        }
                                        if (resultData.content[i].isValid) {
                                            resultData.content[i].isValid = "有效";
                                            console.log(resultData.content[i].isValid + "有效");
                                        }
                                        else {
                                            resultData.content[i].isValid = "无效";
                                        }
                                    }
                                    data = res.resResult.curData.content;
                                    document.getElementById('tableDetailUser').innerHTML = function () {
                                        console.log(data);
                                        var arr = [],
                                            thisData = data.concat().splice(0, obj.limit);
                                        console.log(thisData);
                                        layui.each(thisData, function (index, item) {
                                            var button1 = "<a role='button' onclick='toLPDetail(" + index + ")'><button>学点明细</button></a>";
                                            var button2 = "<a role='button' onclick='toGPDetail(" + index + ")'><button>绩点明细</button></a>";
                                            var button3 = "<a role='button' onclick='toCoinDetail(" + index + ")'><button>金币明细</button></a>";
                                            arr.push('<tr>');
                                            arr.push('<td>' + item.userId + '</td>');
                                            arr.push('<td>' + item.wechatName + '</td>');
                                            arr.push('<td>' + item.createTime + '</td>');
                                            arr.push('<td>' + item.loginTime + '</td>');
                                            arr.push('<td>' + item.learningPoint + '</td>');
                                            arr.push('<td>' + item.gradePoint + '</td>');
                                            arr.push('<td>' + item.coin + '</td>');
                                            arr.push('<td>' + 0 + '</td>');
                                            arr.push('<td>' + item.matchSumCount + '</td>');
                                            arr.push('<td>' + item.externalLevel + '</td>');
                                            arr.push('<td>' + item.experience + '</td>');
                                            arr.push('<td>' + item.telephone + '</td>');
                                            arr.push('<td>' + item.isValid + '</td>');
                                            arr.push('<td>' + button1 + "  " + button2 + "  " + button3 + '</td>');
                                            // arr.push('<td> <button onclick=toLPDetail({{index}})>学点明细</button> <button onclick="toGPDetail({{index}})">绩点明细</button><button onclick="toCoinDetail({{index}})">金币明细</button></td>');
                                            arr.push('</tr>');
                                        });
                                        return arr.join('');
                                    }();
                                }
                                else {
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
function toLPDetail(index) {
    hideAll();
    document.getElementById("userQueryAndUpdateBtn").className = "recently";
    document.getElementById("userDetailQueryBtn").className = "selected";
    userManagerLeftDiv.className = "show";
    learningPointDiv.className = "show";
    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage;
        layer = layui.layer;
        var data = [];
        var page = 1;
        var objReqData = FuncCommBnsApp.funcGeneralRequestData({

            reqType: "BAM_USR_010_GetUserLPDetails",
            reqId: "",
            strType: "GET",
            reqUserInfo: {
                userId: '1'
            },
            reqParam: {
                userId: userBaseInfoList[index].userId
            },
            reqPageInfo: {
                pageSize: myPageSize,
                curPage: page
            }

        });
        FuncCommJQuery.FuncAjaxRequest({
            strUrl: "/api/v1/bam/user/userDetail/userLPDetails",
            objData: objReqData,
            dataType: "json",
            funcPrsForSuccess: function (res) {
                totalNumber = res.resResult.curData.totalElements;
                laypage.render({
                    elem: 'LPPage',
                    count: totalNumber,
                    jump: function (obj, first) {
                        if (first) {
                            page = 1;
                        } else {
                            page = obj.curr;
                        }
                        var objReqData = FuncCommBnsApp.funcGeneralRequestData({

                            reqType: "BAM_USR_010_GetUserLPDetails",
                            reqId: "",
                            strType: "GET",
                            reqUserInfo: {
                                userId: '1'
                            },
                            reqParam: {
                                userId: userBaseInfoList[index].userId
                            },
                            reqPageInfo: {
                                pageSize: myPageSize,
                                curPage: page
                            }

                        });
                        FuncCommJQuery.FuncAjaxRequest({
                            strUrl: "/api/v1/bam/user/userDetail/userLPDetails",
                            objData: objReqData,
                            dataType: "json",
                            funcPrsForSuccess: function (res) {
                                data = res.resResult.curData.content;
                                if (data) {
                                    document.getElementById('tableLearningPoint').innerHTML = function () {
                                        console.log(data);
                                        var arr = [],
                                            thisData = data.concat().splice(0, obj.limit);
                                        console.log(thisData);
                                        layui.each(data, function (index, item) {
                                            arr.push('<tr>');
                                            arr.push('<td>' + item.userId + '</td>');
                                            arr.push('<td>' + item.occurTime + '</td>');
                                            arr.push('<td>' + item.originalAmount + '</td>');
                                            arr.push('<td>' + item.acquiredAmount + '</td>');
                                            arr.push('<td>' + item.lossAmount + '</td>');
                                            arr.push('<td>' + item.currentAmount + '</td>');
                                            arr.push('<td>' + item.reasonType + '</td>');
                                            arr.push('<td>' + item.matchRecordNo + '</td>');
                                            arr.push('<td>' + item.orderRecordNo + '</td>');
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
function toGPDetail(index) {
    hideAll();
    document.getElementById("userQueryAndUpdateBtn").className = "recently";
    document.getElementById("userDetailQueryBtn").className = "selected";
    userManagerLeftDiv.className = "show";
    gradePointDiv.className = "show";
    myUserId = userBaseInfoList[index].userId;
    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage;
        layer = layui.layer;
        var data = [];
        var page = 1;
        var objReqData = FuncCommBnsApp.funcGeneralRequestData({

            reqType: "BAM_USR_010_GetUserGPDetails",
            reqId: "",
            strType: "GET",
            reqUserInfo: {
                userId: '1'
            },
            reqParam: {
                userId: userBaseInfoList[index].userId
            },
            reqPageInfo: {
                pageSize: myPageSize,
                curPage: page
            }

        });
        FuncCommJQuery.FuncAjaxRequest({
            strUrl: "/api/v1/bam/user/userDetail/userGPDetails",
            objData: objReqData,
            dataType: "json",
            funcPrsForSuccess: function (res) {
                totalNumber = res.resResult.curData.totalElements;
                laypage.render({
                    elem: 'GPPage',
                    count: totalNumber,
                    jump: function (obj, first) {
                        if (first) {
                            page = 1;
                        } else {
                            page = obj.curr;
                        }
                        var objReqData = FuncCommBnsApp.funcGeneralRequestData({

                            reqType: "BAM_USR_010_GetUserGPDetails",
                            reqId: "",
                            strType: "GET",
                            reqUserInfo: {
                                userId: '1'
                            },
                            reqParam: {
                                userId: userBaseInfoList[index].userId
                            },
                            reqPageInfo: {
                                pageSize: myPageSize,
                                curPage: page
                            }

                        });
                        FuncCommJQuery.FuncAjaxRequest({
                            strUrl: "/api/v1/bam/user/userDetail/userGPDetails",
                            objData: objReqData,
                            dataType: "json",
                            funcPrsForSuccess: function (res) {
                                data = res.resResult.curData.content;
                                if (data) {
                                    document.getElementById('tableGradePoint').innerHTML = function () {
                                        console.log(data);
                                        var arr = [],
                                            thisData = data.concat().splice(0, obj.limit);
                                        console.log(thisData);
                                        layui.each(data, function (index, item) {
                                            arr.push('<tr>');
                                            arr.push('<td>' + item.userId + '</td>');
                                            arr.push('<td>' + item.occurTime + '</td>');
                                            arr.push('<td>' + item.originalAmount + '</td>');
                                            arr.push('<td>' + item.acquiredAmount + '</td>');
                                            arr.push('<td>' + item.lossAmount + '</td>');
                                            arr.push('<td>' + item.currentAmount + '</td>');
                                            arr.push('<td>' + item.reasonType + '</td>');
                                            arr.push('<td>' + item.matchRecordNo + '</td>');
                                            arr.push('<td>' + item.orderRecordNo + '</td>');
                                            arr.push('</tr>');
                                        });
                                        return arr.join('');
                                    }();
                                }
                                else {
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
        // totalNumber=getGPDetailNumber();
        //执行一个laypage实例

    });


}
function toCoinDetail(index) {
    hideAll();
    document.getElementById("userQueryAndUpdateBtn").className = "recently";
    document.getElementById("userDetailQueryBtn").className = "selected";
    userManagerLeftDiv.className = "show";
    coinDetailDiv.className = "show";
    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage;
        layer = layui.layer;
        var data = [];
        var page = 1;
        var objReqData = FuncCommBnsApp.funcGeneralRequestData({

            reqType: "BAM_USR_010_GetUserCoinDetails",
            reqId: "",
            strType: "GET",
            reqUserInfo: {
                userId: '1'
            },
            reqParam: {
                userId: userBaseInfoList[index].userId
            },
            reqPageInfo: {
                pageSize: myPageSize,
                curPage: page
            }

        });
        FuncCommJQuery.FuncAjaxRequest({
            strUrl: "/api/v1/bam/user/userDetail/userCoinDetails",
            objData: objReqData,
            dataType: "json",
            funcPrsForSuccess: function (res) {
                totalNumber = res.resResult.curData.totalElements;
                laypage.render({
                    elem: 'CoinPage',
                    count: totalNumber,
                    jump: function (obj, first) {
                        if (first) {
                            page = 1;
                        } else {
                            page = obj.curr;
                        }
                        var objReqData = FuncCommBnsApp.funcGeneralRequestData({

                            reqType: "BAM_USR_010_GetUserCoinDetails",
                            reqId: "",
                            strType: "GET",
                            reqUserInfo: {
                                userId: '1'
                            },
                            reqParam: {
                                userId: userBaseInfoList[index].userId
                            },
                            reqPageInfo: {
                                pageSize: myPageSize,
                                curPage: page
                            }
                        });
                        FuncCommJQuery.FuncAjaxRequest({
                            strUrl: "/api/v1/bam/user/userDetail/userCoinDetails",
                            objData: objReqData,
                            dataType: "json",
                            funcPrsForSuccess: function (res) {
                                data = res.resResult.curData.content;
                                if (data) {
                                    document.getElementById('tableCoinDetail').innerHTML = function () {
                                        console.log(data);
                                        var arr = [],
                                            thisData = data.concat().splice(0, obj.limit);
                                        console.log(thisData);
                                        layui.each(data, function (index, item) {
                                            arr.push('<tr>');
                                            arr.push('<td>' + item.userId + '</td>');
                                            arr.push('<td>' + item.occurTime + '</td>');
                                            arr.push('<td>' + item.originalAmount + '</td>');
                                            arr.push('<td>' + item.acquiredAmount + '</td>');
                                            arr.push('<td>' + item.lossAmount + '</td>');
                                            arr.push('<td>' + item.currentAmount + '</td>');
                                            arr.push('<td>' + item.reasonType + '</td>');
                                            arr.push('<td>' + item.matchRecordNo + '</td>');
                                            arr.push('<td>' + item.orderRecordNo + '</td>');
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
function toSearch() {
    wechatNameQuery = document.getElementById("wechatNameQuery").value || null;
    lowLPQuery = document.getElementById("lowLPQuery").value || -1;
    highLPQuery = document.getElementById("highLPQuery").value || Infinity;
    lowGPQuery = document.getElementById("lowGPQuery").value || -1;
    highGPQuery = document.getElementById("highGPQuery").value || Infinity;
    lowCoinQuery = document.getElementById("lowCoinQuery").value || -1;
    highCoinQuery = document.getElementById("highCoinQuery").value || Infinity;
    baseInfoPage();
}
function toSave() {
    var upUserId = document.getElementById("upUserId").value;
    var upWechatName = document.getElementById("upWechatName").value;
    var upLPAmount = document.getElementById("upLPAmount").value;
    var upGPAmount = document.getElementById("upGPAmount").value;
    var upCoinAmount = document.getElementById("upCPAmount").value;
    var upTAmount = document.getElementById("upTAmount").value;//工具数
    var upGrade = document.getElementById("upGrade").value;
    var upExperice = document.getElementById("upExperice").value;
    var upMatchAmount = document.getElementById("upMatchAmount").value;
    var upWinAmount = document.getElementById("upWinAmount").value;
    var upLossAmount = document.getElementById("upLossAmount").value;
    var upTieAmount = document.getElementById("upTieAmount").value;

    var objReqData = FuncCommBnsApp.funcGeneralRequestData({

        reqType: "BAM_USR_010_UpdateUserBaseInfo",
        reqId: "",
        reqUserInfo: {
            userId: '1'
        },
        reqParam: {
            coin: upCoinAmount,
            gradePoint: upGPAmount,
            learningPoint: upLPAmount,
            matchSumCount: upMatchAmount,
            matchWinCount: upWinAmount,
            matchLoseCount: upLossAmount,//后台命名
            matchDogFallCount: upTieAmount,
            experience: upExperice,
            externalLevel: upGrade
        },
        reqPageInfo: {
            pageSize: myPageSize,
            curPage: 1
        }

    });
    FuncCommJQuery.FuncAjaxRequest({
        strType: "POST",
        strUrl: "/api/v1/bam/user/userBaseInfo/update/" + upUserId,
        objData: objReqData,
        dataType: "json",
        funcPrsForSuccess: function (res) {

            var resultData = res.resResult.curData;
        },
        funcPrsForFail: function (res) {
            console.log(res);

        }

    })


}
function toClose() {
    console.log("执行了关闭操作");
    hideAll();
    document.getElementById("firstMenu").innerText = "用户管理";
    document.getElementById("secondMenu").innerText = "基本信息查询与修改";
    document.getElementById("userQueryAndUpdateBtn").className = "selected";
    document.getElementById("userDetailQueryBtn").className = "recently";
    userManagerLeftDiv.className = "show";
    userQueryAndUpdateDiv.className = "show";
    baseInfoPage();
}







