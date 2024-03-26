package org.example.oop.zadachi_oop_java.comp;

import lombok.Setter;

@Setter
public class Monitor implements IMonitor{
    private String name;

    public Monitor(String name) {
        this.name = name;
    }

    public Monitor() {
    }

    @Override
    public String getName() {
        return name;
    }

}
