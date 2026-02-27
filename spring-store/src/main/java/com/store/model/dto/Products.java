package com.store.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Products {
    // 상품 상세 정보를 찾을 때 id 값으로 상품 상세정보 조회
    // 맨 위에 작성한 id 의 경우 Long Integer를 사용하지만
    // 이외 숫자 데이터는 int 사용
    // 선택한 상품이 db에 없을 경우 null 값을 유저에게 전달하기 위하여
    // id는 Integer 나 Long 으로 표현된 객체를 사용한다.
    private Integer id;
    private String name;
    private int price;
    private int stock;
}
