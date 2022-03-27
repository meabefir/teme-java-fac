package com.company.adapter;

public class Body implements BodyFunctions {
    double temperature;

    public Body(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }
}
