<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/1/22
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        //客户端
        Cookie[] cookies=request.getCookies();
        for(Cookie cookie:cookies){
            out.print(cookie.getName()+"    "+cookie.getValue());
        }
    %>
</body>
</html>
