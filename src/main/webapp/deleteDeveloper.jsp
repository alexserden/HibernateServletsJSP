<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DeleteDeveloper</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/delete" method="POST">
    <%--@declare id="developerid"--%><label for="developerId">Id</label>
    <input type="text" class="form-control" name="developerId" placeholder="Developer id">
    <button type="submit" class="btn btn-primary">Delete</button>
</body>
<br>
<a href="mypage.jsp"><-- back</a>
</html>
