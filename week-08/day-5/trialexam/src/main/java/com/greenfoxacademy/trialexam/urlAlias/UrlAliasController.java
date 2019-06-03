package com.greenfoxacademy.trialexam.urlAlias;

import com.greenfoxacademy.trialexam.UrlAliasrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UrlAliasController {

    UrlAliasrepository urlRepo;

    @Autowired
    public  UrlAliasController(UrlAliasrepository urlRepo) {
        this.urlRepo = urlRepo;
    }

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @PostMapping("/save-link")
    public String submitForm(Model model, @RequestParam String url, String alias) {
        model.addAttribute(urlRepo.save(new UrlAlias(url, alias)));
        return "redirect:/";
    }
}
