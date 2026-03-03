<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시물 작성</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5" style="max-width: 600px;">
    <div class="card p-4 shadow-sm">
        <h2 class="mb-4">새 게시물 작성</h2>

        <form action="???" method="???">
            <div class="mb-3">
                <label class="form-label">제목</label>
                <input type="text" name="???" class="form-control" placeholder="제목을 입력하세요" required>
            </div>

            <div class="mb-3">
                <label class="form-label">작성자</label>
                <input type="text" name="???" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label">내용</label>
                <textarea name="???" class="form-control" rows="???" required></textarea>
            </div>

            <div class="text-center mt-4">
                <button type="???" class="btn btn-dark px-4">저장하기</button>
                <a href="/board/list" class="btn btn-outline-secondary">취소</a>
            </div>
        </form>
    </div>
</div>

</body>
</html>