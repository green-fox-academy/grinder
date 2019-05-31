package com.greenfox.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mentorName;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Student> students;

    public Mentor(){
        students = new ArrayList<>();
    }

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        student.addMentor(this);
        this.students.add(student);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }
}




