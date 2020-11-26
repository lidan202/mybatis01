<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/11/17
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../common/ctx.jsp"%>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="${ctx}/doupload" method="post" enctype="multipart/form-data">
    <input type="file" name="mf"/><input type="submit"/>
</form>
</body>
</html>
