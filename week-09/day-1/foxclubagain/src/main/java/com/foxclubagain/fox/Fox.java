package com.foxclubagain.fox;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fox {

    @Id
    @GeneratedValue
    @JsonIgnore
    private long id;

    private String name;
    private String food;
    private String drink;
    private long hungry;

    public Fox() {

    }

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.hungry = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public void incrementHungry() {
        hungry++;
    }

    public void decrementHungry() {
        hungry--;
    }
}
