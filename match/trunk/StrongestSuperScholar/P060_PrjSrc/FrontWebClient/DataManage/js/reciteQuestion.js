
var reciteSubmitBtn = my$("Submit-3");                       //获取提交按钮

var time = 0;
var reciteTimeUl = my$("timeUl-3");                            //获取选择时间按钮的ul
var reciteTimeList = reciteTimeUl.getElementsByTagName("div"); //获取时间按钮ul里的div
for (var k = 0; k < reciteTimeList.length; k++) {             //选择答题时间
    reciteTimeList[k].onclick = function () {
        for (var m = 0; m < reciteTimeList.length; m++) {
            reciteTimeList[m].className = "timeOption";
        }
        this.className = "timeOption-selected";
        time = this.getAttribute("timeNumber");        //把用户选择的答题时间储存到time中
    };
   
}


reciteSubmitBtn.onclick = function () {                     //选择题提交按钮的点击事件
    console.log(time);
    var course = my$("selectedCourse-3");                            //获取用户选择的科目
    var index1 = course.selectedIndex;
    var courseId = course.options[index1].text;
    console.log(courseId);

    var grade = my$("selectedGrade-3");                             //获取用户选择的年级
    var index2 = grade.selectedIndex;
    var gradeId = grade.options[index2].text;
    console.log(gradeId);

    var reciteTitle = my$("reciteTitle-3").value;                //获取背诵题题目
    var reciteInputContent = my$("reciteInputContent-3").value;  //获取需要背诵部分
    var answerInputContent = my$("answerInputContent-3").value;  //获取背诵的答案
    var courseRating = my$("courseRating-3").value;              //获取难度系数
    var learnPoint = my$("learnPoint-3").value;                  //获取学点数
    var GPA = my$("GPA-3").value;                                //获取绩点数
    console.log(time);
    console.log(saveOrUpdate);
    console.log("/api/v1/bam/qst/questionRecitation/{"+questionIdAll +"}");
    if(saveOrUpdate == 0){
        var objReqData = FuncCommBnsApp.funcGeneralRequestData({
            reqId:"",
            reqType: "BAM_QST_010_SaveRecitationQuestion",
            reqUserInfo:{
                userId:"1"
            },
         reqParam: {
            knowledgeId: FuncCommBnsApp.funcGeneralUUID(),//FuncCommBnsApp.uuid(8,16),
            courseShortName: courseId,
            gradeShortName: gradeId,
            question: reciteTitle,
            provider: "1",                  //提供者ID？？
            personInCharge:"1",             //负责人ID？？
            reference: "abc",                  //引用出处？？
            questionLevel:2,                //级别？
            difficulty: parseInt(courseRating),
            coinWeight: parseInt(learnPoint),                 //金币待定(暂用学点代替)
            gpWeight: parseInt(GPA),
            answer: answerInputContent,
            questionAnalyze: "def",            //解析又是啥子哟？？
            recommendTime:  parseInt(time),
            remark: "gh",                     //备注说明
            part: reciteInputContent,       //节选内容？？？
            isPartial: 0,               //是否节选
         },
         reqRefData:{},
         reqPageInfo:{},
        });
        console.log("objReqData封装ajax.objData");
        console.log(objReqData);



        FuncCommJQuery.FuncAjaxRequest({
            strType: "POST",
            strUrl: "/api/v1/bam/qst/questionRecitation",
            objData:objReqData,
            funcPrsForSuccess: function(data, txtStatus){
                console.log("正确")
                console.log(data);
                alert("保存提交成功");
            },
            funcPrsForFail: function(HTX, txtStatus){
                console.log("错误：" + err);
            }
        });
    }else{
        var objReqData = FuncCommBnsApp.funcGeneralRequestData({
            reqId:"",
            reqType: "BAM_QST_010_UpdateRecitationQuestion",
            reqUserInfo:{
                userId:"1"
            },
         reqParam: {
            questionId: questionIdAll,
            knowledgeId: FuncCommBnsApp.funcGeneralUUID(),//FuncCommBnsApp.uuid(8,16),
            courseShortName: courseId,
            gradeShortName: gradeId,
            question: reciteTitle,
            provider: "1",                  //提供者ID？？
            personInCharge:"1",             //负责人ID？？
            reference: "abc",                  //引用出处？？
            questionLevel:2,                //级别？
            difficulty: parseInt(courseRating),
            coinWeight: parseInt(learnPoint),                 //金币待定(暂用学点代替)
            gpWeight: parseInt(GPA),
            answer: answerInputContent,
            questionAnalyze: "def",            //解析又是啥子哟？？
            recommendTime:  parseInt(time),
            remark: "gh",                     //备注说明
            part: reciteInputContent,       //节选内容？？？
            isPartial: 0,               //是否节选
            isValid: 1,
         },
         reqRefData:{},
         reqPageInfo:{},
        });
        console.log("objReqData封装ajax.objData");
        console.log(objReqData);
        console.log("/api/v1/bam/qst/questionRecitation/"+questionIdAll );


        FuncCommJQuery.FuncAjaxRequest({
            strType: "POST",
            strUrl: "/api/v1/bam/qst/questionRecitation/update",
            objData:objReqData,
            funcPrsForSuccess: function(data, txtStatus){
                console.log("正确");
                console.log(data);
                questionIdAll = "";
                saveOrUpdate = 0 ;
                alert("更改提交成功");
            },
            funcPrsForFail: function(HTX, txtStatus){
                console.log("错误：" + err);
            }
        });
    }
};