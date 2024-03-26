package org.example.oop.robot;

// вы можете во всех интерфейсах описывать как методы-свойства, так методы-свойства

public interface IRobot{

    // методы-действия (методы бизнес-процессов)
    default void move() { // компилятор не будет ругаться, если классы не будут реализовывать этот метод, т.к. у него есть деф. реализация
        System.out.println("default move " + getName());
    }

    void stop();
    void flight();
    void talk();

    // методы-свойства
    String getName();
    IWing getWing(); // обязываем по контракту всех роботов иметь крыло

}
