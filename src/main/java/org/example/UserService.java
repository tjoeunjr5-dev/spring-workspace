package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

// 취업 후 제일 많이 코드를 작성하는 공간
@Service // Java 에서 DB로 데이터를 저장하고, 데이터를 가져오는 핵심 기능 모음!
@RequiredArgsConstructor
public class UserService {
    // Users u = new Users();  = @RequiredArgsConstructor
    private final UsersMapper usersMapper;

    // 전체 유저 조회
    public List<Users> 전체유저기능(){
        return  usersMapper.전체유저();
    }

}
