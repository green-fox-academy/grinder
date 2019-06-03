package com.greenfox.restapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
}
