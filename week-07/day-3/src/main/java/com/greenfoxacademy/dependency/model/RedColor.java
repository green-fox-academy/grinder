package com.greenfoxacademy.dependency.model;

public class RedColor implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is red in color...");
    }
}
