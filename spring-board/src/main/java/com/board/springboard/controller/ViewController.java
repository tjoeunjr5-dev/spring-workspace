package com.board.springboard.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // jsp 나 html 템플릿과 소비자가 연결해야하는 api 주소 작성
public class ViewController {

    @GetMapping("/")
    public String indexView(){
        return "index";
    }

}
