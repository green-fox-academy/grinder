package com.foxclub.controller;

import com.foxclub.model.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {

    List<Fox> listOfFoxes = new ArrayList<>(Arrays.asList());

    @GetMapping("/")
    public String getMain() {
        return "main";
    }

    @GetMapping("/createFox")
    public String getCreate() {
        return "createFox";
    }

    @RequestMapping(value = "/createFox", method = RequestMethod.POST)
    public String createFox(Model model, @RequestParam String name, String food, String drink) {
        listOfFoxes.add(new Fox(name, food, drink));
        return "createFox";
    }

    @RequestMapping("/listOfFoxes")
    public void getList(Model model) {
        model.addAttribute("fox", listOfFoxes);
    }

    @RequestMapping("/nutritionStore")
    public String getNutrition(Model model) {
        model.addAttribute("fox", listOfFoxes);
        return "nutritionStore";
    }

    @PostMapping(value = "/nutritionStore")
    public String changeNutrition(@RequestParam String name, String food, String drink) {
        for (Fox fox : listOfFoxes) {
            if (fox.getName().equals(name)) {
                fox.setFood(food);
                fox.setDrink(drink);
            }
        }
        return "/nutritionStore";
    }
}


