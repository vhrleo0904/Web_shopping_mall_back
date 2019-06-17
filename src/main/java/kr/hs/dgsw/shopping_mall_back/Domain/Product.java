package kr.hs.dgsw.shopping_mall_back.Domain;

import lombok.Data;

import java.io.File;
import java.time.LocalDateTime;

@Data
public class Product {
    private Long id;
    private String name;
    private String information;
    private String category;
    private int cost;
    private int sale_price;
    private LocalDateTime created;
    private LocalDateTime updated;
}
