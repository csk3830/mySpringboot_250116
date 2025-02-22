package com.example.demo;
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
    public String index(){
        return "index";
    }
}
