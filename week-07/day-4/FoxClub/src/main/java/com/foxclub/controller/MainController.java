package com.foxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Model model, @RequestParam String name) {
        model.addAttribute("name", name);

        return "index";
    }

    @GetMapping("/login")
    public String loginGet(){
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        return "redirect:/?name=" + name;
    }
}
