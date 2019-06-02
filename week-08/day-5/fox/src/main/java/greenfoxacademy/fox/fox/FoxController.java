package greenfoxacademy.fox.fox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FoxController {

    FoxRepository foxRepo;

    @Autowired
    public FoxController(FoxRepository foxRepo) {
        this.foxRepo = foxRepo;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("listFoxes", foxRepo.orderById());
        return "index";
    }

    @PostMapping("/")
    public String createFox(@RequestParam String name, String color) {
        foxRepo.save(new Fox(name, color));
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteFox(@PathVariable long id) {
        foxRepo.deleteById(id);
        return "redirect:/";
    }
}
