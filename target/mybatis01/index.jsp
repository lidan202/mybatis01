<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
你好<h2>Hello World!</h2>
<input type="button" onclick="test()" value="点击" />
<script>
    function test(){
        var url = "http://localhost:8080/mybatis01/book/getall";
        window.location.href= url;
    }

</script>
</body>
</html>
