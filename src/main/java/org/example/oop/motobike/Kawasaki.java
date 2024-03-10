package org.example.oop.motobike;

public class Kawasaki extends Motorbike {
    int minSpeed;
    int year;

    public Kawasaki() {
    }

    public Kawasaki(String name, String model, double volume, int number, int maxSpeed, int minSpeed, int year) {
        super(name, model, volume, number, maxSpeed);
        this.minSpeed = minSpeed;
        this.year = year;
    }

    public void jump () {
        System.out.printf("%s разогнался до максимальной скорости  %d и прыгнул через ручей", name,maxSpeed);
    }



}
