package com.reddit.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class PostController {

    PostRepository postrepo;

    @Autowired
    public PostController(PostRepository postrepo) {
        this.postrepo = postrepo;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("list", postrepo.findAll());
        return "index";
    }

    @GetMapping("/submit")
    public String getSubmit() {
        return "submit";
    }

    @PostMapping("/submit")
    public String createPost(@RequestParam String title, @RequestParam String url) {
        postrepo.save(new Post(title, url));
        return "redirect:/";
    }
}
