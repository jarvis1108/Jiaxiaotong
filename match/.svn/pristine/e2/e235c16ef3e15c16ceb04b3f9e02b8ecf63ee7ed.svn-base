<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>试题审核</title>

    <script src="../js/jquery-3.3.1.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/bootstrap-select.js"></script>
    <script src="../js/jquery.growl.js"></script>
    <script src="../js/question.js"></script>

    <link rel="stylesheet" href="../css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../css/jquery.growl.css"/>
    <link rel="stylesheet" href="../css/bootstrap-select.css"/>
</head>

<body>
<div class="container">

    <div class="row" style="float: right">
        <h4>${Session["user"]}
            <a href="../logout">退 出</a></h4>
    </div>


    <div class="row">
        <div class="col-md-12">
            <h1>试题审核</h1>
        </div>
    </div>

    <hr>

    <div class="row">
        <div class="col-md-12">
            <form class="form-inline">
                <div class="form-group">
                    <label>阶 段：</label>
                    <select class="selectpicker" id="gradePhaseName">
                        <option value="全部" selected>全部</option>
                        <option value="小学">小学</option>
                        <option value="初中">初中</option>
                        <option value="高中">高中</option>
                        <option value="大学">大学</option>
                    </select>
                </div>
                <div class="form-group" style="padding-left: 2%">
                    <label>科 目：</label>
                    <select class="selectpicker" id="courseName">
                        <option value="全部" selected>全部</option>
                        <option value="语文">语文</option>
                        <option value="数学">数学</option>
                        <option value="英语">英语</option>
                        <option value="科学">科学</option>
                        <option value="物理">物理</option>
                        <option value="化学">化学</option>
                        <option value="生物">生物</option>
                        <option value="政治">政治</option>
                        <option value="历史">历史</option>
                        <option value="地理">地理</option>
                    </select>
                </div>
                <div class="form-group" style="padding-left: 2%">
                    <label>初始化信息：</label>
                    <select class="selectpicker" id="initID">
                        <option value="全部">全部</option>
                        <#list mainList as main>
                            <option value="${main.initID}">${main.initName}</option>
                        </#list>
                    </select>
                </div>
            </form>
        </div>
        <div class="col-md-12" style="padding-top: 2%">
            <form class="form-inline">
                <div class="form-group">
                    <label>年 级：</label>
                    <select class="selectpicker" id="gradeName">
                        <option value="全部" selected>全部</option>
                        <option value="一年级">一年级</option>
                        <option value="二年级">二年级</option>
                        <option value="三年级">三年级</option>
                        <option value="四年级">四年级</option>
                        <option value="五年级">五年级</option>
                        <option value="六年级">六年级</option>
                        <option value="七年级">七年级</option>
                        <option value="八年级">八年级</option>
                        <option value="九年级">九年级</option>
                    </select>
                </div>
                <div class="form-group" style="padding-left: 2%">
                    <label>分 册：</label>
                    <select class="selectpicker" id="booklet">
                        <option value="全部" selected>全部</option>
                        <option value="上册">上册</option>
                        <option value="下册">下册</option>
                        <option value="必修">必修</option>
                        <option value="选修">选修</option>
                    </select>
                </div>
                <div class="form-group" style="padding-left: 2%">
                    <label>状 态：</label>
                    <select class="selectpicker" id="isCheckPass">
                        <option value="全部" selected>全部</option>
                        <option value="0">未审核</option>
                        <option value="1">已选中</option>
                        <option value="2">未选中</option>
                    </select>
                </div>
                <a type="button" onclick="jump(1)"
                   class="btn btn-primary" style="margin-left: 5%;width: 6%">查 询
                </a>
                <a type="button" onclick="window.location.reload()"
                   class="btn btn-primary" style="margin-left: 2%;width: 6%">刷 新
                </a>
            </form>
        </div>
    </div>

    <br><br>

    <div class="row">
        <div class="col-md-12">
            <table class="table table-striped table-bordered" style="text-align: center">
                <tr>
                    <th style="text-align: center">编号</th>
                    <th style="text-align: center">题目</th>
                    <th style="text-align: center">阶段</th>
                    <th style="text-align: center">科目</th>
                    <th style="text-align: center">年级</th>
                    <th style="text-align: center">分册</th>
                    <th style="text-align: center">知识点</th>
                    <th style="text-align: center">状态</th>
                    <th style="text-align: center">操作</th>
                </tr>

                <#list pageInfo.list as multipleChoiceQuestion>
                    <tr>
                        <td>${multipleChoiceQuestion_index + 1}</td>
                        <td style="text-align: left;">
                            <#if multipleChoiceQuestion.question?replace("<img[^>]+>","","ri")?length lt 25>
                                ${multipleChoiceQuestion.question}
                            <#else>
                                ${multipleChoiceQuestion.question?replace("<img[^>]+>","","ri")?substring(0,25)}...
                            </#if>
                        </td>
                        <td>
                            <#if multipleChoiceQuestion.gradePhaseName??>
                                ${multipleChoiceQuestion.gradePhaseName}
                            <#else>

                            </#if>

                        </td>
                        <td>
                            <#if multipleChoiceQuestion.courseName??>
                                ${multipleChoiceQuestion.courseName}
                            <#else>

                            </#if>
                        </td>
                        <td>
                            <#if multipleChoiceQuestion.gradeName??>
                                ${multipleChoiceQuestion.gradeName}
                            <#else>

                            </#if>

                        </td>
                        <td>
                            <#if multipleChoiceQuestion.booklet??>
                                ${multipleChoiceQuestion.booklet}
                            <#else>

                            </#if>
                        </td>
                        <td>
                            <#if multipleChoiceQuestion.content??>
                                ${multipleChoiceQuestion.content}
                            <#else>

                            </#if>
                        </td>
                        <td>
                            <strong id="question-status-${multipleChoiceQuestion.questionID}">
                            <#switch multipleChoiceQuestion.isCheckPass>
                                <#case "0">未审核<#break>
                                <#case "1">已选中<#break>
                                <#case "2">未选中<#break>
                            </#switch>
                            </strong>
                        </td>
                        <td style="text-align: center">
                            <button type="button" class="btn btn-success btn-sm"
                                    onclick="checkQuestion('${multipleChoiceQuestion.questionID}', '1')">
                                <span class="glyphicon glyphicon-ok" aria-hidden="true"></span> 设为已选
                            </button>

                            <button type="button" class="btn btn-danger btn-sm"
                                    onclick="checkQuestion('${multipleChoiceQuestion.questionID}', '2')">
                                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span> 设为未选
                            </button>

                            <button type="button" class="btn btn-primary btn-sm"
                                    onclick="showDetail('${multipleChoiceQuestion.questionID}')">
                                <span class="glyphicon glyphicon-book" aria-hidden="true"></span> 查看详情
                            </button>
                        </td>
                    </tr>
                </#list>
            </table>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            当前第 #{pageInfo.pageNum} 页，共 ${pageInfo.pages} 页，共 ${pageInfo.total} 条记录
        </div>
    </div>

    <div class="row" style="text-align: center">
        <div class="col-md-12">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <#if pageInfo.isFirstPage>

                    </#if>
                    <li><a href="#" onclick="jump(1);return false;">首页</a>
                    </li>

                    <#if pageInfo.hasPreviousPage>
                        <li>
                            <a href="#"
                               onclick="jump(#{pageInfo.pageNum - 1});return false;"
                               aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </#if>

                    <#list pageInfo.navigatepageNums as pageNumber>
                        <#if pageNumber == pageInfo.pageNum>
                            <li class="active"><a href="#"
                                                  onclick="jump(#{pageNumber});return false;">#{pageNumber}</a>
                            </li>
                        <#else>
                            <li><a href="#"
                                   onclick="jump(#{pageNumber});return false;">#{pageNumber}</a>
                            </li>
                        </#if>
                    </#list>

                    <#if pageInfo.hasNextPage>
                        <li>
                            <a href="#"
                               onclick="jump(#{pageInfo.pageNum + 1});return false;"
                               aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </#if>
                    <li><a href="#"
                           onclick="jump(#{pageInfo.pages})">末页</a>
                    </li>

                    <li style="margin-left: 1%">
                        <select class="selectpicker" id="pageSize">
                            <option value="5">5条/页</option>
                            <option value="10">10条/页</option>
                            <option value="15">15条/页</option>
                            <option value="20">20条/页</option>
                            <option value="30">30条/页</option>
                            <option value="40">40条/页</option>
                            <option value="50">50条/页</option>
                        </select>
                    </li>

                    <li style="font-size: 110%; padding-left: 1%">
                        跳转到 <input id="pageNumber" type="number" min="1" class="form-control"
                                   style="width: 10%;display: inline"> 页
                        <button class="btn btn-primary" onclick="go()">Go</button>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</div>
</body>
</html>