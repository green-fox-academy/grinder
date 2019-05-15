package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    String name = "Tomas";
    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greeting newGreeting(@RequestParam String name) {
        return new Greeting (1, "Hello, " + name + "!");
    }
}
