package org.example.oop.zadachi_oop_java.car;

import lombok.Setter;

@Setter
public class Car implements ICar{

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Car() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void drive() {
        System.out.println(name + " drive");
    }

    @Override
    public void stop() {
        System.out.println(name + " stop");
    }
}
