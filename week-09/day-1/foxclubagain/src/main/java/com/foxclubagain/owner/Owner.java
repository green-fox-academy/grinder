package com.foxclubagain.owner;

import com.foxclubagain.fox.Fox;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Owner {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    @OneToMany(mappedBy = "owner")
    List<Fox> foxes;

    public Owner() {

    }

    public Owner(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public void setFoxes(List<Fox> foxes) {
        this.foxes = foxes;
    }
}
