package com.usefulutilities.controller;

import com.usefulutilities.model.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    UtilityService utilityService;

    @Autowired
    public Controller(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful/colored")
    public String emptyColorPage(Model model) {
        model.addAttribute("randomColor", utilityService.randomColor());
        return "emptyColorPage";
    }

    @RequestMapping("/useful/email")
    public String validator(Model model, @RequestParam String email) {

        if (utilityService.validateEmail(email)) {
            model.addAttribute("email", "<font color=\"green\">" + email + " is valid email address</font>");
        } else {
            model.addAttribute("email", "<font color=\"red\">" + email + " is not valid email address</font>");
        }
        return "emptyColorPage";
    }

    @RequestMapping("useful/encode")
    public String encode(Model model, @RequestParam String text, @RequestParam int number) {
        model.addAttribute("caesar", utilityService.caesar(text, number));
        return "emptyColorPage";
    }

    @RequestMapping("useful/decode")
    public String decode(Model model, @RequestParam String text, @RequestParam int number) {
        model.addAttribute("caesar", utilityService.caesar(text, (-number)));
        return "emptyColorPage";
    }
}




