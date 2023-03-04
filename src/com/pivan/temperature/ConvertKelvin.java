package com.pivan.temperature;

public class ConvertKelvin implements Converter{
    @Override
    public double convert(double temp) {
        return (temp + 273.15);
    }
}
