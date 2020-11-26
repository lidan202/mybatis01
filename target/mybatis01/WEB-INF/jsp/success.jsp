<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/11/23
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>成功~</title>
</head>
<body>
<h1>这是登陆成功后看到的页面</h1>
<s:hasPermission name="书本新增">

</s:hasPermission>
<a href="">高级用户</a>
<s:hasRole name="管理员">
    <a>管理员</a>
</s:hasRole>
</body>
</html>
