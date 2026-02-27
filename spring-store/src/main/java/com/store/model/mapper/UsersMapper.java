package com.store.model.mapper;

import com.store.model.dto.Users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {

    // 전체 조회 → 여러 건이므로 List 사용
    List<Users> 전체회원가져오기();

    // 단건 조회 → 한 건이므로 List 미사용
    Users 회원상세가져오기(Integer id);
}
