package org.example.oop.robot;

public class LittleWing implements IWing {

    private int size;

    @Override
    public void open() {
        System.out.println("LittleWing open");
    }

    @Override
    public int getSize() {
        return size;
    }
}
