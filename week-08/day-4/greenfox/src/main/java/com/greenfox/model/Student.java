package com.greenfox.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "students")
    private List<Mentor> mentors;


    public Student(){
        mentors= new ArrayList<>();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        mentors= new ArrayList<>();
    }

    public void addMentor(Mentor mentor){
        this.mentors.add(mentor);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
