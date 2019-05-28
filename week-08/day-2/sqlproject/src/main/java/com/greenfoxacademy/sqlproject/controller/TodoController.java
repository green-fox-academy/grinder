package com.greenfoxacademy.sqlproject.controller;

import com.greenfoxacademy.sqlproject.model.Todo;
import com.greenfoxacademy.sqlproject.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Controller
public class TodoController {

    private TodoRepository repo;

    @Autowired
    public TodoController(TodoRepository repo) {
        this.repo = repo;
    }

    /*@GetMapping("/todo")
    public String todo() {
        return "todolist";
    }*/

    @GetMapping({"/", "/todo"})
    public String list(Model model, @RequestParam boolean done) {
        Iterable<Todo> todos = repo.findAll();
        if(!done) {
            Iterable<String> iterable = Arrays.asList();
            StreamSupport.stream(iterable.spliterator(), false)
                    .filter(d -> d.equals(done == false))
                    .collect(Collectors.toList());
            model.addAttribute("todos", iterable );
        } else {
            model.addAttribute("todos", todos);
        }

        return "todolist";
    }

    @GetMapping("/table")
    public String table(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todoTable";
    }
}
