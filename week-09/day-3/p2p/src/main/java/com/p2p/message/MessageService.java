package com.p2p.message;

import com.p2p.user.User;
import com.p2p.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    MessageRepository messageRepo;
    UserRepository userRepo;
    User user;

    @Autowired
    public MessageService(MessageRepository messageRepo, UserRepository userRepo, User user) {
        this.messageRepo = messageRepo;
        this.userRepo = userRepo;
        this.user = user;
    }

    public void addMessage(String text, User user) {
        Message message = new Message();
        message.setText(text);
        messageRepo.save(message);
    }
}
