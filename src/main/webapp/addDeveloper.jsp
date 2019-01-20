
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addDeveloper</title>
</head>
<body>
<form action="/temp" method="POST">
    <div class="form-group">
        <%--@declare id="developerfirstname"--%><label for="developerFirstName">First name</label>
        <input type="text" class="form-control" name="developerFirstName" placeholder="Developer first name">
    </div>
    <div class="form-group">
        <%--@declare id="developerlastname"--%><label for="developerLastName">Last name</label>
        <input type="text" class="form-control" name="developerLastName" placeholder="Developer last name">
    </div>

    <div class="form-group">
        <%--@declare id="developerspecialty"--%><label for="developerSpecialty">Specialty</label>
        <input type="text" class="form-control" name="developerSpecialty" placeholder="Developer specialty">
    </div>
    <div class="form-group">
        <%--@declare id="developeraccount"--%><label for="developerAccount">Account</label>
        <input type="text" class="form-control" name="developerAccount" placeholder="Developer account">
    </div>
    <div class="form-group">
        <%--@declare id="developerskill"--%><label for="developerSkill">Skill</label>
        <input type="text" class="form-control" name="developerSkill" placeholder="Developer skill">
    </div>



    <button type="submit" class="btn btn-primary">Save</button>
</form>
<a href="mypage.jsp"><-- back</a>
</body>
</html>
