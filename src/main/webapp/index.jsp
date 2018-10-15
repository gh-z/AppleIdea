<%@ page import="com.entry.Apple" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<body>
<h2>Hello World!</h2>
<%
    String name = Apple.getName();
%>
<%=name%>
</body>
</html>
