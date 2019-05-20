package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

    @RequestMapping("/show")
    public String show(Model model) {
        model.addAttribute(bankAccount);
        return "bankOfSimba";
    }

    @RequestMapping("/string")
    public String string(Model model) {
        model.addAttribute(bankAccount);
        return "bankOfSimba";
    }
}
