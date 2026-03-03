<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="???" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시물 목록</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <h2 class="mb-4">게시물 목록</h2>

    <table class="???">
        <thead class="table-dark">
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일</th>
            <th>조회수</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="board" items="???">
            <tr>
                <td>${board.board_no}</td>
                <td><a href="???" class="text-decoration-none">${board.title}</a></td>
                <td>${board.writer}</td>
                <td>${board.created_at}</td>
                <td>${board.view_count}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="text-end mt-3">
        <a href="???" class="btn btn-dark">글쓰기</a>
        <a href="???" class="btn btn-outline-secondary">홈으로</a>
    </div>
</div>

</body>
</html>