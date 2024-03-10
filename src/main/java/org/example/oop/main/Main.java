package org.example.oop.main;


import org.example.oop.car.Car;
import org.example.oop.transport.Engine;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine();
        engine.setVolume(10);

        Car car = new Car();
        car.setEngine(engine);

        System.out.println(car.getEngine());
    }
}
