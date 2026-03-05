package com.board.springboard.model.dto;
/*
CREATE TABLE products (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(100),
	price INT,
	stock INT,
	created_at DATETIME DEFAULT NOW()
);

 */

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Product {
    private Long id; // Integer 보다 숫자범위가 더 넓음 대기업 Long 사용
    private String name;
    private int price;
    private int stock;
    private LocalDateTime created_at;
}
