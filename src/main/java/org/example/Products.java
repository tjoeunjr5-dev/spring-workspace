package org.example;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    private int id;
    private String name;
    private int price;
    private int stock;
    private LocalDateTime created_at;
}
