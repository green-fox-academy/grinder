package com.greenfoxacademy.sqlproject.controller;

import com.greenfoxacademy.sqlproject.model.Todo;
import com.greenfoxacademy.sqlproject.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

    private TodoRepository repo;

    @Autowired
    public TodoController(TodoRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/todo")
    public String todo() {
        return "";
    }

    @GetMapping({"/", "/todo"})
    public String list(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }
}
