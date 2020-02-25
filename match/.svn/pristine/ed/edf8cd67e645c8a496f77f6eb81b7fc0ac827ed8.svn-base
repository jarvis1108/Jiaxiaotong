function changeSubject(questionID) {
    var subjectID = $("#subjectSelector").val();
    $.ajax({
        method: "POST",
        url: "../question/changeSubject",
        data: {
            questionID: questionID,
            subjectID: subjectID
        },
        success: function (data) {
            if (data === "success") {
                window.location.href = "../question/detail?questionID=" + questionID + "&subjectID=" + subjectID;
            } else {
                return $.growl.error({
                    title: "消息提醒",
                    message: "保存失败，请重试",
                    location: "br"
                });
            }
        }
    })
}

function changeKnowledge(questionID) {
    var knowledgeID = $("#knowledgeSelector").val();
    $.ajax({
        method: "POST",
        url: "../question/changeKnowledge",
        data: {
            questionID: questionID,
            knowledgeID: knowledgeID
        },
        success: function (data) {
            if (data === "success") {
                window.location.reload();
            } else {
                return $.growl.error({
                    title: "消息提醒",
                    message: "保存失败，请重试",
                    location: "br"
                });
            }
        }
    })
}

/* 保存题干、选项、答案、解析等信息 */
function saveInfo(questionID) {
    var question = $("#editor-question").val();
    var choiceA = $("#choiceA").val();
    var choiceB = $("#choiceB").val();
    var choiceC = $("#choiceC").val();
    var choiceD = $("#choiceD").val();
    var questionAnalyse = $("#editor-analyse").val();
    var difficulty = $("#difficulty").val();

    var questionAnswer = $("#answer").val();

    $.ajax({
        method: "POST",
        url: "../question/update",
        data: {
            questionID: questionID,
            question: question,
            choiceA: choiceA,
            choiceB: choiceB,
            choiceC: choiceC,
            choiceD: choiceD,
            questionAnswer: questionAnswer,
            questionAnalyse: questionAnalyse,
            difficulty: difficulty
        },
        success: function (data) {
            if (data === "success") {
                return $.growl.notice({
                    title: "消息提醒",
                    message: "保存成功",
                    location: "br"
                });
            } else {
                return $.growl.error({
                    title: "消息提醒",
                    message: "保存失败，请重试",
                    location: "br"
                });
            }
        }
    });
}

/* 审核题目 */
function check(questionId, questionStatus) {
    $.ajax({
        url: "../question/check",
        method: "POST",
        data: {
            questionID: questionId,
            questionStatus: questionStatus
        },
        success: function (data) {
            if (data === "success") {
                if (questionStatus === '1') {
                    $("#question-status").html("状态：已选中");
                    return $.growl.notice({
                        title: "消息提醒",
                        message: "该试题已被选中",
                        location: "br"
                    });
                } else {
                    $("#question-status").html("状态：未选中");
                    return $.growl.notice({
                        title: "消息提醒",
                        message: "该试题已被丢弃",
                        location: "br"
                    });
                }
            }
            else {
                return $.growl.error({
                    title: "消息提醒",
                    message: "审核失败，请重试",
                    location: "br"
                });
            }
        }
    });
}