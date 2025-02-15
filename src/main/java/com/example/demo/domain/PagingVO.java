package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class PagingVO {
    private int pageNo;
    private int qty;

    // 기본생성자는 커스텀이 필요하므로
    // @NoArgsConstructor는 붙이지 않았음
    public PagingVO(){
        this.pageNo = 1;
        this.qty = 10;
    }

    // limit #{startIndex}, #{qty} 에서 #{startIndex}를 리턴할 메서드
    public int getStartIndex(){
        return (this.pageNo-1)*qty;
    }
}
