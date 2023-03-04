package com.pivan.figure_3D;

public abstract class SolidOfRevolution implements Shape {
    private double radius;

    public SolidOfRevolution(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
}
