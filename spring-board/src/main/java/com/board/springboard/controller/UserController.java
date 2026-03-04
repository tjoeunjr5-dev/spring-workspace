package com.board.springboard.controller;

import com.board.springboard.model.dto.User;
import com.board.springboard.model.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// TODO 1. @Controller 어노테이션을 작성하시오
// TODO 2. @RequiredArgsConstructor 어노테이션을 작성하시오
public class UserController {

    // TODO 3. UserService 를 주입받는 필드를 작성하시오
    private final ???

    /**
     * 회원가입 페이지 이동
     * @return user/register.jsp
     */
    // TODO 4. 회원가입 페이지로 이동하는 GET 매핑 주소를 작성하시오 (/user/register)
    public String registerView() {
        return "???";
    }

    /**
     * 회원가입 처리 (DB 저장)
     * 성공 시 로그인 페이지로 이동
     * 실패(이메일 중복) 시 회원가입 페이지로 이동
     * @param user 작성된 회원 데이터
     * @return 성공 → 로그인 페이지 / 실패 → 회원가입 페이지
     */
    // TODO 5. 회원가입 처리하는 POST 매핑 주소를 작성하시오 (/user/register)
    public String register(User user) {
        boolean result = userService.회원가입(user);
        if (???) {
            // TODO 6. 성공 시 로그인 페이지로 redirect 하시오
            return "???";
        } else {
            // TODO 7. 실패 시 회원가입 페이지로 redirect 하시오 (이메일 중복 에러 파라미터 포함)
            return "???";
        }
    }

    /**
     * 로그인 페이지 이동
     * @return user/login.jsp
     */
    // TODO 8. 로그인 페이지로 이동하는 GET 매핑 주소를 작성하시오 (/user/login)
    public String loginView() {
        return "???";
    }
}