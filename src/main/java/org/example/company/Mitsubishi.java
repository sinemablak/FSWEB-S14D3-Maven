package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String brake() {
        return super.brake();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }
}
