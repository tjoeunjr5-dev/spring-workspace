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
