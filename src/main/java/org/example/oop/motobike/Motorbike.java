package org.example.oop.motobike;


import org.example.oop.transport.Transport;

public class Motorbike extends Transport {
    String name;
    String model;
    double volume;
    int number;
    int maxSpeed;
@Override
    public void drive() {
        System.out.println(name + "Включил первую передачу");
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.printf("%s разгонялся до максимально возможной скорости %d", name, maxSpeed );
    }

    @Override
    public void stop () {
        System.out.printf("%s применил экстренное торможение");
    }

    public Motorbike() {
    }

    public Motorbike(String name, String model, double volume, int number, int maxSpeed) {
        this.name = name;
        this.model = model;
        this.volume = volume;
        this.number = number;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", volume=" + volume +
                ", number=" + number +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
