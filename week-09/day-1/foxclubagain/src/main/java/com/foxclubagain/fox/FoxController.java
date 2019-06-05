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
        model.addAttribute("list", foxRepo.findAll());
        model.addAttribute("createdFox", foxService.lastFox());
        //model.addAttribute("foxByDrink", foxRepo.findFoxByDrink("water"));
        return "index";
    }

    @GetMapping("/create")
    public String getCreate() {
        return "create";
    }

    @PostMapping("/create")
    public String login(@RequestParam String name, @RequestParam String food, @RequestParam String drink) {
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
}
