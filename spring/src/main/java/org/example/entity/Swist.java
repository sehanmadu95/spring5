package org.example.entity;

import org.springframework.stereotype.Component;

@Component("swist")
public class Swist implements Car{
    @Override
    public void specs() {
        System.out.println("Car is Swist...");
    }
}
