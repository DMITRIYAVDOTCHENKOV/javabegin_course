package org.example.lessonComputer.computer;

public class Computer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer(String name) {
        this.name = name;
    }

    public Computer() {
    }

    public void on() {
        System.out.println(name + " Включен");
    }
    public void off() {
        System.out.println(name + " Выключен");
    }
}
