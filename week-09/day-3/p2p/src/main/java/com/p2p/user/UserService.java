package com.p2p.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepo;

    @Autowired
    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void saveUser(String username) {
        User user = new User();
        user.setUsername(username);
        userRepo.save(user);
    }

    public boolean userIsCreated() {
        return userRepo.findAll().size() != 0;
    }

    public User getUser() {
        return userRepo.findAll().get(0);
    }

    public void updateUserName(String username) {
        User user = userRepo.findAll().get(0);
        user.setUsername(username);
        userRepo.save(user);
    }
}
