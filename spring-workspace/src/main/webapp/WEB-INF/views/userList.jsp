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
    <style>
        /* css 우선순위 모두다 5순위 태그이름에 스타일 속성 작성

         2진수
         0 1

        10진수
        0123456789


        16진수 -> 디자인에서는 16진수 주로 사용
        0123456789abcdef

        연속으로 동일한 값을 지닌 디자인 수는 3자리로 줄여서 작성하기도 함
        #333333 = #333 동일

        000000 ->  검정

        111111 ->    0보다 연한 검정
        333333 -> 012보다 연한 검정
        ~~~~~~
        f0f0f0 -> 하얀색 기준으로 0에 해당되는 검정 섞인 하양
        f5f5f5 -> 하얀색 기준으로 5에 해당되는 검정 섞인 하양

        ffffff -> 하얀



        */
        body {
            background-color: #f5f5f5;
            padding: 30px; /* 내부에서 테두리와 글자속성을 구분할 영역 */
        }
        h1{
            color: #ffffff;
            margin-bottom: 20px; /* 다른 태그와의 간격 */
        }
        table{
            width: 100%;         /* 디지털 전자기기 가로 사이즈 기준 100% 맞춰 사이즈 지정*/
            border-collapse: collapse; /* 테이블 셀 사이의 공간을 하나로 합쳐줘*/
            background-color: #fff;
        }
        thead{
            background-color: #4CAF50;
            color: white;
        }
        th, td {
            padding: 12px 16px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        tbody tr:hover{
            background-color: #f0f0f0;
        }
    </style>
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
    <%--
    controller 에서 가져온 users 에는 DB에서 가져온 모든 유저들의 목록이 List 형태로 담겨 있다.
    users에서 담겨져 있는 유저들을 하나씩 유저정보를 꺼내서
    화면 표현
    표현을 할 때 user 라는 명칭으로 유저목록 꺼내겠다.

    첫번째 유저
    var = javascript에서 제일 처음 나온 자료형
    var     로 선언된 변수 공간은 데이터 변경 가능 -> 안전하지 않기 때문에 사용 지양
    let const를 주로 사용
    let    로 선언된 변수 공간은 데이터 변경 가능 -> var 보다는 제약적
    const 로 선언된 공간은 데이터 변경이 불가능한 상수형태로 데이터 보존

    var user
    user에는 id 와 name email create_at 에 db에서 꺼내온 데이터가 한사람씩 저장되어 있다.

    user {
      id = "1"
      name = "홍길동"
      email ="gildong@email.com"
      create_at = "2026-02-26T시간"
    }

    --%>
    <c:forEach var="user" items="${users}">
        <tr>
            <%-- 유저에 각 변수공간에서 꺼내온 데이터 중에서 원하는 데이터를 선택하여 데이터 화면 출력 --%>
            <td>${user.id}</td> <%-- 유저 데이터에서 id 값 화면 표기--%>
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