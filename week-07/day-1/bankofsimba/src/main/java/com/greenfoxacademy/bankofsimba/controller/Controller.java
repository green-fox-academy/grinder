package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.greenfoxacademy.bankofsimba.model.ListOfBankAccounts;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    BankAccount bankAccount = new BankAccount("Simba", 2000.0, "lion");

    DecimalFormat df2 = new DecimalFormat("#.##");

    ListOfBankAccounts getList = new ListOfBankAccounts();

    @RequestMapping("/show")
    public String show(Model model) {
        model.addAttribute(bankAccount);
        return "bankOfSimba";
    }

    @RequestMapping("/string")
    public String string(Model model) {
        model.addAttribute("bankAccount1", bankAccount.getName());
        model.addAttribute("bankAccount2", df2.format(bankAccount.getBalance()));
        model.addAttribute("bankAccount3", bankAccount.getAnimalType());

        return "bankOfSimba";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("bankAccounts", getList.listofBankAccounts());
        return "list";
    }
}
