package com.store.model.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Users {
    private Integer id;        // AUTO_INCREMENT → null 가능 자료형
    private String name;
    private String email;
    private LocalDateTime create_at; // SQL 컬럼과 일치하지 않아 문제 발생
}


/*
CREATE TABLE users (
id iNT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50),
email VARCHAR(100),
create_at DATETIME DEFAULT NOW()
);


 */
