<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/11/15
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../common/ctx.jsp"%>
<html>
    <head>
        <title>登录</title>
    </head>
    <body>
<%--    <img src="/img/3.gif"/><br/>--%>
<%--    <img src="/images/2.gif"/>--%>
<h1>用户登录</h1>
<h2>${msg}</h2>
        <form action="${ctx}/shiro/dologin" method="post">
            账号：<input type="text" name="username"/><br/>
            密码：<input type="password" name="password"/><br/>
            <input type="submit"/>
        </form>
    </body>
    <html>
