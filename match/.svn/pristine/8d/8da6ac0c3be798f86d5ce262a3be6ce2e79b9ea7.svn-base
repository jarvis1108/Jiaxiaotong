/* 获取url中的参数方法 */
function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
    if (r != null) return decodeURI(r[2]);
    return null; //返回参数值
}

/* 修改选择框的内容 */
function changeSelectedContent(obj, value) {
    if (value === null)
        obj.find("option[text='全部']").attr("selected", true);
    else
        obj.val(value);
}

// 获取url中的参数
var gradePhaseName = getUrlParam("gradePhaseName");
var courseName = getUrlParam("courseName");
var gradeName = getUrlParam("gradeName");
var booklet = getUrlParam("booklet");
var isCheckPass = getUrlParam("isCheckPass");
var pageSize = getUrlParam("pageSize");
var initID = getUrlParam("initID");

$(document).ready(function () {
    var gradePhaseNameObj = $("#gradePhaseName");
    var courseNameObj = $("#courseName");
    var gradeNameObj = $("#gradeName");
    var bookletObj = $("#booklet");
    var isCheckPassObj = $("#isCheckPass");
    var initIDObj = $("#initID");

    changeSelectedContent(gradePhaseNameObj, gradePhaseName);
    changeSelectedContent(courseNameObj, courseName);
    changeSelectedContent(gradeNameObj, gradeName);
    changeSelectedContent(bookletObj, booklet);
    changeSelectedContent(isCheckPassObj, isCheckPass);
    changeSelectedContent(initIDObj, initID);

    var pageSizeObj = $("#pageSize");
    if (pageSize === null)
        pageSizeObj.find("option[text='10条/页']").attr("selected", true);
    else
        pageSizeObj.val(pageSize);

    gradePhaseNameObj.change(function () {
        gradePhaseName = gradePhaseNameObj.val();
        if (gradePhaseName === "全部")
            gradePhaseName = null;
    });
    courseNameObj.change(function () {
        courseName = courseNameObj.val();
        if (courseName === "全部")
            courseName = null;
    });
    gradeNameObj.change(function () {
        gradeName = gradeNameObj.val();
        if (gradeName === "全部")
            gradeName = null;
    });
    bookletObj.change(function () {
        booklet = bookletObj.val();
        if (booklet === "全部")
            booklet = null;
    });
    isCheckPassObj.change(function () {
        isCheckPass = isCheckPassObj.val();
        if (isCheckPass === "全部")
            isCheckPass = null;
    });
    pageSizeObj.change(function () {
        pageSize = pageSizeObj.val();
        jump(1);
    });

    initIDObj.change(function () {
        initID = initIDObj.val();
        console.log(initID);
        if (initID === "全部")
            initID = null;
    });
});

/* 分页跳转 */
function jump(pn) {
    var url = "../question/index?pn=" + pn;
    if (pageSize != null)
        url = url + "&pageSize=" + pageSize;
    if (gradePhaseName != null)
        url = url + "&gradePhaseName=" + gradePhaseName;
    if (courseName != null)
        url = url + "&courseName=" + courseName;
    if (gradeName != null)
        url = url + "&gradeName=" + gradeName;
    if (booklet != null)
        url = url + "&booklet=" + booklet;
    if (isCheckPass != null)
        url = url + "&isCheckPass=" + isCheckPass;
    if (initID != null)
        url = url + "&initID=" + initID;
    window.location.href = url;
}

/* 用户自定义跳转 */
function go() {
    var pn = $("#pageNumber").val();
    if (pn === null || pn === "") {
        return $.growl.error({
            title: "消息提醒",
            message: "请先输入页码",
            location: "br"
        });
    }

    if (pn < 1) {
        return $.growl.error({
            title: "消息提醒",
            message: "请输入正确页码",
            location: "br"
        });
    } else {
        jump(pn);
    }
}

/* 查看详情 */
function showDetail(questionID) {
    window.open("../question/detail?questionID=" + questionID);
}

/* 试题审核 */
function checkQuestion(questionId, questionStatus) {
    $.ajax({
        url: "../question/check",
        method: "POST",
        data: {
            questionID: questionId,
            questionStatus: questionStatus
        },
        success: function (data) {
            var id = "#question-status-" + questionId;

            if (data === "success") {
                if (questionStatus === '1') {
                    $(id).html("已选中");
                } else {
                    $(id).html("未选中");
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
