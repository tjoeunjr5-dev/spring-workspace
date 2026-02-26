<%--
jsp 파일은 소문자로 맨 첫글자 보통 작성
개발자 간의 규칙

주석
HTML 안에 Java 코드를 쓸 수 있는 파일

HTML - 정적, 항상 같은 화면
JSP  - 동적, 상황에 따라 다른 화면

${   }   -   EL(Expression Language)
          가장 많이 사용되는 기본 출력
          컨트롤러에서 넘긴 데이터를 출력
          객체의 필드 접근
          리스트 인덱스 접근
          산술 연산
          비교에서 주로 사용
<%    %> -   JSP 안에서 Java 코드 문법을 작성하고, 코드 수행 사용
<%=   %> - 계산하거나 단순 계산 결과를 바로 화면에서 출력할 때 사용
<%!   %> - 메서드나 변수를 선언할 때 주로 사용
<c:    > - 조건문, 반복문 등에서 사용
           반드시 맨 위에 taglib java.sun.com 이라는 주소에서 가져와 c라는 이름으로 활용하겠다 표기

많이 사용 : ${}  주석 <c:> 형태 많이 사용

사용 자제 : <% %> <%= %> <%! %> 되도록이면 controller 이전 자바 코드들에서 작성하고
           백엔드에서 해결되지 못하거나 급하게 백엔드 코드를 html 내부에 작성할 때 사용하는 것으로
           jsp에서  가급적 자제 !!!
--%>
<%-- charset=UTF-8  영어 숫자 이외 다른 언어들 깨짐 방지 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        /*
        css 주석
        css 로 html 코드 내부 스타일 꾸미는 방법 3가지

        1. 태그이름   {
               스타일속성명칭 : 색상 or 크기;
           }

          <h1>안녕하세요</h1>
          h1 {
            배경색상 : 블루;
          }

     ============================================

        2. .클래스이름 {
              스타일속성명칭 : 색상 or 크기;
           }
           <h2 class="hname">환영합니다</h2>
           .hname {
             글자색상 : 레드;
           }

     ============================================

        3. #아이디이름 {
             스타일속성명칭 : 색상 or 크기;
        }
        <h3   id="iname">반갑습니다</h3>
        #iname {
           글자크기 : 16px;
        }

        css 스타일은 우선순위가 있다.

        보통 가장 많이사용되는 순위는 4순위이며, 3순위로 갈수록 긴박하고 급할 때 사용

        5순위 :   태그이름으로   작성된 css 표기
        4순위 : 클래스이름으로   작성된 css 표기
        3순위 : 아이디이름으로   작성된 css 표기
        2순위 : <태그 내부에 style="속성이름:디자인값"> 형태로 작성된 css 표기
        1순위 : !important 가 작성된 css 표기

        되도록이면 4순위 내에서 모든 css 를 진행  / 정말 급하고 힘들 때.. 순위 올리기
        */

        /* 5 우선순위 스타일   1로 갈수록 최 우 선 ! */
        nav {
            background-color: #3f51b5;  /* 배경 색상  설정                                       */
            padding: 14px 30px;         /* 내부 여백 상하 14px 씩 좌우 30px 씩 설정                */
            display: flex;              /* 가로 한 줄 나란히 배치                                 */
            gap: 20px;                  /* 20씩 간격 띄워 배치하기                                */
        }
        a {
            color: white;               /* 글자 색상 설정                                        */
            text-decoration: none;      /* a 태그 밑에 있는 기본 밑줄 제거                         */
            font-size: 16px;            /* 보통 기본 폰트 사이즈 p a span 등 모두 16px 로 되어 있다.*/
            font-weight: bold;
        }
        a:hover {                /* a태그 위에 마우스를 올렸을 때 보여지는 효과   */
            text-decoration: underline;  /* a 태그 아래에 밑 줄이 그려지는 효과 */
        }

        .content {
            padding: 30px; /* 상하좌우 모두 30px 씩 설정 */
            /*
            margin - padding - border
              padding : 상하좌우px;
              padding : 상하px 좌우px;
              padding : 상px 좌우px 하px;
              padding : 상px 우px 하px 좌px;

            h1 ~ h5 처럼 특수 형태의 글자가 아닌 이상
            대부분의 태그 글자 크기의 기본 값
            === 16px ===
            */
        }
        /*
            .content
                패딩 상하좌우 30px
        */
    </style>
    <title>메인 페이지</title>
</head>
<body>
<%--
@GetMapping("/")
public String index(Model model) {
    String data = "안녕하세요!";   -> 데이터베이스에서 전달된 데이터를 화면 전송
    model.addAttribute("message",data);
    return "index";
}

Model = Controller 에서 JSP로 백엔드 데이터를 전달하는 택배회사
Model model = model 이라는 명칭은 택배회사의 명칭

     택배회사에서는 택배추가하겠다.  ("택배이름", 내용물)
      model     .addAttribute   ("message",data);

      전달하겠다   "이 문서파일 위치로"
      return     "index"
--%>
<%-- 네비게이션바 --%>
    <nav>
        <a href="/">메인 페이지</a>
        <a href="/list">버킷리스트</a>
        <a href="/profile">프로필</a>
    </nav>
    <div class="content">
        <h1>${message}</h1>
    </div>
</body>
</html>