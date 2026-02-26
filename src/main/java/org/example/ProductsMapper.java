package org.example;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// SQL 에서 SQL 쿼리 구문을 담당하고 있는 자바 파일 문서입니다.
@Mapper
public interface ProductsMapper {
    List<Products> 전체상품조회();
}

/*
원래라면 Mapper 를 나눌 필요도  없으며, 내부에서 DB연결하고 SQL 실행하고, 결과 받아서
객체로 변환하고.. return 하는것을 모두다 한 번에 작성

매번 직접 짜기 번거롭고 힘듦

public class ProductsMapper {
    List<Products> 전체상품조회();
}

그래서 구분을 짓기로 함
sql 기능을 호출하는 곳과 sql 기능을 작성하는 곳 나누기로 함

    자바에서 SQL 기능을 호출하는 곳 = Mapper.java 반드시 class 위에 @Mapper 표기 해주기
프로젝트에서 SQL 기능을 작성하는 곳 = resources/mappers/필요시 폴더 구분/테이블이름Mapper.xml
 */

