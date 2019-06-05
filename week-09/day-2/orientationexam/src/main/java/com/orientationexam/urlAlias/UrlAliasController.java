package com.orientationexam.urlAlias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UrlAliasController {

    UrlAliasRepository urlAliasRepo;
    UrlAliasService urlAliasService;

    @Autowired
    public UrlAliasController(UrlAliasRepository urlAliasRepo, UrlAliasService urlAliasService) {
        this.urlAliasRepo = urlAliasRepo;
        this.urlAliasService = urlAliasService;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("urlAlias", new UrlAlias());
        return "index";
    }

    @PostMapping("/save-link")
    public String submit(@ModelAttribute UrlAlias urlAlias) {
        urlAliasService.saveUrlAlias();
        return "rediret:/";
    }
}
