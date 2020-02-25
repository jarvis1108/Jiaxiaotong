var answerUl = my$("answerUl");                         //获取选择答案按钮的ul
var answerList = answerUl.getElementsByTagName("div");    //获取答案按钮ul里的div
//
var answer = 0;                                           //储存用户选择的正确答案
//
//
var timeUl = my$("timeUl-1");                            //获取选择时间按钮的ul
var timeList = timeUl.getElementsByTagName("div");       //获取时间按钮ul里的div
//
var time = 0;


var chooseSubmitBtn = my$("Submit-1");                       //获取选择题提交按钮

// var chooseParam = {                                          //保存题目内容和答案等信息的array
//     reqId: "1",
//     reqType: "QFL_CHO_010_addChoice",
//     reqUserInfo: {
//         userId: "1"
//     },
//     reqParam: {
//         userId: "1",
//         gradeId: gradeId,
//         courseId: courseId,
//         question: questionTitle,
//         choiceA: optionA,
//         choiceB: optionB,
//         choiceC: optionC,
//         choiceD: optionD,
//         answer: answer,
//         time: time,
//         questionLibId: ""
//     }
// };
// var chooseObjParam = JSON.stringify(chooseParam);                 //把array转成json
// console.log(chooseObjParam);

for (var i = 0; i < answerList.length; i++) {            //选择正确答案
    answerList[i].onclick = function () {
        for (var j = 0; j < answerList.length; j++) {
            answerList[j].className = "optionBtn";
        }
        this.className = "optionBtn-selected";

        answer = this.getAttribute("optionNumber");     //把用户选择的正确答案储存到answer中
        console.log(answer);
    };
}


for (var k = 0; k < timeList.length; k++) {             //选择答题时间
    timeList[k].onclick = function () {
        for (var m = 0; m < timeList.length; m++) {
            timeList[m].className = "timeOption";
        }
        this.className = "timeOption-selected";

        time = this.getAttribute("timeNumber");        //把用户选择的答题时间储存到time中
        console.log(time);
    };
}


chooseSubmitBtn.onclick = function () {                     //选择题提交按钮的点击事件

    var course = my$("selectedCourse");                            //获取用户选择的科目
    var index1 = course.selectedIndex;
    var courseId = course.options[index1].text;
    console.log(courseId);

    var grade = my$("selectedGrade");                             //获取用户选择的年级
    var index2 = grade.selectedIndex;
    var gradeId = grade.options[index2].text;
    console.log(gradeId);

    var questionTitle = my$("Problem-stem").value;         //获取题目
    console.log(questionTitle);

    var optionA = my$("optionA").value;                    //获取选项A的内容
    var optionB = my$("optionB").value;                    //获取选项B的内容
    var optionC = my$("optionC").value;                    //获取选项C的内容
    var optionD = my$("optionD").value;                    //获取选项D的内容

    console.log("按钮点击了");

    console.log(courseId);
    console.log(gradeId);

    var chooseParam = {                                          //保存题目内容和答案等信息的array
        reqId: "1",
        reqType: "QFL_CHO_010_addChoice",
        reqUserInfo: {
            userId: "1"
        },
        reqParam: {
            userId: "1",
            gradeId: gradeId,
            courseId: courseId,
            question: questionTitle,
            choiceA: optionA,
            choiceB: optionB,
            choiceC: optionC,
            choiceD: optionD,
            answer: answer,
            time: time,
            questionLibId: ""
        }
    };
    var chooseObjParam = JSON.stringify(chooseParam);                 //把array转成json
    console.log(chooseObjParam);

    var xhr = new XMLHttpRequest();
    xhr.open('POST', 'http://120.77.148.123:8089/strongestscholar/api/v1/question/questionForLib/addChoice');
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send(chooseObjParam);
    xhr.onreadystatechange = function () {
        console.log(xhr.readyState);
        if (this.readyState == 4) {
            console.log(this.responseText);
            alert("提交成功")
        } else {
            // console.log("失败了");
        }
    }
};