package com.example.demo.service;

import com.example.demo.domain.BoardVO;
import com.example.demo.repository.BoardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{
    private final BoardMapper boardMapper;

    @Override
    public void register(BoardVO boardVO) {
        boardMapper.register(boardVO);
    }
}
