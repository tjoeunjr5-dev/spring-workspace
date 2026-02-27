<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.../bootstrap.min.css" rel="stylesheet">
    <title>회원 상세</title>
</head>
<body>
<div class="container mt-4">
    <h2>회원 상세보기</h2>
    <table class="table table-bordered">
        <tr><th>ID</th>    <td>${uuuuu.id}</td></tr>
        <tr><th>이름</th>  <td>${uuuuu.name}</td></tr>
        <tr><th>이메일</th><td>${uuuuu.email}</td></tr>
        <tr><th>가입일</th><td>${uuuuu.create_at}</td></tr>
    </table>
    <a href="/users" class="btn btn-secondary">목록으로</a>
</div>
</body>
</html>
