package com.greenfoxacademy.sqlproject;

import com.greenfoxacademy.sqlproject.model.Todo;
import com.greenfoxacademy.sqlproject.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlprojectApplication /*implements CommandLineRunner*/ {

    /*@Autowired
    TodoRepository repo;*/

    public static void main(String[] args) {
        SpringApplication.run(SqlprojectApplication.class, args);

    }

    /*@Override
    public void run(String... args) throws Exception {
        repo.save(new Todo("I have to learn", false, false));
        repo.save(new Todo("For loops", false, true));
        repo.save(new Todo("sql", true, false));
        System.out.println(repo.count());
    }*/
}
