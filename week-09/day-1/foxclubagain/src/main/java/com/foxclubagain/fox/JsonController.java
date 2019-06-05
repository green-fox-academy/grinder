package com.foxclubagain.fox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JsonController {

    FoxRepository foxRepo;
    FoxService foxService;

    @Autowired
    public JsonController(FoxRepository foxRepo, FoxService foxService) {
        this.foxRepo = foxRepo;
        this.foxService = foxService;
    }

    @GetMapping("/getallfoxes")
    public List<Fox> getAllFoxes() {
        return foxRepo.findAll();
    }

    @PostMapping("/postallfoxes")
    public List<Fox> postAllFoxes() {
        return foxRepo.findAll();
    }

    @GetMapping("/foxByDrink")
    public Optional<Fox> foxByDrink() {
        return foxRepo.findFoxByDrink("water");
    }

    @GetMapping("/jsondecrement/{id}")
    public Fox jsonDecrementHungry(@PathVariable long id) {
        return foxService.decrementHungry(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable long id) {
        foxRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}