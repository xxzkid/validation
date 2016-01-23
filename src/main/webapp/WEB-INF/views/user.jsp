<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user</title>

<style>
    .error {color:red;}
</style>

</head>
<body>
<sf:form method="POST" commandName="user" action="${pageContext.request.contextPath}/addUser">
    <div><sf:errors path="*" cssClass="error" /></div>
    <table>
        <tr>
            <td>name:</td>
            <td><input type="text" name="name" /></td>
            <td><sf:errors path="name" cssClass="error" /></td>
        </tr>
        <tr>
            <td>age:</td>
            <td><input type="text" name="age" /></td>
            <td><sf:errors path="age" cssClass="error" /></td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" /></td>
        </tr>
    </table>
</sf:form>
</body>
</html>