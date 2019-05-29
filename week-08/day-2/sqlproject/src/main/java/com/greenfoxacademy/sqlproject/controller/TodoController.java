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
        if(done) {
            List<Todo> falses =
            StreamSupport.stream(todos.spliterator(), false)
                    .filter(d -> d.isDone() == true)
                    .collect(Collectors.toList());
            model.addAttribute("todos", falses);
        } else {
            List<Todo> trues =
            StreamSupport.stream(todos.spliterator(), false)
                    .filter(d -> d.isDone() == false)
                    .collect(Collectors.toList());
            model.addAttribute("todos", trues);
        }
        return "todolist";
    }

    @GetMapping("/table")
    public String table(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todoTable";
    }

    @GetMapping("/addNewTodo")
    public String addNewPage() {
        return "/addNewTodo";
    }

    @PostMapping("/addNewTodo")
    public String addNew(@RequestParam String title) {
        repo.save(new Todo(title));
        return "redirect:/table";
    }

    @DeleteMapping("/{id}/delete")
    public String deleteTodo(@PathVariable long id) {
        repo.delete(id);
        return "redirect:/table";
    }




}
