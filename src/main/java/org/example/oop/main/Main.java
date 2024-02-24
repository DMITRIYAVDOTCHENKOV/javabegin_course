package org.example.oop.main;

import org.example.oop.car.Car;

public class Main {
    public static void main(String[] args) {
        /**
         * Объекта класса Car
         */
        Car nissan = new Car("nissan", "sedan", "blue");// через ссылку опрощаемся к объекту и можем изменять его свойства
        nissan.drive();

        Car bmw = new Car("bmw", "x3", "red");
        bmw.stop();

        Car hynday = new Car();
        hynday.setColor("black");
        hynday.setName("Hynday");
        hynday.setModel("Greta");
        hynday.drive();
        hynday.stop();
    }
}
