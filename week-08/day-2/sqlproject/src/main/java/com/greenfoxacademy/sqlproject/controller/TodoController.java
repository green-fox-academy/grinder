package com.greenfoxacademy.sqlproject.controller;

import com.greenfoxacademy.sqlproject.model.Todo;
import com.greenfoxacademy.sqlproject.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Controller
public class TodoController {

    private TodoRepository todoRepo;

    @Autowired
    public TodoController(TodoRepository repo) {
        this.todoRepo = repo;
    }

    @GetMapping("/")
    public String todo(Model model) {
        model.addAttribute("todos", todoRepo.findAll());
        return "todolist";
    }

    @PostMapping("/")
    public String search(Model model, @RequestParam String keyword) {
        model.addAttribute("todos", todoRepo.find(keyword));
        return "todolist";
    }

    /*@GetMapping({"/", "/todo"})
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
    }*/

    @GetMapping("/table")
    public String table(Model model) {
        model.addAttribute("todos", todoRepo.findAll());
        return "todoTable";
    }

    @GetMapping("/addNewTodo")
    public String addNewPage() {
        return "/addNewTodo";
    }

    @PostMapping("/addNewTodo")
    public String addNew(@RequestParam String title) {
        todoRepo.save(new Todo(title));
        return "redirect:/table";
    }

    @GetMapping("/{id}/delete")
    public String deleteTodo(@PathVariable("id") long id) {
        todoRepo.deleteById(id);
        return "redirect:/table";
    }

    @GetMapping("{id}/edit")
    public String editTodo(Model model, @PathVariable long id) {
        model.addAttribute("edit", todoRepo.findById(id));
        model.addAttribute("id", id);
        return "edit";
    }

    @PostMapping("edit/{id}")
    public String save(@ModelAttribute Todo todo) {
        todoRepo.save(todo);
        return "redirect:/table";
    }

    @GetMapping("/afterSearch")
    public String afterSearch(Model model) {
        model.addAttribute("result", todoRepo.findAll());
        return "afterSearch";
    }


}
