package com.example.demo.controller;

import com.example.demo.domain.BoardVO;
import com.example.demo.domain.PagingVO;
import com.example.demo.handler.PagingHandler;
import com.example.demo.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/list")
    public String list(Model model, PagingVO pagingVO){
        List<BoardVO> list = boardService.getList(pagingVO);
        int totalCount = boardService.getTotal(pagingVO);
        PagingHandler pagingHandler = new PagingHandler(pagingVO, totalCount);

        model.addAttribute("list", list);
        model.addAttribute("pagingHandler", pagingHandler);

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
    public String read(Model model, @RequestParam("id") long id, @RequestParam(value = "mode", defaultValue = "detail") String mode){
        BoardVO boardVO = boardService.getBoardById(id);
        model.addAttribute("boardVO", boardVO);
        model.addAttribute("mode", mode);
        return mode.equals("modify") ? "/board/modify" : "/board/detail";
    }

    @PostMapping("/update")
    public String update(BoardVO boardVO){
        boardService.updateBoard(boardVO);
        return "redirect:/board/detail?id=" + boardVO.getId();
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") long id, RedirectAttributes redirectAttributes) {
        boardService.isDelUpdate(id);
        redirectAttributes.addFlashAttribute("message", "성공적으로 삭제되었습니다.");
        return "redirect:/board/list";
    }

}
