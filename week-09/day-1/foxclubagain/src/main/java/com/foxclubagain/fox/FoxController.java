package com.foxclubagain.fox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxController {

    FoxRepository foxRepo;
    FoxService foxService;

    @Autowired
    public FoxController(FoxRepository foxRepo, FoxService foxService) {
        this.foxRepo = foxRepo;
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        if(foxService.numberFox()) {
            model.addAttribute("count", "There are more than 2 foxes now!");
        }
        else {
            model.addAttribute("count", null);
        }
        model.addAttribute("list", foxService.findAll());
        model.addAttribute("createdFox", foxService.lastFox());
        model.addAttribute("lotFoxes", foxService.numberFoxfour());
        model.addAttribute("drinks", foxService.drinks());
        return "index";
    }

    @GetMapping("/create")
    public String getCreate() {
        return "create";
    }

    @PostMapping("/create")
    public String create(@RequestParam String name, @RequestParam String food, @RequestParam String drink) {
        foxRepo.save(new Fox(name, food, drink));
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditFox(@PathVariable int id) {
        return "editFox";
    }

    @PostMapping("/edit/{id}")
    public String editFox(@PathVariable long id, @RequestParam String name, @RequestParam String food, @RequestParam String drink) {
        Fox fox = foxRepo.findById(id).get();
        fox.setName(name);
        fox.setFood(food);
        fox.setDrink(drink);
        foxRepo.save(fox);
        return "redirect:/";
    }

    @GetMapping("/{id}")
    public String deleteFox(@PathVariable long id) {
        Fox fox = foxRepo.findById(id).get();
        foxRepo.delete(fox);
        return "redirect:/";
    }

    @GetMapping("/increment/{id}")
    public String incrementHungry(@PathVariable long id) {
        Fox fox = foxRepo.findById(id).get();
        fox.incrementHungry();
        foxRepo.save(fox);
        return "redirect:/";
    }

    @GetMapping("/decrement/{id}")
    public String decrementHungry(@PathVariable long id) {
        foxService.decrementHungry(id);
        return "redirect:/";
    }

    @GetMapping("/editdrink/{id}")
    public String showEditDrink(Model model, @PathVariable long id) {
        model.addAttribute("drinks", foxService.drinks());
        return "editdrink";
    }

    @PostMapping("/editdrink/{id}")
    public String editDrink(@PathVariable long id, @RequestParam String drink) {
        Fox fox = foxRepo.findById(id).get();
        fox.setName(drink);
        foxRepo.save(fox);
        return "redirect:/";
    }
}

