<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>试题详情</title>
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/bootstrap-select.js"></script>
    <script src="../js/jquery.growl.js"></script>
    <script src="../js/detail.js"></script>

    <link rel="stylesheet" href="../css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../css/jquery.growl.css"/>
    <link rel="stylesheet" href="../css/bootstrap-select`"/>

    <script>
        $(document).ready(function () {

            var gradeDiv = $("#div-grade");
            var courseDiv = $("#div-course");
            var knowledgeDiv = $("#div-knowledge");

            var gradePhaseObj = $("#select-gradePhase");
            var gradeObj = $("#select-grade");
            var courseObj = $("#select-course");
            var knowledgeObj = $("#select-knowledge");
            var basicObj = $("#select-basicKnowledge");

            gradePhaseObj.change(function () {
                var gradePhaseID = gradePhaseObj.val();
                $.ajax({
                    method: "get",
                    url: "../subject/getGradeInfo?gradePhaseID=" + gradePhaseID,
                    success: function (data) {
                        gradeObj.empty();
                        // 该阶段存在年级信息（小学和初中），则添加，否则直接显示课程信息
                        if (data.length !== 0) {
                            $.each(data, function (i, item) {
                                var gradeID = item.gradeID;
                                var gradeName = item.gradeName;
                                console.log(gradeID + " " + gradeName);

                                var optionStr = "<option value='" + gradeID + "'>" + gradeName + "</option>";
                                console.log(optionStr);
                                gradeObj.append(optionStr);
                            });

                            gradeDiv.css('display', 'block');
                            courseDiv.css('display', 'none');
                            knowledgeDiv.css('display', 'none');
                        } else {
                            gradeDiv.css('display', 'none');
                            $.ajax({
                                method: "get",
                                url: "../subject/getSubjectByGradePhaseID?gradePhaseID=" + gradePhaseID,
                                success: function (data) {
                                    courseObj.empty();

                                    $.each(data, function (i, item) {
                                        var subjectID = item.subjectID;
                                        var subjectName = item.subjectName;

                                        var optionStr = "<option value='" + subjectID + "'>" + subjectName + "</option>";
                                        console.log(optionStr);
                                        courseObj.append(optionStr);
                                        courseDiv.css('display', 'block');
                                        knowledgeDiv.css('display', 'none');
                                    })
                                }
                            })
                        }
                    }
                })
            });

            gradeObj.change(function () {
                var gradeID = gradeObj.val();
                console.log(gradeID);

                $.ajax({
                    method: "get",
                    url: "../subject/getSubjectByGradeID?gradeID=" + gradeID,
                    success: function (data) {
                        courseObj.empty();

                        $.each(data, function (i, item) {

                            var subjectID = item.subjectID;
                            var courseName = item.courseName;
                            var booklet = item.booklet;

                            var optionStr;
                            if (booklet != null) {
                                optionStr = "<option value='" + subjectID + "'>" + courseName + booklet + "</option>";
                            } else {
                                optionStr = "<option value='" + subjectID + "'>" + courseName + "</option>";
                            }

                            console.log(optionStr);
                            courseObj.append(optionStr);
                        });

                        courseDiv.css('display', 'block');
                        knowledgeDiv.css('display', 'none');
                    }
                })
            });

            courseObj.change(function () {
                var subjectID = courseObj.val();

                $.ajax({
                    method: "get",
                    url: "../subject/getSubjectByID?subjectID=" + subjectID,
                    success: function (data) {
                        knowledgeObj.empty();
                        $.each(data, function (i, item) {
                            var knowledgeID = item.knowledgeID;
                            var knowledgeContent = item.content;

                            var optionStr = "<option value='" + knowledgeID + "'>" + knowledgeContent + "</option>";
                            knowledgeObj.append(optionStr);
                        });

                        knowledgeDiv.css('display', 'block');
                    }
                })
            });

            basicObj.change(function () {
                var subjectID = basicObj.val();
                $.ajax({
                    method: "get",
                    url: "../subject/getSubjectByID?subjectID=" + subjectID,
                    success: function (data) {
                        knowledgeObj.empty();
                        $.each(data, function (i, item) {
                            var knowledgeID = item.knowledgeID;
                            var knowledgeContent = item.content;

                            var optionStr = "<option value='" + knowledgeID + "'>" + knowledgeContent + "</option>";
                            knowledgeObj.append(optionStr);
                        });

                        knowledgeDiv.css('display', 'block');
                        gradeDiv.css('display', 'none');
                        courseDiv.css('display', 'none');
                    }
                })

            });
        });

        function changeKnowledge(questionID) {
            var knowledgeID = $("#select-knowledge").val();
            $.ajax({
                method: "post",
                url: "../question/changeKnowledge",
                data: {
                    knowledgeID: knowledgeID,
                    questionID: questionID
                },
                success: function (data) {
                    if (data === "success") {
                        alert("知识点更新成功！");
                        window.location.reload();
                    } else {
                        return $.growl.error({
                            title: "消息提醒",
                            message: "知识点更新失败",
                            location: "br"
                        });
                    }
                }
            })
        }
    </script>
</head>

<body>

<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="page-header">
                <h1>试题
                    <small> ${multipleChoiceQuestionVO.questionNo}</small>
                </h1>
                <h3>
                    <strong id="question-status">状态：
                        <#switch multipleChoiceQuestionVO.isCheckPass>
                            <#case "0">未审核<#break>
                            <#case "1">已选中<#break>
                            <#case "2">未选中<#break>
                        </#switch>
                    </strong>
                </h3>
            </div>
        </div>
    </div>

    <div class="row well">

        <br>
        <div class="row">
            <#if multipleChoiceQuestionVO.gradePhaseName??>
                <div class="col-md-2">
                    <strong>阶 段：${multipleChoiceQuestionVO.gradePhaseName}</strong>
                </div>
            </#if>

            <#if multipleChoiceQuestionVO.courseName??>
                <div class="col-md-2">
                    <strong>科 目：${multipleChoiceQuestionVO.courseName}</strong>
                </div>
            </#if>

            <#if multipleChoiceQuestionVO.gradeName??>
                <div class="col-md-2">
                    <strong>年 级：${multipleChoiceQuestionVO.gradeName}</strong>
                </div>
            </#if>

            <#if multipleChoiceQuestionVO.booklet??>
                <div class="col-md-2">
                    <strong>分 册：${multipleChoiceQuestionVO.booklet}</strong>
                </div>
            </#if>

            <div class="col-md-4 form-inline">
                <label for="difficulty">难度系数：</label>
                <input id="difficulty" type="text" value="#{multipleChoiceQuestionVO.difficulty}">
            </div>
        </div>

        <br>
        <div class="row">
            <div class="col-md-8">
                <strong>知识点：${multipleChoiceQuestionVO.content}</strong>
            </div>

            <div class="col-md-2">
                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#knowledgeModal">
                    修改知识点
                </button>
            </div>
        </div>
    </div>

    <br>
    <div class="row">
        <div class="panel panel-info">
            <div class="panel-heading">
                <strong>【题干】：</strong>
            </div>
            <div class="panel-body" id="question-title">
                <textarea class="form-control" rows="5" style="resize: none"
                          id="editor-question">${multipleChoiceQuestionVO.question}</textarea>
                <hr>

                <div class="col-md-12 form-inline">
                    <label for="choiceA" class="control-label">选项A：</label>
                    <input id="choiceA" type="text" class="form-control" style="width: 80%"
                           value="${multipleChoiceQuestionVO.choiceA}">
                </div>
                <div class="col-md-12 form-inline">
                    <label for="choiceB" class="control-label">选项B：</label>
                    <input id="choiceB" type="text" class="form-control" style="width: 80%;margin-top: 1%"
                           value="${multipleChoiceQuestionVO.choiceB}">
                </div>
                <div class="col-md-12 form-inline">
                    <label for="choiceC" class="control-label">选项C：</label>
                    <input id="choiceC" type="text" class="form-control" style="width: 80%;margin-top: 1%"
                           value="${multipleChoiceQuestionVO.choiceC}">
                </div>
                <div class="col-md-12 form-inline">
                    <label for="choiceD" class="control-label">选项D：</label>
                    <input id="choiceD" type="text" class="form-control" style="width: 80%;margin-top: 1%"
                           value="${multipleChoiceQuestionVO.choiceD}">
                </div>
            </div>
        </div>
    </div>

    <br>
    <div class="row">
        <div class="panel panel-success">
            <div class="panel-heading">
                <strong>【答案】：</strong>
            </div>
            <div class="panel-body">
                <textarea id="answer" class="form-control" rows="5"
                          style="resize: none">${multipleChoiceQuestionVO.answer}</textarea>
            </div>
        </div>
    </div>

    <br>
    <div class="row">
        <div class="panel panel-warning">
            <div class="panel-heading">
                <strong>【解析】：</strong>
            </div>
            <div class="panel-body">
                <textarea class="form-control" rows="5" style="resize: none"
                          id="editor-analyse"><#if multipleChoiceQuestionVO.questionAnalyze??>
                    ${multipleChoiceQuestionVO.questionAnalyze}
                <#else></#if></textarea>
            </div>
        </div>
    </div>

    <div class="row" style="margin-bottom: 2%;">
        <div class="col-md-8 col-md-offset-4">
            <button class="btn btn-primary" onclick="saveInfo('${multipleChoiceQuestionVO.questionID}')">保存信息</button>&nbsp;&nbsp;&nbsp;&nbsp;
            <button class="btn btn-success" onclick="check('${multipleChoiceQuestionVO.questionID}', '1')">设为已选</button>&nbsp;&nbsp;&nbsp;&nbsp;
            <button class="btn btn-danger" onclick="check('${multipleChoiceQuestionVO.questionID}', '2')">设为未选</button>&nbsp;&nbsp;&nbsp;&nbsp;
        </div>
    </div>
</div>


<!-- Modal -->
<div class="modal fade" id="knowledgeModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">选择知识点</h4>
            </div>
            <div class="modal-body">

                <form class="form-horizontal">
                    <div class="form-group">
                        <label class="control-label col-md-4">请选择阶段信息：</label>
                        <div class="col-md-7">
                            <select id="select-gradePhase" class="form-control">
                                <#list gradePhaseInfoVOList as gradePhaseInfo>
                                    <option value="${gradePhaseInfo.gradePhaseID}">${gradePhaseInfo.gradePhaseName}</option>
                                </#list>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="control-label col-md-4">请选择对应基础知识：</label>
                        <div class="col-md-7">
                            <select id="select-basicKnowledge" class="form-control">
                                <#list basicKnowledgeSubject as basicSubject>
                                    <option value="${basicSubject.subjectID}">${basicSubject.subjectName}</option>
                                </#list>
                            </select>
                        </div>
                    </div>

                    <hr style="height:1px;border:none;border-top:1px solid #555555;">

                    <div class="form-group" id="div-grade" style="display: none">
                        <label class="control-label col-md-4">请选择年级信息：</label>
                        <div class="col-md-7">
                            <select id="select-grade" class="form-control">

                            </select>
                        </div>
                    </div>

                    <div class="form-group" id="div-course" style="display: none">
                        <label class="control-label col-md-4">请选择学科信息：</label>
                        <div class="col-md-7">
                            <select id="select-course" class="form-control">

                            </select>
                        </div>
                    </div>

                    <div class="form-group" id="div-knowledge" style="display: none">
                        <label class="control-label col-md-4">请选择知识点：</label>
                        <div class="col-md-7">
                            <select id="select-knowledge" class="form-control">
                                <option>我是测试知识点</option>
                            </select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary"
                        onclick="changeKnowledge('${multipleChoiceQuestionVO.questionID}')">保存信息
                </button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
