package com.greenfoxacademy.bankofsimba.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfBankAccounts {

    public List<BankAccount> listofBankAccounts() {

        List<BankAccount> listOfBankAccounts = new ArrayList<>();

        listOfBankAccounts.add(new BankAccount("Simba", 2000.0, "lion"));
        listOfBankAccounts.add(new BankAccount("Scar", 2000, "lion"));
        listOfBankAccounts.add(new BankAccount("Nala", 2000, "lion"));
        listOfBankAccounts.add(new BankAccount("Timon", 2000, "meerkat"));
        listOfBankAccounts.add(new BankAccount("Zazu", 2000, "bird"));

        /*listOfBankAccounts
                .stream()
                .collect(Collectors.toList());*/

        return listOfBankAccounts;
    }
}
