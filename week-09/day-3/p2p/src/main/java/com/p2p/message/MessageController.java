package com.p2p.message;

import com.p2p.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

    MessageRepository messageRepo;
    MessageService messageService;

    @Autowired
    public MessageController(MessageRepository messageRepo, MessageService messageService) {
        this.messageRepo = messageRepo;
        this.messageService = messageService;
    }

    @PostMapping("/newMessage")
    public String saveMessage(Model model, @RequestParam String text, @ModelAttribute User user) {
        messageService.addMessage(text, user);
        return "redirect:/";
    }
}
