$(function () {
    //关闭注册页面后返回登陆页面
    $('#registerDialog').window({
        onClose:function () {
            window.location.href="http://localhost:8010/views/user/login.jsp";
        }
    });
    //进入页面获取焦点
    $("#name").textbox().next("span").find("input").focus();

    //注册
    $('#register').click(function () {
         register();
    });

    //回车触发事件
    document.onkeydown=function (e) {
        var keyCode=document.all?event.keyCode:e.which;
        if(keyCode==13){
            register();
        }
    }

    //注册用户
    function register() {
        if ($('#registerForm').form('validate')) {
            var name=$("#name").val();
            var pwd=$("#pwd").val();
            var mail=$("#mail").val();
            var repeatPwd=$("#repeatPwd").val();
            if(pwd!=repeatPwd){
                $.messager.alert("通知","密码不一致");
                return;
            }
            if(mail==""){
                $.messager.alert("通知","邮箱不能为空");
                return;
            }
            debugger;
            $.ajax({
                url:"/user/register",
                type:"post",
                data:JSON.stringify({"name":name,"pwd":pwd,"repeatPwd":repeatPwd,"mail":mail}),
                // data:$("#registerForm").serialize(),
                dataType:"json",
                contentType:"application/json",
                success:function (result) {
                    if("success"==result.res){
                        $.messager.alert("通知",result.desc,"info")
                        // history.back();
                    }
                    if("fail"==result.res){
                        $.messager.alert("通知",result.desc,"error")
                    }
                }

            });
        }
    }

})