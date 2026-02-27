<%--
%@ = 설정 관련 표기
     taglib 외부에 존재하는 라이브러리를 가져오겠다.
     page    현재 페이지를 html 과 한글깨짐 방지, 자바언어를 사용하겠다.

     자바 코드를 jsp 내부에서 사용할 것이며,
     uri="이 주소에서 java 관련 도구를 가져올 것이고"
     매번 uri 를 작성하며 자바 코드를 jsp 안에서 사용하기 번거로우니
     prefix 라는 명칭으로 uri 를 단축하여 표기 사용 하겠다.

     uri 란 ?  주소와 고정명칭을 모두 사용할 수 있는 주소계의 부모
        uri 안에는 URL 과 URN 존재
            URL = 주소 https://www.naver.com
            URN = ispn(전세계적으로 책번호를 분류번호) 처럼
                  특정 명칭이나 고유번호로 주소를 접속하는 방법

           URL + URN = URI

--%>
<%--
BootStrap과 같은 외부 라이브러리나 프레임워크를 jsp 나 html 에만 적용할 때는
pom.xml 이 아니라 <html> 태그 내부에만 작성

가져올 때 <script src=""> 형태로 클라이언트 눈에는 보이지 않지만,
클라이언트가 보는 화면에 영향을 주는 코드를 가져올 때는 <script src=""> 로 가져오기

style 에서 개발자가 내부 프로젝트 안에서 작성한 파일을 호출할 때는
<link rel="stylesheet"  href=""> 형태로 style 코드의 위치를 가져온다.

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="abc" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="
https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.min.js
"></script>
    <link href="
https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css
" rel="stylesheet">
    <title>메인페이지</title>

</head>
<body>

</body>
</html>