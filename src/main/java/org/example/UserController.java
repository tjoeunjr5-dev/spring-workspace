package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public String usersView(Model jsp로전달하기){
        List<Users> 유저목록들데이터 = userService.전체유저기능();
        jsp로전달하기.addAttribute("users",유저목록들데이터);
        return "userList";
    }
}
