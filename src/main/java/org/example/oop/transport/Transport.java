package org.example.oop.transport;

import lombok.Data;

/**
 * класс с общим поведением для всех транспортных средств
 */
@Data
public class Transport {
    /**
     * name - название транспортного средства
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

    public Transport() {
    }

    /**
     * Метод Остановки
     */
    public void stop() {// ничего не возвращает, метод пишется с маленькой буквы, должен быть понятен по смыслу

        System.out.println(name + " is stopping");
    }

    /**
     * Метод  действия , метод пишется с маленькой буквы, должен быть понятен по смыслу
     */
    public void drive() { // ничего не возвращает
        System.out.println(name + " is driving");
    }
}
