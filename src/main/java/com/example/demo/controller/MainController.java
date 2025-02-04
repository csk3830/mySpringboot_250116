package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("msg", "메인입니당");
        return "index";
    }
}
