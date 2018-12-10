$(function () {
   /* $('#loginDialog').show().dialog({
        modal : true,
        closable : false,
        buttons : [ {
            text : '注册',
            handler : function() {
                $('#registerDialog').dialog('open');
            }
        }, {
            text : '登录',
            handler : function() {
            }
        } ]
    });*/
    $('#toRegister1').click(function () {
        alert("zhuce");
        // alert('${pageContext.request.contextPath}');
        // console.info(456)
        // console.info('${pageContext.request.contextPath}')
        window.location.href="http://localhost:8010/views/user/register.jsp";
    });
    function toRegister() {
        alert("123");
        window.location.href="http://localhost:8010/views/user/register.jsp";
    }
    //进入页面获取焦点
    $('#userName').textbox().next('span').find('input').focus();
    //回车触发事件
    document.onkeydown=function(e){
        var keycode=document.all?event.keyCode:e.which;
        if(keycode==13) {
            login();
        }
    };
    $("#login").click(function(){
        login();
    })
    function  login() {
        if($("#loginForm").form("validate")){
            var userName=$("#userName").val();
            var password=$("#password").val();
            $.ajax({
                url:"/user/login",
                type:"post",
                data:JSON.stringify({"userName":userName,"password":password}),
                dataType:"json",
                contentType:"application/json",
                success:function(result) {
                      if(result.res=="success"){
                          window.location.href="http://localhost:8010/index.jsp";
                      }
                      if(result.res=="fail"){
                          $.messager.alert("通知",result.desc,"error");
                      }
                }
            });
        }
    }

});
