package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * =====================================================
 *  실습 과제 : 나의 버킷리스트 페이지 만들기
 * =====================================================
 *
 * [미션]
 *  1. @GetMapping 경로를 "/list" 로 설정하세요.
 *  2. model.addAttribute 를 사용해서 아래 두 가지 데이터를 JSP 로 전달하세요.
 *       - "title"   : 페이지 제목 (예: "나의 버킷리스트")
 *       - "item"    : 버킷리스트 항목 하나 (예: "세계여행 가기")
 *  3. return 값으로 "list" 를 반환해서 list.jsp 가 열리도록 하세요.
 *  4. list.jsp 에서 ${title} 과 ${item} 을 출력하도록 작성하세요.
 *
 * [힌트]
 *  model.addAttribute("키이름", "값");
 *  JSP 에서는 ${키이름} 으로 꺼내서 출력!
 *
 * =====================================================
 */


@Controller
public class ListController {
    // http://localhost:8080/list
    // TODO 1 : @GetMapping 경로를 "/list" 로 작성하세요
    @GetMapping("/list")
    public String list(Model model) {

        // TODO 2 : title 이라는 이름으로 "나의 버킷리스트" 를 전달하세요
        model.addAttribute("title", "나의 버킷리스트");

        // TODO 3 : item 이라는 이름으로 원하는 버킷리스트 항목 하나를 전달하세요
        model.addAttribute("item", "초밥 많이 먹기");

        // TODO 4 : list.jsp 가 열리도록 return 값을 작성하세요
        return "list";
    }

}