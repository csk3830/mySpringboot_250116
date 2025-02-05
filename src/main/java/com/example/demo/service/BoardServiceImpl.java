package com.example.demo.service;

import com.example.demo.domain.BoardVO;
import com.example.demo.repository.BoardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService{
    private final BoardMapper boardMapper;

    @Override
    public void register(BoardVO boardVO) {
        boardMapper.register(boardVO);
    }

    @Override
    public List<BoardVO> getList() {
        List<BoardVO> list = boardMapper.getList();
        return list;
    }

    @Override
    public BoardVO getBoardById(long id) {
        return boardMapper.getBoardById(id);
    }

    @Override
    public void updateBoard(BoardVO boardVO) {
        boardMapper.updateBoard(boardVO);
    }

    @Override
    public void isDelUpdate(long id) {
        boardMapper.isDelUpdate(id);
    }
}
