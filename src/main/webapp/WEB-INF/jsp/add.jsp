<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../common/ctx.jsp"%>
<%@taglib prefix="t" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>新增</title>
</head>
<body>
${msg}
<t:form action="${ctx}/book/doAdd" method="post">
    书本名称：<t:input path="bookName"/><br/><t:errors path="bookName"/>
    书本价格：<t:input path="bookPrice"/><br/><t:errors path="bookPrice"/>
    书本简介：<t:input path="bookBrief"/><br/>
    <input type="submit"/>
</t:form>
<%--<form action="${ctx}/book/doAdd" method="post">--%>
<%--    书本名称：<input type="text" name="bookName"/><br/>--%>
<%--    书本价格：<input type="text" name="bookPrice"/><br/>--%>
<%--    书本简介：<input type="text" name="bookBrief"/><br/>--%>
<%--    <input type="submit"/>--%>
<%--</form>--%>
</body>
</html>
