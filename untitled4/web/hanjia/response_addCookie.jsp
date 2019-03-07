<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/1/22
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        //服务端发送Cookie
        Cookie cookie=new Cookie("name","hua");
        Cookie cookie1=new Cookie("pwd","123");

        response.addCookie(cookie);
        response.addCookie(cookie1);

        //服务器跳转
        response.sendRedirect("result.jsp");


    %>
</body>
</html>
