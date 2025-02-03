package com.example.demo.controller;

import com.example.demo.domain.BoardVO;
import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/list")
    public String list(Model model){
        List<BoardVO> list = boardService.getList();
        model.addAttribute("list", list);
        return "/board/list";
    }

    @GetMapping("/register")
    public String register(){
        return "/board/register";
    }

    @PostMapping("/register")
    public String register(BoardVO boardVO){
        boardService.register(boardVO);
        return "redirect:/board/list";
    }

    @GetMapping({"/detail", "/modify"})
    public String detail(Model model, @RequestParam("id") long id){
        BoardVO boardVO = boardService.getBoardById(id);
        model.addAttribute("boardVO", boardVO);
        return "/board/detail";
    }
}
