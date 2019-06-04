package com.greenfox.restapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Object doubleIt(@RequestParam (required = false) Integer input) {
        if(input != null) {
            Doubling doubling = new Doubling(input);
            return doubling;
        } else {
            Error error = new Error("Please provide an input!");
            return error;
        }
    }
    @GetMapping("/greeter")
    public Object greeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null && title == null) {
            Error newError = new Error("Please provide a name and a title!");
            return newError;
        }
        if (name == null) {
            Error newError = new Error("Please provide a name!");
            return newError;
        }

        if (title == null) {
            Error newError = new Error("Please provide a title!");
            return newError;
        }
        else {
            Greeter greet = new Greeter(name, title);
            return greet;
        }
    }

    @GetMapping("/appenda/{appendable}")
    public Object appendA(@RequestParam(required = false) String name, @PathVariable()) {

    }
}
