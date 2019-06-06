package com.foxclubagain.fox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class FoxRestController {

    FoxRepository foxRepo;
    FoxService foxService;

    @Autowired
    public FoxRestController(FoxRepository foxRepo, FoxService foxService) {
        this.foxRepo = foxRepo;
        this.foxService = foxService;
    }

    @GetMapping("/getallfoxes")
    public List<Fox> getAllFoxes() {
        if(foxRepo.count() < 5) {
            Error error = new Error("less than 5 foxes");
            return (List<Fox>) error;
        }
        return foxRepo.findAll();
    }

    @PostMapping("/postallfoxes")
    public List<Fox> postAllFoxes() {
        return foxRepo.findAll();
    }

    @DeleteMapping("/{id}")
    public String deleteFox(@PathVariable long id) {
        Fox fox = foxRepo.findById(id).get();
        foxRepo.delete(fox);
        return "Deleting fox OK";
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

    @PostMapping("/foxWithLowestId")
    public Optional<Fox> foxWithLowestId() {
        return foxRepo.foxWithLowestId();
    }
}