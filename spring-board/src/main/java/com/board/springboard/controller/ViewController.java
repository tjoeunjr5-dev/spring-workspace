package com.board.springboard.controller;


import com.board.springboard.model.dto.Board;
import com.board.springboard.model.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller // jsp 나 html 템플릿과 소비자가 연결해야하는 api 주소 작성
public class ViewController {

    private final BoardService boardService;

    public ViewController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/")
    public String indexView(){
        return "index";
    }

    // /board/list
    @GetMapping("/board/list")
    public String listView(Model model){
        List<Board> boardListData = boardService.findAllBoard();
        model.addAttribute("boardLists", boardListData);
        /*
        Model model 모듈 사용해서 SQL에서 가져온 전체 게시물을 board/list 전달
        list.jsp에 전달할 변수이름 : boardLists
        service에서 데이터를 담아올 변수이름 : boardListData
         */
        return "board/list";
    }

    // /board/write
    @GetMapping("/board/write")
    public String writeView(){
        return "board/write";
    }
}
