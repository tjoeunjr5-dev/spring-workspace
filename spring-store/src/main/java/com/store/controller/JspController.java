package com.store.controller;

import com.store.model.dto.Products;
import com.store.model.service.ProductsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class JspController {

    private final ProductsService service;

    @GetMapping("/")
    public String  indexView(Model 데이터전달하기) {
        // 만약 메인페이지에서 상품 목록을 보여주고 싶다!
        // Model 을 이용해서 JSP나 HTML 에 데이터를 전달하자!

        service.selectProductAll(); // 서비스 기능에서 프론트엔드로 제품 리스트를 전달
        // 위와같이 변수 공간에 SQL에서 가져온 제품 데이터를 저장하지 않으면
        // 20번째 줄에서 제품목록을 한 번 확인하고 말아버린 상태
        // 변수 공간에 제품 데이터를 담아 프론트엔드로 전달
        //데이터전달하기.addAttribute("products",service.selectProductAll());

       List<Products> SQL에서가져온데이터 = service.selectProductAll();
        데이터전달하기.addAttribute("products",SQL에서가져온데이터);
        return "index";
    }
}
/*
아래와 같이 작성한 결과가 JSP 나 HTML에서 확인할 수 있는 이유

Spring이 Model 이라는 자료형을 선언하고, 선언된 자료형 공간에 데이터가
이름, 데이터 형태로 들어오면
return에 해당하는 JSP나 HTML로 전달하는 역할

Model 전달하는공간의명칭;

전달하는공간의명칭.addAttribute("JSP에서 사용할 키 이름", JSP 에서 표현될 SQL 데이터);
return "jsp or html 파일 이름"  어떤 파일로 데이터를 보낼지 결정
JSP 나 HTML 에서는 ${JSP에서 사용할 키 이름} 으로 넣어주면 데이터가 보여짐

===================================================================
우리가 addAttribute 로 데이터를 담으면 Spring 이 그 Model 에 있는 데이터를 들고 있다가

소비자가 "/" 사이트로 접속하면 "index.jsp" 페이지를 보여주면서 Model 에 담긴 데이터도
같이 보여주는 형태

JSP가 렌더링될 때 Model 데이터가 HttpServletRequest의 attribute 로 변환되어 심어짐
===================================================================




import org.springframework.ui.Model;
public String  indexView(Model 데이터전달하기) {
       List<Products> SQL에서가져온데이터 = service.selectProductAll();
        데이터전달하기.addAttribute("products",SQL에서가져온데이터);
        return "index";
    }
 */
