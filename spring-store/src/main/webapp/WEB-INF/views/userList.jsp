<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="
https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js
"></script>
    <link href="
https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css
" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h2>회원 목록</h2>
    <table class="table table-bordered">
        <thead>
        <tr><th>ID</th><th>이름</th><th>이메일</th><th>가입일</th></tr>
        </thead>
        <tbody>
        <c:forEach var="user" items="${xyz}">
            <tr>
                <td>
                    <a href="/users/detail?id=${user.id}">
                            ${user.id}
                    </a>
                </td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.createdAt}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
