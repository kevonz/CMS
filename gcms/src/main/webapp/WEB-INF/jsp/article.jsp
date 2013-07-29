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
<c:if  test="${!empty articlelist}">
    <table class="data">
        <tr>
            <th>id</th>
            <th>Title</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${articlelist}" var="article">
            <tr>
                <td>${article.id}</td>
                <td>${article.title}</td>
                <td><a href="delete/${article.id}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>