package com.pivan.temperature;

public class ConvertFahrenheit implements Converter{

    @Override
    public double convert(double temp) {
        return ((temp * 9 / 5) + 32);
    }
}
