package com.example.demo.repository;

import com.example.demo.domain.BoardVO;
import com.example.demo.domain.PagingVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    void register(BoardVO boardVO);

    List<BoardVO> getList(PagingVO pagingVO);

    BoardVO getBoardById(long id);

    void updateBoard(BoardVO boardVO);

    void isDelUpdate(long id);

    int getTotal(PagingVO pagingVO);
}
