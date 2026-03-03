<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="???" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>${???} - 상세보기</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5" style="max-width: 800px;">
    <div class="card shadow-sm p-4">
        <h2 class="fw-bold">${???}</h2>

        <div class="text-muted mb-4">
            작성자: ${???} | 작성일: ${???} | 조회수: ${???}
        </div>

        <hr>

        <div class="py-3" style="min-height: 200px; white-space: pre-wrap;">
            ${???}
        </div>

        <hr>

        <div class="text-end">
            <a href="/board/list" class="btn btn-outline-secondary">목록으로</a>

            <a href="/board/edit?no=${???}" class="btn btn-warning">수정</a>

            <button type="button" class="btn btn-danger"
                    onclick="location.href='/board/delete?no=${???}'">삭제</button>
        </div>
    </div>
</div>

</body>
</html>