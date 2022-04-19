package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Spring Boot + SSL (HTTPS");
        model.addAttribute("msg", "Welcome to the SSL!");
        return "security/index";

    }
}
