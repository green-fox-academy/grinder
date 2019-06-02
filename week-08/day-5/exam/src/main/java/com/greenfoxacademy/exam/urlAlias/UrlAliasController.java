package com.greenfoxacademy.exam.urlAlias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UrlAliasController {

    private UrlAliasRepository urlRepo;
    private UrlAliasService service;

    @Autowired
    public UrlAliasController(UrlAliasRepository urlRepo, UrlAliasService service) {
        this.urlRepo = urlRepo;
        this.service = service;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("urlAlias", service.getItemToDisplayed());
        model.addAttribute("message", service.getMessage());
        model.addAttribute("stored", false);
        return "index";
    }

    @PostMapping("/save-link")
    public String submit(Model model, @ModelAttribute UrlAlias urlAlias) {

        boolean isStored = service.isAlreadyStored(urlAlias.getAlias());
        if(isStored) {
            model.addAttribute("message", "Your alias is already in use!");
            model.addAttribute("urlAlias", urlAlias);
            model.addAttribute("stored", true);
            service.setItemToDisplayed(urlAlias);
        }
        else {
            service.save(urlAlias);
            String message = "Your URL is aliased to " + urlAlias.getAlias() + " and your secret code is " + urlAlias.getSecretCode();
            model.addAttribute("message", message);
            model.addAttribute("urlAlias", new UrlAlias());
            model.addAttribute("stored", false);
            service.setItemToDisplayed(new UrlAlias());
        }
        return "redirect:/";
    }
}
