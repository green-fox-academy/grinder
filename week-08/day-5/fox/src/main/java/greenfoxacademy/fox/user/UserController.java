package greenfoxacademy.fox.user;

import greenfoxacademy.fox.fox.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    UserRepository userRepo;

    @Autowired
    public UserController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/register")
    public String register() {
        return "/register";
    }

    @PostMapping("/register")
    public String createAccount(@RequestParam String name, String password) {
        userRepo.save(new User(name, password));
        return "redirect:/";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String create(Model model, @ModelAttribute User user) {
        userRepo.save(user);
        return "redirect:/";
    }
}
