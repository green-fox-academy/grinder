package com.greenfoxacademy.sqlproject.controller;

import com.greenfoxacademy.sqlproject.model.Assignee;
import com.greenfoxacademy.sqlproject.model.Todo;
import com.greenfoxacademy.sqlproject.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AssigneeController {

    private AssigneeRepository assigneeRepo;

    @Autowired
    public AssigneeController(AssigneeRepository assigneeRepo) {
        this.assigneeRepo = assigneeRepo;
    }

@GetMapping("/listOfAssignees")
public String getList(Model model) {
    model.addAttribute("list", assigneeRepo.findAll());
    return "listOfAssignees";
}

@PostMapping("/listOfAssignees")
public String addAssignee(Model model, @RequestParam String name, @RequestParam String email) {
        model.addAttribute("list", assigneeRepo.save(new Assignee(name, email)));
        return "redirect:/listOfAssignees";
        }

    @GetMapping("/{id}/listOfAssignees")
    public String deleteAssignee(@PathVariable("id") long id) {
        assigneeRepo.deleteById(id);
        return "redirect:/listOfAssignees";
    }
}
