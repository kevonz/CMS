<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>article</title>
</head>
<body>
<form method="post">
    <div>
        <div>article:<input type="text" name="title" /></div>
        <div><input type="submit" /></div>
    </div>
</form>

<h3>Articles</h3>
<c:if  test="${!empty userlist}">
    <table class="data">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${userlist}" var="user">
            <tr>
                <td>${user.username}</td>
                <td>${user.email}</td>
                <td><a href="delete/${user.userId}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>