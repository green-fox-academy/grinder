package com.greenfoxacademy.dependency;

import com.greenfoxacademy.dependency.model.BlueColor;
import com.greenfoxacademy.dependency.model.MyColor;
import com.greenfoxacademy.dependency.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication implements CommandLineRunner {

    Printer printer;
    BlueColor blueColor;

    @Autowired
    MyColor myColor;
    /*public DependencyApplication (BlueColor blueColor, Printer printer) {
        this.blueColor = blueColor;
        this.printer = printer;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(DependencyApplication.class, args);
    }


    public void run(String... args) throws Exception {
        /*printer.log("hello");
        blueColor.printColor();*/
        myColor.printColor();
    }
}


