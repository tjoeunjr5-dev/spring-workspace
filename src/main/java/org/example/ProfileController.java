package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * =====================================================
 *  실습 과제 2 : 나의 자기소개 페이지 만들기
 * =====================================================
 *
 * [미션]
 *  Controller 에서 나의 정보를 데이터로 만들어 JSP 로 전달하고
 *  JSP 화면에 출력하세요!
 *
 * [전달해야 할 데이터 목록]
 *  "name"   → 나의 이름       (예: "홍길동")
 *  "age"    → 나의 나이       (예: "25")
 *  "hobby"  → 나의 취미       (예: "코딩")
 *  "dream"  → 나의 꿈/목표    (예: "백엔드 개발자")
 *
 * [힌트]
 *  model.addAttribute("키이름", "값");  ← 데이터 전달
 *  JSP 에서는 ${키이름} 으로 꺼내서 출력!
 *
 * [주의]
 *  @GetMapping 경로는 "/profile" 로 설정하세요.
 *  return 값은 JSP 파일 이름인 "profile" 로 설정하세요.
 *
 * =====================================================
 */

@Controller
public class ProfileController {

    // /profile 이라는 경로에 접속하여, 백엔드 데이터를 프론트엔드에서 보는 방법
    // http://localhost:8080/profile
    // 웹 사이트를 접속해서 확인 가능

    // TODO 1 : @GetMapping 경로를 "/profile" 로 작성하세요
    @GetMapping("/profile")
    public String profile(Model model) {
        // TODO 2 : "name" 이라는 이름으로 나의 이름을 전달하세요
        model.addAttribute("name", "홍길동");
        // TODO 3 : "age" 라는 이름으로 나의 나이를 전달하세요
        model.addAttribute("age", "25");
        // TODO 4 : "hobby" 라는 이름으로 나의 취미를 전달하세요
        model.addAttribute("hobby", "코딩");
        // TODO 5 : "dream" 이라는 이름으로 나의 꿈/목표를 전달하세요
        model.addAttribute("dream", "백엔드 개발자");
        // TODO 6 : profile.jsp 가 열리도록 return 값을 작성하세요
        return "profile";
    }

}