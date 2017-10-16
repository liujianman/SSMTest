
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="static/js/jquery-3.2.1.min.js"></script>
    <title>Title</title>
</head>
<body>
     生成的验证码： <img src="/code/captcha-image" id="kaptchaImage"/> <a href="#" onclick="changeCode()">看不清?换一张</a>
    <br><br>
     请输入验证码：<input id="captchaCode" type="text"> <input type="button" value="提交验证" onclick="checkCaptcha()">
 </body>
<script type="text/javascript">
    $(function(){  //生成验证码
        $('#kaptchaImage').click(function () {
            $(this).hide().attr('src', '/code/captcha-image?' + Math.floor(Math.random()*100) ).fadeIn(); });
    });

    window.onbeforeunload = function(){
        //关闭窗口时自动退出
        if(event.clientX>360&&event.clientY<0||event.altKey){
            alert(parent.document.location);
        }
    };

    function changeCode() {  //刷新
        $('#kaptchaImage').hide().attr('src', '/code/captcha-image?' + Math.floor(Math.random()*100) ).fadeIn();
        event.cancelBubble=true;
    }

    //验证输入的验证码
     function checkCaptcha(){
             var captchaCode = $("#captchaCode").val();
             $.ajax({
                     type:'post',
                     async : false,
                     url:'checkCaptchaCode',
                     data:{"captchaCode" : captchaCode},
                 success:function(res){
                         alert(res);
                     }
             });
         }
</script>
</html>