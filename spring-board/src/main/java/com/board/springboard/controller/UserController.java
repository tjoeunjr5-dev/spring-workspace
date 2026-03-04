package com.board.springboard.controller;

import com.board.springboard.model.dto.User;
import com.board.springboard.model.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 회원가입 페이지 이동
     * @return user/register.jsp
     */
    public String registerView() {
        return "user/register";
    }

    /**
     * 회원가입 처리 (DB 저장)
     * 성공 시 로그인 페이지로 이동
     * 실패(이메일 중복) 시 회원가입 페이지로 이동
     * @param user 작성된 회원 데이터
     * @return 성공 → 로그인 페이지 / 실패 → 회원가입 페이지
     */
    @PostMapping("/user/register")
    public String register(User user) {
        /*
        UserService 의 회원가입 기능을 실행한다.
        클라이언트가 입력한 회원 정보(user)를 전달하며,
        회원가입 처리 결과(성공 = true, 실패 = false)를
        result 에 담아 결과에 따라 클라이언트를 다른 페이지로 안내한다.
         */
        boolean result = userService.회원가입(user);
        if (result) { // 회원가입을 성공했을 경우 로그인을 위하여
            // 개발자가 로그인페이지로 클라이언트를 이동처리
            return "redirect:/user/login";
        } else { // result 가 false 일 경우
            return "redirect:/user/resister";
        }
    }

    /**
     * 로그인 페이지 이동
     * @return user/login.jsp
     */
    @GetMapping("/user/login")
    public String loginView() {
        return "user/login";
    }
}