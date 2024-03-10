package org.example.oop.transport;

public class Engine {
    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
       }

    public Engine(double volume) {
        this.volume = volume;
    }

    public Engine() {
    }
}
