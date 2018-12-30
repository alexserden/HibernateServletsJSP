<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Devcolibri.com</title>
</head>
<body>
<c:forEach items="${temp}" var="d" >
    <c:out value="${d.id}"/>
</c:forEach>
</body>
</html>
