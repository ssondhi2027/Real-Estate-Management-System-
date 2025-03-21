package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Navigationbar 
{
    @GetMapping("/")
    public String home() {
        return "index";  // Thymeleaf template "index.html" will be rendered
    }
}
