package com.store.model.mapper;

import com.store.model.dto.Products;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * dao
 * java 코드 내에서 database 연결 -> sql 작성 -> sql 결과
 * 작성했던 코드를 다른 기능에서 한 번 더 작성하는 경우가 발생
 * sql 연결 상태 또한 자바 코드 내에서 관리
 *
 * dao로 사용하는 방식 불편
 * -> dao 를 개선하는 방식 @Repository JPA (SQL 자체를 java 작성 XX xml 파일도 없음)
 * -> JPA SQL 기본으로 개발자들이 사용하는 모든 코드 제공 그 코드를 사용하기 위해서 JPA 외워야 사용가능
 * -> 해외에서는 JPA 방식 선호
 *
 * 한국에서는 Mapper 방식 사용
 * -> mapper 는 java 와 sql을 작성하는 코드 문서 분리 sql을 연결하는 문서 따로 관리
 * -> sql 접속 관리하는 문서 application.properties 처럼 파일이름.properties 형태 내 문서에 작성
 * -> resources/파일이름.xml 형태로 sql 코드를 작성할 수 있는 myBatis 형태 사용
 *
 *
 *
 *
 */
@Mapper
public interface ProductsMapper {
    // interface 에는 public 자료형 기능(); 형태만 작성 가능
    // public 형태만 interface 에서는 존재할 수 있다.
    List<Products> 전체상품가져오기();
    // 중괄호가 없다는 것은 기능의 명칭은 존재하나 기능이 없음을 의미
    // 중괄호가 있다는 것은 기능을 완성한 상태로 의미
    // {} 중괄호가 비어있어도 기능이름(){} 자바는 기능을 완성된 상태로 확인한다.

   // ❌ ❌ List<Products> 전체상품가져오기()  ❌ {} ❌;


    // 제품이 등록된 순번을 이용해서
    // SQL에서 해당되는 순번의 제품데이터 select
    Products 상품상세가져오기(Integer id);

}
