package com.example.demo.domain;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO {
    private long id;
    private long userId;
    private String title;
    private String content;
    private char isDel;
    private String createdAt;
}