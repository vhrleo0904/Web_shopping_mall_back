package kr.hs.dgsw.shopping_mall_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Evaluate {
    private Long id;
    private Long user_id;
    private String title;
    private String content;
    private LocalDateTime created;
    private LocalDateTime updated;
}
