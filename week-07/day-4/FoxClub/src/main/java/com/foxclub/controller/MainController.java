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
        return "/createFox";
    }

    @RequestMapping(value = "/createFox", method = RequestMethod.POST)
    public String createFox(Model model, @RequestParam String name, String food, String drink) {
        listOfFoxes.add(new Fox(name, food, drink));
        return "redirect:/showCreatedFox?name=" + name + "&food=" + food + "&drink=" + drink;
    }

    @RequestMapping("/listOfFoxes")
    public String getList(Model model) {
        model.addAttribute("fox", listOfFoxes);
        return "listOfFoxes";
    }

    @RequestMapping("/nutritionStore")
    public String getNutrition(Model model) {
        model.addAttribute("fox", listOfFoxes);
        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String changeNutrition(@RequestParam String name, String food, String drink) {
        for (Fox fox : listOfFoxes) {
            if (fox.getName().equals(name)) {
                fox.setFood(food);
                fox.setDrink(drink);
            }
        }
        return "/nutritionStore";
    }

    @GetMapping("/showCreatedFox")
    public String showCreatedFox(Model model, @RequestParam String name, String food, String drink) {
        model.addAttribute("name", name);
        model.addAttribute("food", food);
        model.addAttribute("drink", drink);
        return "showCreatedFox";
    }

    @GetMapping("/removeFox")
    public String showDeletingFox(Model model) {
        model.addAttribute("fox", listOfFoxes);
    return "/removeFox";
    }



    @PostMapping("/removeFox")
    public String removeFox(@RequestParam String name) {
        for (Fox fox : listOfFoxes) {
            if (fox.getName().equals(fox.getName())) {
                listOfFoxes.remove(fox);
            }
        }
        return "/removeFox";
    }
}


