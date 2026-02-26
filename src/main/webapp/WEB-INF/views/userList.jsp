<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
자바코드를 jsp 형태로 사용하기 위해서  http://java.sun.com/jsp/jstl/core 에서
제공하는 소스코드를 사용할 것
http://java.sun.com/jsp/jstl/core 주소를 줄여서 c 라는 명칭으로 사용하겠다. 표기
위 주소에는 자바 관련 키트가 저장되어 있고, JDK를 주소로 불러온 것

language="java" 글씨가 회색인 이유
우리가 jsp 파일 내부에서 자바 코드를 작성하지 않았기 때문!
문제될 일이 없음 단순히 자바 코드를 작성하지 않았을 뿐
 --%>

<!DOCTYPE html>
<html>
<head>
    <title>유저 목록</title>
</head>
<body>
<h1>유저 전체 목록</h1>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>이름</th>
        <th>이메일</th>
        <th>가입일</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.create_at}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
<%-- 인텔리제이 한 줄 복사 단축키 CTRL + D--%>