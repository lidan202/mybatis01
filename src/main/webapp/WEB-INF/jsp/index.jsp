<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../../common/ctx.jsp" %>
<html>
<head>
    <title>springmvc</title>
</head>
<body>
<h1>哈喽呀！</h1>
<form action="${ctx}/book/getall" method="post">
    <input name="bookName"/>
    <input type="submit"/>
</form><a href="${ctx}/book/toAdd">新增</a>
<table border="1px" width="60%">
    <tr>
        <td>书本编号</td>
        <td>书本名称</td>
        <td>书本价格</td>
        <td>书本简介</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${books}" var="i">
        <tr>
            <td>${i.getBookId()}</td>
            <td>${i.getBookName()}</td>
            <td>${i.getBookPrice()}</td>
            <td>${i.getBookBrief()}</td>
            <td>
                <a href="${ctx}/book/toUpdate?bookId=${i.getBookId()}">修改</a>
                <a href="javascript:mya(${i.getBookId()})">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<script>
    function mya(bid) {
        var a=confirm("确认删除？");
        if(a){
            location.href="/mybatis01/book/dodel?bookId="+bid;
        }
    }
</script>
</body>
</html>