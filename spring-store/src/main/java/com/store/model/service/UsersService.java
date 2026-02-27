package com.store.model.service;

import com.store.model.dto.Users;
import com.store.model.mapper.UsersMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final UsersMapper usersMapper;

    // 전체 조회
    public List<Users> selectUserAll() {
        return usersMapper.전체회원가져오기();
    }

    // 단건 조회
    public Users selectUserOne(Integer id) {
        return usersMapper.회원상세가져오기(id);
    }
}
