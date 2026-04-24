package com.example.classworkapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
public class ClassworkController {

    @GetMapping("/home")
    public String home() {
        return "redirect:/movies";
    }

    @GetMapping("/movies")
    public String hello(Model model) {
        String msg1 = "2026  Fantasy , Action <br> Avatar Aang, the world's last Airbender, learns of an ancient power that could save his culture from extinction.";
        model.addAttribute("msg1", msg1);
        
        boolean isLoggedIn = true;
        model.addAttribute("isLoggedIn", isLoggedIn);
        
        return "movies";
    }
}