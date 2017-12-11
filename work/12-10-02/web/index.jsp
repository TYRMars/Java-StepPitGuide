<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2017/12/10
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <script language="JavaScript">
    function login() {
        var resultDiv = document.getElementsById("resultDiv");
        var account = document.loginForm.account.value;
        var password = document.loginForm.password.value;
        var xmlHttp = new ActiveXObject("Msxm12.XMLHTTP");
        var url = "servlet/LoginServlet?account = " + account + "&password=" + password;
        xmlHttp.open("post",url,true);
        xmlHttp.onreadystatechange = function () {
            if (xmlHttp.readyState == 4){
                resultDiv.innerHTML = xmlHttp.responseText;
            }else{
                resultDiv.innerHTML = "...loading..."
            }
        }
        xmlHttp.send();
    }
  </script>
  </body>
</html>
