package com.example.demo.repository;

import com.example.demo.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
    void register(BoardVO boardVO);
}
