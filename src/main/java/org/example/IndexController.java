package org.example;
// 자바
// 한 줄 주석

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 기능이나 클래스를 완성하고 완성된 기능이나 코드에 대하여
 * 설명을 작성하는 형태의 주석
 * TODO : 만들어놓은 클래스나 기능에 대하여 해야할 작업을 작성하는 주석
 */

/*
에러가 발생한 코드를 지우지 않고, 잠시 주석 처리를 하거나
내부적으로 코드 변형이나 개별 메모를 작성할 때 사용하는 주석
 */

/*
종속성 ㅣ dependencies
내 프로젝트가 필요로 하는 외부 라이브러리

코드를 작성할 때 하나부터 열까지 수기로 작성하는 방법

코드를 작성할 때 필요한 부분은 외부나, 내부 모듈의 도움을 받으며 작성하는 방법
-> 편하게 개발을 하고, 완성도를 높일 수 있는 방법이 있다면 해당 방법 선택

예전에는 System.out.println() 과 같은 기능이 없어서 하나하나 수기로

cmd 창을 연결한다. -> 자바와 연결한 후, 코드를 출력할 수 있는 로직 작성 -> 코드 출력 확인!

자바 내부 개발자 입장 : 우리 자바 언어를 모두가 잘 쓰기 위해서는
cmd 창을 연결한다. -> 자바와 연결한 후, 코드를 출력할 수 있는 로직 작성 -> 코드 출력 확인!
이러한 과정을 System.out.println() 이라는 기능을 제공해서 사용하게 하면
우리 언어를 많이 사용하겠다! 와 같은 추리로 생성

System.out.println() : 라이브러리

모듈       : 개발자 본인이 만든 파일들 내가 만든 문서 하나하나
라이브러리  : 다른 개발자나 회사가 만든 기능을 내가 필요할 때 호출해서 사용
프레임워크  : 다른 개발자나 회사가 만든 구조에 맞춰 코드를 작성
 -> 스프링 과 같이 틀, 형태가 존재하는 것은 프레임워크 에 해당된다.

종속성 : 내 프로젝트가 필요로 하는 외부 라이브러리
        (자바 개발자가 만든 기능 / 자바 개발자 이외 개발자나 회사가 만든 기능)

pom.xml
<dependencies>  --> 내 프로젝트를 완성하기 위해 필요로 하는 다른사람이 만든 도구들
   <dependency>  --> 도구 하나
        <groupId>     누가 만들었나요?          </groupId>
        <artifactId> 어떤 것을 어떻게 가져오나요? </artifactId>
        <version>    몇 버전의 사양인가요?       </version>
     </dependency>
</dependencies>
위와 같이 도구 하나하나 작성하면 Maven이 인터넷에서 나의 프로젝트로 자동 다운로드하여 가져옴
 */

/*
자바에서 파일이름과 class 오른쪽 파일이름이 작성될 때
맨 앞글자는 보통 대문자 영어 사용

대문자 영어 소문자 영어로 맨 첫글자 사용에 따라 사용 유무 의미

맨 앞글자를 대문자로 사용할 경우 -> 내 프로젝트에서 다른 곳에서 사용될 것이다 의미

맨 앞글자를 소문자로 사용할 경우 -> 내 프로젝트에서 다른 곳에서 사용되지 않을 것이다 의미

무조건 반드시 어지간하면 자바 파일에서 맨 앞글자는 대문자 영어 사용
 */

/*
spring                 = DB - Java - Web 인터넷 연결을 도와주는 프레임워크
application.properties = 프로젝트 환경설정하는 기본 파일이름.properties
                         .properties 프로젝트 환경설정하는 확장자

java = 백엔드      언어 확장자
jsp  = 웹 화면을 그리는 확장자

폴더 구조 만들기

src/main
├──── java/org/exmample/   =========> 자바 코드는 모두다 이 폴더 내에 폴더를 만들어 작성
│     ├──── App.java
│     └──── IndexController.java
├──── resources/           =========> 설정 파일만 작성 / SQL 코드 설정 파일 .xml 또한 작성
│     └──── application.properties
└──── webapp/              =========> 웹 관련 파일은 여기에 작성
      └──── WEB-INF/       =========> 외부에서 직접 접근 못하게 막는 보안 폴더 /  Java 에서 만든 표준 규칙
            └──── views/
                  └──── index.jsp


html -> 확장자 파일에서는 자바코드 작성 불가!!!!!
jsp  -> 확장자 파일에서는 자바코드 작성 가능!!!!!
java 코드는 DB와 연결하고, 소통할 수 있는 코드이기 때문에 보안상 외부에 노출이 되면 안된다 인식 발생

자바 언어 회사
Jakarta EE 부서가 존재함 -> 자바 언어 규칙을 만드는 부서 에서
                           jsp 확장자는 되도록이면 WEB-INF 라는 폴더 안에 작성하고
                           자바로 웹을 실행할 때 WEB-INF 라는 폴더 안에 작성된 파일들은 모두
                           보안상 Controller를 거치지 않으면 못 들어오는 보안 구역 코드 설계

개발자가 아닌 소비자는 우리 웹사이트 접속
https://www.웹사이트.com
            → Controller (@GetMapping("/") 메인 페이지에서 보여줄 jsp 선택됨
              → index.jsp 에 작성된 코드를 소비자에게 보여주기! (WEB-INF 안에서 jsp 파일을 꺼내줌)
                →  소비자 화면에 개발자가 만들어놓은 코드 화면이 보여짐

WEB-INF 는 굳이 작성하지 않아도 되는 폴더이지만, 개발자 간의 약속으로
   webapp/WEB-INF/view/
    위와 같은 형태의 폴더 구조를 가지고, view 폴더 내부에 .jsp 확장자 파일들을 작성
 */

@Controller
public class IndexController {

    /*
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
     */
    @GetMapping("/")
    public String   index(Model    model) {
        String data = "안녕하세요!";
        model.addAttribute("message","안녕하세요!");
        return "index";
    }
}
