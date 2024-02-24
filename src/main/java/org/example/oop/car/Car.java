package org.example.oop.car;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Класс Car - трафарет
 */
@Setter
@Getter
public class Car {

    /**
     * name - название машины
     */
    private String name;
    /**
     * model -  модель машины
     */
    private String model;
    /**
     * color - цвет машины
     */
    private String color;

    /**
     * Метод  действия , метод пишется с маленькой буквы, должен быть понятен по смыслу
     */
    public void drive() { // ничего не возвращает
        System.out.println(this.name + " is driving");
    }

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    public Car() {
    }

    /**
     * Метод Остановки
     */
    public void stop() {// ничего не возвращает, метод пишется с маленькой буквы, должен быть понятен по смыслу

        System.out.println(this.name + " is stopping");
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
