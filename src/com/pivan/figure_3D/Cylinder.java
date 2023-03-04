package com.pivan.figure_3D;

public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }
}
