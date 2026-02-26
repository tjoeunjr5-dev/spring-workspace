<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${name}의 자기소개</title>
    <style>
        nav {
            background-color: #c62828;
            padding: 10px 40px;
            display: flex;
            gap: 20px;
        }
        a {
            color: white;
            text-decoration: none;
            font-size: 18px;
        }
        a:hover {
            text-decoration: underline;
        }
        h1 {
            color: #c62828 ;
            font-size: 28px;
        }
        p{
            color: #555555 ;
            font-size: 16px;
        }
        /*

        TODO 4 : h1 태그
        글자색상 : #c62828    |     글자크기 : 28px
        TODO 5 : p 태그
        글자색상 : #555555    |     글자크기 : 16px
        패딩 : 상하 4px 좌우 0px
        */
    </style>
</head>
<body>
<nav>
    <a href="/">메인 페이지</a>
    <a href="/list">버킷리스트</a>
    <a href="/profile">프로필</a>
</nav>

<h1>이름 : ${name}</h1>
<p>나이 : ${age}</p>
<p>취미 : ${hobby}</p>
<p>꿈/목표 : ${dream}</p>

</body>
</html>