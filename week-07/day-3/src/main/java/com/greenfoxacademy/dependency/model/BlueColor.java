package com.greenfoxacademy.dependency.model;

import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {

    @Override
    public void printColor() {
        System.out.println("It is blue in color...");
    }
}
