<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
    <!-- TODO 10. Bootstrap CDN 링크를 작성하시오 -->
    <link href="???" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5" style="max-width: 500px;">
    <div class="card p-4 shadow-sm">
        <h2 class="mb-4 text-center fw-bold">회원가입</h2>

        <%-- TODO 11. 이메일 중복 에러 메시지를 출력하시오 (param.error == 'email' 일 때) --%>
        <c:if test="${??? == ???}">
            <div class="alert alert-danger">이미 사용중인 이메일입니다.</div>
        </c:if>

        <!-- TODO 12. form action 주소와 method 를 작성하시오 -->
        <form action="???" method="???">

            <div class="mb-3">
                <label class="form-label">이름</label>
                <!-- TODO 13. name 속성을 작성하시오 (User.java 필드명과 동일하게) -->
                <input type="text" name="???" class="form-control" placeholder="이름을 입력하세요" required>
            </div>

            <div class="mb-3">
                <label class="form-label">이메일</label>
                <!-- TODO 14. name 속성과 input type 을 작성하시오 -->
                <input type="???" name="???" class="form-control" placeholder="이메일을 입력하세요" required>
            </div>

            <div class="d-grid mt-4">
                <!-- TODO 15. 제출 버튼 type 을 작성하시오 -->
                <button type="???" class="btn btn-dark">가입하기</button>
            </div>

            <div class="text-center mt-3">
                <a href="/user/login" class="text-muted">이미 계정이 있으신가요? 로그인</a>
            </div>

        </form>
    </div>
</div>

</body>
</html>