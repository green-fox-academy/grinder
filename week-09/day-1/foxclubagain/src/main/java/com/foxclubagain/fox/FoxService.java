package com.foxclubagain.fox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
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

    public boolean numberFox() {
        if (foxRepo.count() > 2) {
            return true;
        }
        return false;
    }

    public boolean numberFoxfour() {
        if (foxRepo.count() == 4) {
            return true;
        }
        return false;
    }

    public List<Fox> findAll() {
        return foxRepo.findAll();
    }


}
