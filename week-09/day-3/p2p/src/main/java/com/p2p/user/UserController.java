package com.p2p.user;

import com.p2p.message.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private UserRepository userRepo;
    private UserService userService;
    private MessageRepository messageRepo;

    @Autowired
    public UserController(UserRepository userRepo, UserService userService, MessageRepository messageRepo) {
        this.userRepo = userRepo;
        this.userService = userService;
        this.messageRepo = messageRepo;
    }

    @GetMapping("/")
    public String getMain(Model model, @RequestParam(required = false) String error) {
        if(error != null) {
            model.addAttribute("error", "The username field is empty!");
        }
        model.addAttribute("user", userService.getUser());
        if (!userService.userIsCreated()) {
            return "redirect:/register";
        }
        model.addAttribute("text", messageRepo.findAll());
        return "main";
    }

    @GetMapping("/register")
    public String register() {
        if (userService.userIsCreated()) {
            return "redirect:/";
        }
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(Model model, @RequestParam(required = false) String username) {

        if (username.isEmpty()) {
            model.addAttribute("error", "The username field is empty!");
            return "register";
        }
        userService.saveUser(username);
        return "redirect:/";
    }

    @PostMapping("/")
    public String edit(Model model, @RequestParam String username) {
        if (username.isEmpty()) {
            return "redirect:?error=emptyUser";
        }
        userService.updateUserName(username);
        return "redirect:/";
    }
}
