var searchBtn = my$("Submit-5");
var Res;
//搜索函数
searchBtn.onclick = function(){
    var selectedCourse = my$("selectedCourse-5");                            //获取用户选择的科目
    var index1 = selectedCourse.selectedIndex;
    var selectedCourseID = selectedCourse.options[index1].value;
    console.log(selectedCourseID);
    

    var selectedGrade = my$("selectedGrade-5");                             //获取用户选择的年级
    var index2 = selectedGrade.selectedIndex;
    var selectedGradeID = selectedGrade.options[index2].value;

    var subUl = my$("subUl-5");                                             //获取用户选择的题型
    var index2 = subUl.selectedIndex;
    var subUlID = subUl.options[index2].value;

    var isValid = my$("isValid-5");                                         //获取选择题目是否有效
    var index2 = isValid.selectedIndex;
    var isValidID = isValid.options[index2].value;

    var questionSearch = my$("question-search").value;
    layui.use('laytpl', function () {
        var laytpl = layui.laytpl;

        var objReqData = FuncCommBnsApp.funcGeneralRequestData({
            reqID: "",
            strType: "GET",
            reqType: "BAM_QST_010_GetQuestionList",
            reqUserInfo: {
                userId: "1"
            },
            reqParam: {
                courseShortName: selectedCourseID,
                gradeShortName: selectedGradeID,
                question: questionSearch,
                questionTypeName: subUlID,
                isValid: isValidID,
            },
            reqRefData: {},
            reqPageInfo: {
                pageSize:10,
                pageNum: 1,
            },
        });
        console.log("objReqData封装ajax.objData");
        console.log(objReqData);



        FuncCommJQuery.FuncAjaxRequest({
            strType: "GET",
            strUrl: "/api/v1/bam/qst/list",
            objData: objReqData,
            funcPrsForSuccess: function (res) {
                console.log("正确")
                console.log(res);
                var resultData = res.resResult.curData;
                var getTpl = demo.innerHTML;
                var tableQuestion = my$("tableQuestion");

                var code = '<table class="layui-table" id="tb">';
                code += '<thead><tr><th>试题编号</th><th>试题类型</th><th>题目描述</th><th>提供者</th><th>级别</th><th>难度系数</th><th>金币权值</th><th>绩点权值</th><th>创建时间</th><th>年级</th><th>学科</th><th>有效标志</th><th>操作</th></tr></thead><tbody>';

                laytpl(getTpl).render(resultData, function (html) {
                    tableQuestion.innerHTML = code + html + '</tbody></table>';
                });

            },
            funcPrsForFail: function (res) {
                console.log( res);
            }
        });
    })
}

function DeleteMultipleChoiceQuestion(tableID)
{
    var objReqData = FuncCommBnsApp.funcGeneralRequestData({
        
        reqID: "",
        strType: "POST",
        reqType: "BAM_QST_010_DeleteMultipleChoiceQuestion",
        reqUserInfo: {
            userId: "1"
        },
        reqParam: {
            questionId:tableID,
        },
        reqRefData: {},
        reqPageInfo: {},
    });
    console.log("objReqData封装ajax.objData");
    console.log(objReqData);
    var Url = "/api/v1/bam/qst/questionMultipleChoice/delete";
    console.log(Url);


    FuncCommJQuery.FuncAjaxRequest({
        strType: "POST",
        strUrl: Url,
        objData: objReqData,
        funcPrsForSuccess: function (res) {
            console.log("正确")
            console.log(res);
        },
        funcPrsForFail: function (res) {
            console.log( res);
        }
    });
}

function DeleteRecitationQuestion(tableID)
{
    var objReqData = FuncCommBnsApp.funcGeneralRequestData({
        reqID: "",
        strType: "POST",
        reqType: "BAM_QST_010_DeleteRecitationQuestion",
        reqUserInfo: {
            userId: "1"
        },
        reqParam: {
            questionId: tableID,
        },
        reqRefData: {},
        reqPageInfo: {},
    });
    console.log("objReqData封装ajax.objData");
    console.log(objReqData);
    var Url = "/api/v1/bam/qst/questionRecitation/delete";
    console.log(Url);


    FuncCommJQuery.FuncAjaxRequest({
        strType: "POST",
        strUrl: Url,
        objData: objReqData,
        funcPrsForSuccess: function (res) {
            console.log("正确")
            console.log(res);
        },
        funcPrsForFail: function (res) {
            console.log( res);
        }
    });
}

function GetQuestionDetail(questionID,SubUl){
    var objReqData = FuncCommBnsApp.funcGeneralRequestData({
        reqID: "",
        strType: "GET",
        reqType: "BAM_QST_010_GetQuestionDetail",
        reqUserInfo: {
            userId: "1"
        },
        reqParam: {
            questionId: questionID,
            questionTypeName: SubUl
        },
        reqRefData: {},
        reqPageInfo: {},
    });
    console.log("objReqData封装ajax.objData");
    console.log(objReqData);
    

    FuncCommJQuery.FuncAjaxRequest({
        strType: "GET",
        //async: false,
        strUrl: "/api/v1/bam/qst",
        objData: objReqData,
        funcPrsForSuccess: function (res) {
            console.log("详细信息")
            console.log(res);

            if(SubUl == "背诵题"){
                console.log("beisonggenggai");
                hideAll();
                document.getElementById("choiceUploadBtn").className = "recently";
                document.getElementById("multipleUploadBtn").className = "recently";
                document.getElementById("reciteUploadBtn").className = "selected";
                document.getElementById("batchUploadBtn").className = "recently";
                document.getElementById("questionUpdateBtn").className = "recently";
                questionTestLeftDiv.className = "show";
                reciteUploadDiv.className = "show";
                document.getElementById("firstMenu").innerText = "试题管理";
                document.getElementById("secondMenu").innerText = "背诵题手工录入";
                var data = res.resResult.curData;
                saveOrUpdate = 1;
                questionIdAll = questionID;
                console.log(data);
                console.log(data.courseShortName);
                var time = data.recommendTime/10-1;
                console.log(time);
                $("#selectedCourse-3").val(data.courseShortName);
                $("#selectedGrade-3").val(data.gradeShortName);
                /*$("#reciteTitle-3").attr("value",data.question);
                $("#reciteInputContent-3").attr("value",data.part);
                $("#answerInputContent-3").attr("value",data.answer);
                $("#courseRating-3").attr("value",data.difficulty);
                $("#learnPoint-3").attr("value",data.coinWeight);
                $("#GPA-3").attr("value",data.gpWeight);*/
                $("#reciteTitle-3").val(data.question);
                $("#reciteInputContent-3").val(data.part);
                $("#answerInputContent-3").val(data.answer);
                $("#courseRating-3").val(data.difficulty);
                $("#learnPoint-3").val(data.coinWeight);
                $("#GPA-3").val(data.gpWeight);
                my$("timeUl-3").getElementsByTagName("div")[time].setAttribute("class", "timeOption-selected") ;
            }else if(SubUl == "单选题"){
                hideAll();
                document.getElementById("choiceUploadBtn").className = "selected";
                document.getElementById("multipleUploadBtn").className = "recently";
                document.getElementById("reciteUploadBtn").className = "recently";
                document.getElementById("batchUploadBtn").className = "recently";
                document.getElementById("questionUpdateBtn").className = "recently";
                questionTestLeftDiv.className = "show";
                choiceUploadDiv.className = "show";
                document.getElementById("firstMenu").innerText = "试题管理";
                document.getElementById("secondMenu").innerText = "单选题手工录入";
                var data = res.resResult.curData;
                saveOrUpdate = 1;
                questionIdAll = questionID;
                console.log(data);
                console.log(data.courseShortName);
                var time = data.recommendTime/10-1;
                console.log(time);
                var num = GetAnswerNum(data.answer);
                $("#selectedCourse-1").val(data.courseShortName);
                $("#selectedGrade-1").val(data.gradeShortName);
                $("#Problem-stem-1").val(data.question);
                $("#optionA-1").val(data.choiceA);
                $("#optionB-1").val(data.choiceB);
                $("#optionC-1").val(data.choiceC);
                $("#optionD-1").val(data.choiceD);
                $("#questionAnalyze-1").val(data.questionAnalyze);
                $("#courseRating-1").val(data.difficulty);
                $("#learnPoint-1").val(data.coinWeight);
                $("#GPA-1").val(data.gpWeight);
                my$("timeUl-1").getElementsByTagName("div")[time].setAttribute("class", "timeOption-selected") ;
                my$("answerUl-1").getElementsByTagName("div")[num].setAttribute("class", "optionBtn-selected");
            }else if(SubUl == "多选题"){
                hideAll();
                document.getElementById("choiceUploadBtn").className = "recently";
                document.getElementById("multipleUploadBtn").className = "selected";
                document.getElementById("reciteUploadBtn").className = "recently";
                document.getElementById("batchUploadBtn").className = "recently";
                document.getElementById("questionUpdateBtn").className = "recently";
                questionTestLeftDiv.className = "show";
                multipleUploadDiv.className = "show";
                document.getElementById("firstMenu").innerText = "试题管理";
                document.getElementById("secondMenu").innerText = "多选题手工录入";

                var data = res.resResult.curData;
                saveOrUpdate = 1;
                questionIdAll = questionID;
                console.log(data);
                console.log(data.courseShortName);
                var time = data.recommendTime/10-1;
                console.log(time);
                var numArr = new Array();
                numArr = GetMutilAnswerNum(data.answer);
                console.log(numArr);
                $("#selectedCourse-2").val(data.courseShortName);
                $("#selectedGrade-2").val(data.gradeShortName);
                $("#Problem-stem-2").val(data.question);
                $("#optionA-2").val(data.choiceA);
                $("#optionB-2").val(data.choiceB);
                $("#optionC-2").val(data.choiceC);
                $("#optionD-2").val(data.choiceD);
                $("#questionAnalyze-2").val(data.questionAnalyze);
                $("#courseRating-2").val(data.difficulty);
                $("#learnPoint-2").val(data.coinWeight);
                $("#GPA-2").val(data.gpWeight);
                my$("timeUl-2").getElementsByTagName("div")[time].setAttribute("class", "timeOption-selected");
                for(i=0;i<numArr.length;i++){
                    my$("answerUl-2").getElementsByTagName("div")[numArr[i]].setAttribute("class", "optionBtn-selected");
                }
            }

            //console.log(res.resResult.curData);
            //$("#AjaxData-2").data(res.resResult.curData);
        
        },
        funcPrsForFail: function (res) {
            console.log( res);
        }
    });
}

function GetAnswerNum(answer){
    var num = 5;
    if(answer == "A")
    {
        num = 0;
    }else if(answer == "B"){
        num = 1;
    }else if(answer == "C"){
        num = 2;
    }else if(answer == "D"){
        num = 3;
    }
    console.log(num);
    return num ;
}

function GetMutilAnswerNum(answer){
    var strs= new Array(); //定义一数组 
    strs=answer.split(","); //字符分割
    for(i=0;i<strs.length;i++){
        strs[i]=GetAnswerNum(strs[i]);
    }
    return strs;
}

// function UpdateMultipleChoiceQuestion(SubUl,questionID){
//     GetQuestionDetail(questionID,SubUl);
//     var Res = $("#AjaxData-2").data();
//     console.log(Res);
//     if(SubUl == "单选题"){
//         hideAll();
//         document.getElementById("choiceUploadBtn").className = "selected";
//         document.getElementById("multipleUploadBtn").className = "recently";
//         document.getElementById("reciteUploadBtn").className = "recently";
//         document.getElementById("batchUploadBtn").className = "recently";
//         document.getElementById("questionUpdateBtn").className = "recently";
//         questionTestLeftDiv.className = "show";
//         choiceUploadDiv.className = "show";
//         var curData = Res.resResult.isSuccess;
//         console.log(curData);
//         //my$(selectedCourse-1).text(curData.courseShortName);



//     }else{
//         hideAll();
//         document.getElementById("choiceUploadBtn").className = "recently";
//         document.getElementById("multipleUploadBtn").className = "selected";
//         document.getElementById("reciteUploadBtn").className = "recently";
//         document.getElementById("batchUploadBtn").className = "recently";
//         document.getElementById("questionUpdateBtn").className = "recently";
//         questionTestLeftDiv.className = "show";
//         multipleUploadDiv.className = "show";


//         console.log($("#AjaxData-2").data());
//         //var Type = $("#AjaxData-2").data("type");
//         console.log($("#AjaxData-2").data("answer"));
//         //onsole.log(Res);
//         //var curData = Res.resResult;
//         //console.log(curData);
//         //my$(selectedCourse-1).text($("#AjaxData-2").data("curData.courseShortName"));
//     }
//     //填充页面







// }
