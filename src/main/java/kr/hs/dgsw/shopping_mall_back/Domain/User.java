package kr.hs.dgsw.shopping_mall_back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    private String account;
    private String password;
    private String username;
    private String home_number;
    private String phone_number;
    private String zip_code;
    private String address;
    private String email;
    private LocalDateTime created;
    private LocalDateTime updated;
}
