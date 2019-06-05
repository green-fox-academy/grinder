package com.foxclubagain.fox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class FoxService {

    FoxRepository foxRepo;

    @Autowired
    public FoxService(FoxRepository foxRepo) {
        this.foxRepo = foxRepo;
    }

    public Fox lastFox() {
        Fox fox = new Fox();
        if (foxRepo.lastFox().isPresent()) {
            fox = foxRepo.lastFox().get();
        }
        return fox;
    }

    public Fox decrementHungry(Long id) {
        Fox fox = foxRepo.findFoxById(id).get();
        fox.decrementHungry();
        foxRepo.save(fox);
        return fox;
    }

    public long numberFox() {
        long numberFox = foxRepo.count();
        return numberFox;
    }
}
