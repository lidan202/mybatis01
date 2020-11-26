<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../common/ctx.jsp" %>
<%@taglib prefix="t" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<form action="${ctx}/book/doUpdate" method="post">
    <input type="hidden" name="bookId" value="${b.getBookId()}"/>
    书本名称：<input type="text" name="bookName" value="${b.getBookName()}"/><br/>
    书本价格：<input type="text" name="bookPrice" value="${b.getBookPrice()}"/><br/>
    书本简介：<input type="text" name="bookBrief" value="${b.getBookBrief()}"/><br/>
    <input type="submit"/>
</form>
</body>
</html>
