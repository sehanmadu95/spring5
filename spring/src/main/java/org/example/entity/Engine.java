package org.example.entity;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    String type;

    public Engine() {
        type="default test type";
    }

    public Engine(String type) {

        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
