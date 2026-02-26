<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>상품 목록</title>
</head>
<body>
<h1>전체 상품 조회</h1>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>상품명</th>
        <th>가격</th>
        <th>재고</th>
        <th>등록일</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="p" items="${productList}">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td>${p.stock}</td>
            <td>${p.created_at}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>