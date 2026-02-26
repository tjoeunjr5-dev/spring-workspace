package org.example;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 자바에서 실질적인 코딩을 담당하고 있는 기능
@RequiredArgsConstructor // new 객체 생성 생략
public class ProductsService {
    
    // final = 변수 공간이 아닌 상수공간으로 선언해서 productsMapper 공간의 데이터를
    // 아래에서 변경할 수 없도록 설정
    private final ProductsMapper productsMapper;

    // 나를 필요로 한다면 전달할 것이다
    // 전달할 때 List<Products> 상품을 목록형태로
    // SQL 에서 검색된 데이터를 전달할 것이다.
    public List<Products> 전제상품조회(){
        return  productsMapper.전체상품조회();
    }
}
