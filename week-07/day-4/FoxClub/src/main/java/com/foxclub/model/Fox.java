package com.foxclub.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    String name;
    String food;
    String  drink;
    List<String> tricks;

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
        this.tricks = new ArrayList<>();
    }
}
