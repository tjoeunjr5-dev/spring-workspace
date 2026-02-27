package com.store.model.service;


import com.store.model.dto.Products;
import com.store.model.mapper.ProductsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@RequiredArgsConstructor
 @Autowired
 */
@Service
@RequiredArgsConstructor
public class ProductsService {
    @Autowired
    private ProductsMapper productsMapper;

    /**
     * 필요한 타입: 자료형
     * 제공된 타입: List <com.store.model.dto.Products>
     * @return Controller에 SQL에서 가져온 데이터를 전달할 것인데
     *         최종적으로 전달할 데이터의 구조는 어떻게 되는가?
     *         return에 작성한 자료형과 public 옆에 작성한 자료형 동일
     *
     *  개발을 배우며 가장 많이 힘들어하는 구간
     *  1. return과 public 오른쪽에 있는 자료형 맞추기
     *
     *  2. 매개변수 파라미터 자료형과 데이터 개수 맞추기
     */
    public List<Products> selectProductAll(){
        return productsMapper.전체상품가져오기();
    }
    // public 자료형 기능명칭(){} 에서
    // 자료형은 반드시 return에 해당되는 데이터의 자료형을 선택 선언
    // 제품 목록이 아니라 하나의 제품만 가져오는 것이기 때문에 List<자료형> 생략
    public Products 하나의상품가져오는기능(Integer id) {
        return productsMapper.상품상세가져오기(id);
    }
}
