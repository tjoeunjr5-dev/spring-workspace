<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title}</title>
    <style>
        /*
        스타일 태그를 작성할 때
        <h2 class="cname" id="idname" style="color:red;">반갑습니다.</h2>
        #idname { color : blue;   }
        .cname  { color : yellow; }
            h2  { color : pink;   }
        반갑습니다. 글자 색상은 맨 마지막으로 pink 색상을 작성했다 하여 pink 색상이 되는 것이 아니라
        우선순위가 2순위인 style="color:red;" 레드 색상을 적용한다.

html 코드 내에서 중첩으로 많이 쓰이는 순서별로 우선수위가 낮아진다.
태그의 직접적인 명칭의 경우 중첩이 많아지기 때문에 가장 낮은 순위 p h1 a 모든 <> 태그
⭐ 동일한 디자인 그룹 형태로 작성하여 중첩이 많은 class 또한 낮은 순위 가장 많이 사용되어야 함⭐
    ⭐⭐⭐ class 4순위 ⭐⭐⭐
    id 는 기능에서 주로 사용 태그별로 id 명칭을 중복 사용하지 않음
    자바스크립트에서 css 를 기능적으로 작성할 때 사용하는 것 또한 3순위
    h2 {color : green; !important} 1순위로 무조건 사용이 되어야하는 스타일 급할 때 사용


        h2  cname  idname 직접적인 스타일 작성이 존재할 경우 작성 순서에 상관 없이 우선순위별로 중첩된 디자인 중에서
        우선순위가 높은 속성 설정부터 우선 적용된다.



        */
        nav {
            background-color: #2e7d32;
            padding: 10px 24px;
            display: flex;
        }
        a {
            color: white;
            text-decoration: none;
            font-size: 18px;
        }
        a:hover {
            text-decoration: underline;
        }

    </style>
</head>
<body>
<nav>
    <a href="/" >메인 페이지</a>
    <a href="/list">버킷리스트</a>
    <a href="/profile" >프로필</a>
</nav>
<h1>${title}</h1>

<p>${item}</p>

</body>
</html>
