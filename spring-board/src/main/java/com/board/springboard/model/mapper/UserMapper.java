package com.board.springboard.model.mapper;


import com.board.springboard.model.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    // 인터페이스는 미완성된 기능이기 때문에 반드시 public

    /** 회원가입
     * ❌❌❌           import org.apache.catalina.User;         ❌❌❌
     * ⭐⭐⭐ 개발자가 만든 유저 dto 모델을 가져와서 사용합시다. ⭐⭐⭐
     *
     * @param user 웹사이트
     *             -> jsp 템플릿 name 에 작성되어 있는 변수공간 데이터
     *             -> 컨트롤러 @RequestBody 로 전달받고
     *             -> 전달받은 데이터를 User 객체에 저장 후,
     *             -> Service 로 전달받아 SQL에 저장하겠다.
     */
    void 회원가입(User user);

    /** 이메일중복체크
     *
     * @param email 웹사이트->JSP->Controller->Service 에서 전달받은 클라이언트가 작성한 이메일데이터
     * @return      가 SQL DataBase 이메일 컬럼에 저장되어 있는 이메일임을 확인했다면
     *               존재하기 때문에 1 반환
     *               존재하지 않으면 0 반환
     */
    int 이메일중복체크(String email);
}
