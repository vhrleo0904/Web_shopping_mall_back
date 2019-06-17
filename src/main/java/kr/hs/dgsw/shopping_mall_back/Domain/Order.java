package kr.hs.dgsw.shopping_mall_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Order {
    private Long id;
    private Long user_id;
    private Long product_id;
    private int count;
    private int price;
    private LocalDateTime created;
    private LocalDateTime updated;
}
