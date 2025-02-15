package com.example.demo.service;

import com.example.demo.domain.BoardVO;
import com.example.demo.domain.PagingVO;

import java.util.List;

public interface BoardService {

    void register(BoardVO boardVO);

    List<BoardVO> getList(PagingVO pagingVO);

    BoardVO getBoardById(long id);

    void updateBoard(BoardVO boardVO);

    void isDelUpdate(long id);

    int getTotal(PagingVO pagingVO);
}
