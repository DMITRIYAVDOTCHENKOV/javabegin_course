package org.example.oop.car;


import lombok.Data;
import org.example.oop.transport.Engine;
import org.example.oop.transport.Transport;

@Data
public class Car extends Transport {
    private int number; // регистрационный номер машины
    private Engine engine;

    public Car(String name, String model, String color, int number) {
        this.number = number;
        this.setName(name);
        this.setModel(model);
        this.setColor(color);
    }

    public Car(int number) {
        this.number = number;
    }

    public Car() {
        System.out.println("car");
    }



    @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println(getName() + " Погнал");
    }
}
