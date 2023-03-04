package com.pivan.figure_3D;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Box implements Shape{

    private double volume_box;
    private ArrayList<Shape> shapes = new ArrayList();

    public Box(double volume_box){
        this.volume_box = volume_box;
    }

    public boolean add(Shape shape){
        if(shape.getVolume() <= this.volume_box){
            this.volume_box -= shape.getVolume();
            shapes.add(shape);
            return true;
        }
        else return false;
    }

    @Override
    public double getVolume() {
        return this.volume_box;
    }

    public ArrayList<Shape> getShapes(){
        return this.shapes;
    }
}
