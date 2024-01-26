package org.example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("corolla")
public class Corolla implements Car{

    @Autowired
    Engine engine;


    public void setEngine(Engine engine){
        engine.type="set method is corolla...";
        this.engine=engine;
    }

    public Corolla(Engine engine) {
        engine.type="Cotructor in corolla....";
        this.engine = engine;
    }

    @Override
    public void specs() {
        System.out.println("Car Is Corolla......."+engine.type);
    }
}
