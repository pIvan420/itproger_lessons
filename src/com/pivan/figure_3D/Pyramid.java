package com.pivan.figure_3D;

public class Pyramid implements Shape{
    private double h, s;

    public Pyramid(double h, double s){
        this.h = h;
        this.s = s;
    }

    @Override
    public double getVolume() {
        return this.s * this.h / 3;
    }
}
