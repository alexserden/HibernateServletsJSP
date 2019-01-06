<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>ListDeveloper</title>
</head>
<body>
<table>
    <colgroup>
        <col span="2" style="background:Khaki"><!-- С помощью этой конструкции задаем цвет фона для первых двух столбцов таблицы-->
        <col style="background-color:#ff564f"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
        <col style="background-color:#33d1ff"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
        <col style="background-color:#2cff23"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
        <col style="background-color:#d94cff"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
    </colgroup>
    <tr>
        <th >ID</th>
        <th >FIRST_NAME</td>
        <th >LAST_NAME</td>
        <th>SPECIALTY</td>
        <th>SKILLS</td>
        <th>ACCOUNTS</td>
    </tr>

                <c:forEach items="${temp}" var="d" >
    <tr>
                    <td>${d.id}</td>
                    <td>${d.firstName}</td>
                    <td>${d.lastName}</td>
                    <td>${d.specialty}</td>
                    <c:forEach items="${d.skills}" var="trt">
                        <td>${trt.name}</td><br>
                    </c:forEach>
                    <td>${d.account.accountData}</td>
    </tr>

                </c:forEach>
     </table>


    <input name="action" type="submit" value="Add Developer" />
  </body>
</html>