<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="
https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js
"></script>
    <link href="
https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css
" rel="stylesheet">
    <title>상품 상세</title>
</head>
<body>
<div class="container mt-4">
    <h2>상품 상세보기</h2>
    <table class="table table-bordered">
        <tr>
            <!--  m.addAttribute("product",p); -->
            <th>상품번호</th>
            <td>${product.id}</td>
        </tr>
        <tr>
            <th>상품명</th>
            <td>${product.name}</td>
        </tr>
        <tr>
            <th>가격</th>
            <td>${product.price}원</td>
        </tr>
        <tr>
            <th>재고</th>
            <td>${product.stock}</td>
        </tr>
    </table>
    <a href="" class="btn btn-secondary">목록으로</a>
</div>
</body>
</html>