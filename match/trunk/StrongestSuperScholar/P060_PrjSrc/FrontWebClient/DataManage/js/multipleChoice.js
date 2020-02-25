
var chooseSubmitBtn = my$("Submit-2");                       //获取选择题提交按钮




var answer = "";                                           //储存用户选择的正确答案
var answerArr = new Array(4);
var answerUl = my$("answerUl-2");                         //获取选择答案按钮的ul
var answerList_2 = answerUl.getElementsByTagName("div");    //获取答案按钮ul里的div

for (var i = 0; i < answerList_2.length; i++) {            //选择正确答案
    answerList_2[i].onclick = function () {
        // for (var j = 0; j < answerList.length; j++) {
        //     answerList_2[j].className = "optionBtn";
        // }
        if (this.className == "optionBtn-selected") {
            this.className = "optionBtn";
            answerArr[this.getAttribute("optionNumber-2")] = "";
        } else {
            this.className = "optionBtn-selected";
            answerArr[this.getAttribute("optionNumber-2")] = this.getAttribute("optionLetter");
        }
        //answer = this.getAttribute("optionNumber-2");     //把用户选择的正确答案储存到answer中
        console.log(answerArr);
    };
}




var time = 0;
var timeUl = my$("timeUl-2");                            //获取选择时间按钮的ul
var timeList_2 = timeUl.getElementsByTagName("div");       //获取时间按钮ul里的div
for (var k = 0; k < timeList_2.length; k++) {             //选择答题时间
    timeList_2[k].onclick = function () {
        for (var m = 0; m < timeList.length; m++) {
            timeList_2[m].className = "timeOption";
        }
        console.log("duoxuan");
        this.className = "timeOption-selected";
        time = this.getAttribute("timeNumber-2");        //把用户选择的答题时间储存到time中
    };
}


chooseSubmitBtn.onclick = function () {                     //选择题提交按钮的点击事件

    console.log("111");
    console.log(answerArr);
    answer = answerArr.join(",");

    console.log(answer);
    var course = my$("selectedCourse-2");                            //获取用户选择的科目
    var index1 = course.selectedIndex;
    var courseId = course.options[index1].text;
    console.log(courseId);

    var grade = my$("selectedGrade-2");                             //获取用户选择的年级
    var index2 = grade.selectedIndex;
    var gradeId = grade.options[index2].text;
    console.log(gradeId);

    var questionTitle = my$("Problem-stem-2").value;             //获取题目
    var optionA = my$("optionA-2").value;                        //获取选项A的内容
    var optionB = my$("optionB-2").value;                        //获取选项B的内容
    var optionC = my$("optionC-2").value;                        //获取选项C的内容
    var optionD = my$("optionD-2").value;                        //获取选项D的内容
    var questionAnalyze = my$("questionAnalyze-2").value;        //获取答案解析
    var courseRating = my$("courseRating-2").value;              //获取难度系数
    var learnPoint = my$("learnPoint-2").value;                  //获取学点数
    var GPA = my$("GPA-2").value;                                //获取绩点数

    if (saveOrUpdate == 0) {

        var objReqData = FuncCommBnsApp.funcGeneralRequestData({
            reqId: "",
            reqType: "BAM_QST_010_SaveMultipleChoiceQuestion",
            reqUserInfo: {
                userId: "1"
            },
            reqParam: {
                knowledgeId: FuncCommBnsApp.funcGeneralUUID(),//FuncCommBnsApp.uuid(8,16),
                courseShortName: courseId,
                gradeShortName: gradeId,
                question: questionTitle,
                provider: "1",                  //提供者ID？？
                personInCharge: "1",             //负责人ID？？
                reference: "abc",                  //引用出处？？
                questionLevel: 2,                //级别？
                difficulty: parseInt(courseRating),
                coinWeight: parseInt(learnPoint),                 //金币待定(暂用学点代替)
                gpWeight: parseInt(GPA),
                answer: answer,
                questionAnalyze: questionAnalyze,            //解析又是啥子哟？？
                recommendTime: parseInt(time),
                remark: "gh",                     //备注说明
                choiceA: optionA,
                choiceB: optionB,
                choiceC: optionC,
                choiceD: optionD,
                questionTypeName: "多选题"
            },
            reqRefData: {},
            reqPageInfo: {},
        });
        console.log("objReqData封装ajax.objData");
        console.log(objReqData);



        FuncCommJQuery.FuncAjaxRequest({
            strType: "POST",
            strUrl: "/api/v1/bam/qst/questionMultipleChoice",
            objData: objReqData,
            funcPrsForSuccess: function (data, txtStatus) {
                console.log("正确")
                console.log(data);
                alert("保存提交成功");
            },
            funcPrsForFail: function (HTX, txtStatus) {
                console.log("错误：" + err);
            }
        });
    } else {
        for(var i = 0; i < answerList_2.length; i++) { 
            if(answerList_2[i].className == "optionBtn-selected"){
                answerArr[answerList_2[i].getAttribute("optionNumber-2")] = this.getAttribute("optionLetter");
            }
        }
        var objReqData = FuncCommBnsApp.funcGeneralRequestData({
            reqId: "",
            reqType: "BAM_QST_010_UpdateMultipleChoiceQuestion",
            reqUserInfo: {
                userId: "1"
            },
            reqParam: {
                questionId: questionIdAll,
                knowledgeId: FuncCommBnsApp.funcGeneralUUID(),//FuncCommBnsApp.uuid(8,16),
                courseShortName: courseId,
                gradeShortName: gradeId,
                question: questionTitle,
                provider: "1",                  //提供者ID？？
                personInCharge: "1",             //负责人ID？？
                reference: "abc",                  //引用出处？？
                questionLevel: 2,                //级别？
                difficulty: parseInt(courseRating),
                coinWeight: parseInt(learnPoint),                 //金币待定(暂用学点代替)
                gpWeight: parseInt(GPA),
                answer: answer,
                questionAnalyze: questionAnalyze,            //解析又是啥子哟？？
                recommendTime: parseInt(time),
                remark: "gh",                     //备注说明
                choiceA: optionA,
                choiceB: optionB,
                choiceC: optionC,
                choiceD: optionD,
                isValid: 1,
                questionTypeName: "选择题"
            },
            reqRefData: {},
            reqPageInfo: {},
        });
        console.log("objReqData封装ajax.objData");
        console.log(objReqData);
        console.log("/api/v1/bam/qst/questionMultipleChoice/" + questionIdAll);


        FuncCommJQuery.FuncAjaxRequest({
            strType: "POST",
            strUrl: "/api/v1/bam/qst/questionMultipleChoice/update",
            objData: objReqData,
            funcPrsForSuccess: function (data, txtStatus) {
                console.log("正确")
                console.log(data);
                questionIdAll = "";
                saveOrUpdate = 0 ;
                alert("更改提交成功");
            },
            funcPrsForFail: function (HTX, txtStatus) {
                console.log("错误：" + err);
            }
        });
    }
};