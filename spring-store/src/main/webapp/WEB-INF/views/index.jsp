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
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="abc" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>