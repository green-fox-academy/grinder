package com.foxclubagain.owner;

import com.foxclubagain.fox.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OwnerController {

    OwnerRepository ownerRepo;

    @Autowired
    public OwnerController(OwnerRepository ownerRepo) {
        this.ownerRepo = ownerRepo;
    }

    @GetMapping("createOwner")
    public String showCreateOwner() {
        return "createOwner";
    }

    @PostMapping("/createOwner")
    public String createOwner(@RequestParam String name) {
        ownerRepo.save(new Owner(name));
        return "redirect:/";
    }
}
