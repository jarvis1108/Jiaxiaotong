<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登陆</title>

    <script src="./js/jquery-3.3.1.min.js"></script>
    <script src="./js/jquery.growl.js"></script>

    <link rel="stylesheet" href="./css/jquery.growl.css"/>
    <link rel="stylesheet" href="./css/normalize.css">
    <link rel="stylesheet" href="./css/index.css">
</head>

<body>

<div class="login">
    <h1>最强学霸审题系统</h1>
    <form>
        <input type="text" id="code" placeholder="员工编号" required="required"/>
        <input type="text" id="username" placeholder="员工姓名" required="required"/>
        <button type="button" onclick="login()" class="btn btn-primary btn-block btn-large">登 录</button>
    </form>
</div>

<script>
    function login() {
        var username = $("#username").val();
        var code = $("#code").val();

        $.ajax({
            method: "POST",
            url: "./login",
            data: {
                username: username,
                code: code
            },
            success: function (data) {
                if (data === "success") {
                    window.location.href = "./question/index";
                } else if (data === "false") {
                    return $.growl.error({
                        title: "消息提醒",
                        message: "员工不存在",
                        location: "br"
                    });
                } else {
                    return $.growl.error({
                        title: "消息提醒",
                        message: "员工编号和姓名不匹配",
                        location: "br"
                    });
                }
            }
        })
    }
</script>

</body>
</html>
