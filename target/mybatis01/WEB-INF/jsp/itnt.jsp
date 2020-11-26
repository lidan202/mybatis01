<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@include file="../../common/ctx.jsp"%>
<html>
<head>
    <title>国际化</title>
</head>
<body>
<a href="${ctx}/change"><s:message code="language.label"/></a><br/>
<s:message code="yhzh.label"/><input/>
<s:message code="yhmm.label"/><input/>
</body>
</html>
