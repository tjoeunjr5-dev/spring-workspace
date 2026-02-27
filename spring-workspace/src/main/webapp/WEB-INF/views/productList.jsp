<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%-- 정렬 단축키 CTL + ALT + L --%>
<html>
<head>
    <style>

        body {
            background-color : #f5f5f5;
            font-family      : Arial, sans-serif;
            padding          : 30px;
        }

        h1 {
            color            : #333333;
            margin-bottom    : 20px;
        }

        .table-wrap {
            background-color : #ffffff;
            padding          : 20px;
            box-shadow       : 0 2px 4px rgba(0,0,0,0.1);
        }

        #product-table {
            width            : 100%;
            border-collapse  : collapse;
        }

        #product-table thead {
            background-color : #4CAF50;
            color            : #ffffff;
        }

        #product-table th {
            padding          : 12px 16px;
            text-align       : left;
        }

        #product-table td {
            padding          : 12px 16px;
            border-bottom    : 1px solid #dddddd;
        }

        .product-row {
            background-color : #ffffff;
        }

        .product-row:hover {
            background-color : #f0f0f0;
        }

    </style>
    <title>상품 목록</title>
</head>
<body>
<h1>전체 상품 조회</h1>
<div class="table-wrap">
    <table id="product-table" border="1">
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
            <tr class="product-row">
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.stock}</td>
                <td>${p.created_at}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>