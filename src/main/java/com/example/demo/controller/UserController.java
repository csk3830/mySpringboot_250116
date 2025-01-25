package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.domain.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/user/*")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/login")
    public void login(){}

    @GetMapping("/register")
    public void register(){}

    @PostMapping("/register")
    public String register(UserVO userVO){
        userService.register(userVO);
        return "redirect:/user/login";
    }
}
