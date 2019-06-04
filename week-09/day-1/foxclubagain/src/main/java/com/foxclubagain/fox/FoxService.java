package com.foxclubagain.fox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxService {

    FoxRepository foxRepo;

    @Autowired
    public FoxService(FoxRepository foxRepo) {
        this.foxRepo = foxRepo;
    }

    public Fox lastFox() {
        Fox fox = new Fox();
        if(foxRepo.lastFox().isPresent()) {
            fox = foxRepo.lastFox().get();
        }
        return fox;
    }




}
