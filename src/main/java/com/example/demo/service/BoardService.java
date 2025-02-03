package com.example.demo.service;

import com.example.demo.domain.BoardVO;

import java.util.List;

public interface BoardService {
    void register(BoardVO boardVO);
    List<BoardVO> getList();
    BoardVO getBoardById(long id);
}
