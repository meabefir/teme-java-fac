package com.company.adapter;

public class BodyFunctionsFarenheit implements BodyFunctions {
    Body b;

    public BodyFunctionsFarenheit(Body b) {
        this.b = b;
    }

    @Override
    public double getTemperature() {
        return b.getTemperature() * 9/5 + 32.;
    }
}
