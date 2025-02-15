package com.example.demo.handler;

import com.example.demo.domain.PagingVO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class PagingHandler {
    private int startPage;
    private int endPage;
    private int realEndPage;
    private boolean prev, next;
    private int qty = 5;

    private int totalCount;
    private PagingVO pagingVO;

    public PagingHandler(PagingVO pagingVO, int totalCount){
        this.pagingVO = pagingVO;
        this.totalCount = totalCount;

        this.endPage = (int)Math.ceil((double)pagingVO.getPageNo()/qty)*qty;
        this.startPage = endPage - (qty-1);

        this.realEndPage = (int)Math.ceil((double)totalCount/pagingVO.getQty());

        if(realEndPage < endPage){
            this.endPage = realEndPage;
        }

        this.prev = this.startPage > 1;
        this.next = this.endPage < realEndPage;
    }
}
