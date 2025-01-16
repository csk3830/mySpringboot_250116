package com.example.demo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
public class TestController {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("msg", "우선 띄워보자");
        log.info("msg >>>>>>>>>>>, {}", model);
        List<String> list = Arrays.asList("list의 요소 1", "list의 요소 2", "list의 요소 3", "list의 요소 4", "list의 요소 5");
        model.addAttribute("list", list);
        log.info("list >>>>>>>>>>>, {}", model);
        return "index";
    }
}
