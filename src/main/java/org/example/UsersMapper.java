package org.example;
/*
myBatis 는 SQL 과 Java 코드를 편하게 연결해주는 연결 프레임워크
SQL 코드와 자바가 연결되는 코드 파일들의 위치
resources/
     mappers/ 라는 폴더 생성
        Java객체파일이름Mapper.xml  형태로 SQL을 작성할 파일 생성
 */
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UsersMapper {
    // SQL 을 연결하는 기능의 명칭들 나열

    // 우리 회사에 가입되어 있는 전체 유저들 불러오기 기능
    List<Users> 전체유저();

    // 한명의 유저 정보를 조회하거나, 로그인할 때 사용
    Users  하나의유저();

    // 유저가 회원가입할 때 사용하는 기능
    void 유저저장(Users user);
}
