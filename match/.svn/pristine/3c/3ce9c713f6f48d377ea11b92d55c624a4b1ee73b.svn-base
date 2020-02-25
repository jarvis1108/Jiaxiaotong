
var reciteTimeUl = my$("timeUl-2");                            //获取选择时间按钮的ul
var reciteTimeList = reciteTimeUl.getElementsByTagName("div"); //获取时间按钮ul里的div

var reciteSubmitBtn = my$("Submit-2");                       //获取提交按钮

for (var k = 0; k < reciteTimeList.length; k++) {             //选择答题时间
    reciteTimeList[k].onclick = function () {
        for (var m = 0; m < reciteTimeList.length; m++) {
            reciteTimeList[m].className = "timeOption";
        }
        this.className = "timeOption-selected";

        time = this.getAttribute("timeNumber");        //把用户选择的答题时间储存到time中
        console.log(time);
    };
}


// var reciteParam = {                                          //保存题目内容和答案等信息的array
//     reqID: "1",
//     reqType: "QST_RFL_010_SaveRecitationQuestionForLib",
//     reqUserInfo: {
//         userId: "2"
//     },
//     reqParam: {
//         userId: "2",
//         gradeId: gradeId,
//         courseId: courseId,
//         question: reciteTitle,
//         answer: answerInputContent,
//         time: "",
//         questionLibId: ""
//     }
// };
// var reciteObjParam = JSON.stringify(reciteParam);                 //把array转成json

reciteSubmitBtn.onclick = function () {                     //选择题提交按钮的点击事件

    var course = my$("selectedCourse");                            //获取用户选择的科目
    var index1 = course.selectedIndex;
    var courseId = course.options[index1].text;
    console.log(courseId);

    var grade = my$("selectedGrade");                             //获取用户选择的年级
    var index2 = grade.selectedIndex;
    var gradeId = grade.options[index2].text;
    console.log(gradeId);

    var reciteTitle = my$("reciteTitle").value;                //获取背诵题题目
    var reciteInputContent = my$("reciteInputContent").value;  //获取需要背诵部分
    var answerInputContent = my$("answerInputContent").value;  //获取背诵的答案

    var reciteParam = {                                          //保存题目内容和答案等信息的array
        reqId: "1",
        reqType: "QST_RFL_010_SaveRecitationQuestionForLib",
        reqUserInfo: {
            userId: "1"
        },
        reqParam: {
            userId: "1",
            gradeId: gradeId,
            courseId: courseId,
            question: reciteTitle,
            answer: answerInputContent,
            questionLibId: ""
        }
    };
    var reciteObjParam = JSON.stringify(reciteParam);                 //把array转成json

    console.log(reciteObjParam);

    console.log("按钮点击了");

    var xhr = new XMLHttpRequest();
    console.log(xhr.readyState);
    xhr.open('POST', 'http://120.77.148.123:8089/strongestscholar/api/v1/qst/questionRecitationForLib');
    console.log(xhr.readyState);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.send(reciteObjParam);
    xhr.onreadystatechange = function () {
        console.log(xhr.readyState);
        if (this.readyState == 4) {
            console.log(this.responseText);
            alert("提交成功")
        } else {

        }
    }
};