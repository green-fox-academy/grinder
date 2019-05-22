package com.usefulutilities.controller;

import com.usefulutilities.model.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    }

