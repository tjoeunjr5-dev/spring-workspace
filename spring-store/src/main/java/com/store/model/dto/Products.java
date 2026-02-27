package com.store.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Products {
    private Integer id;
    private String name;
    private int price;
    private int stock;
}
