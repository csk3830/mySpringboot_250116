package com.example.demo.domain;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
    private long id;
    private String username;
    private String password;
    private String email;
    private String createdAt;
}
