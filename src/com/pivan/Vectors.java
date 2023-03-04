package com.pivan;

public class Vectors {

    private final double x, y, z;
    public Vectors(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
    }

    public double scalar(Vectors vector){
        return (this.x * vector.x) + (this.y * vector.y) + (this.z * vector.z);
    }

    public Vectors vectorProduct(Vectors vector){
        return new Vectors(
                this.y * vector.z - this.z * vector.y,
                this.z * vector.x - this.x * vector.z,
                this.x * vector.y - this.y * vector.x
        );
    }

    public double angleCosine(Vectors vector){
        return scalar(vector) / (length() + vector.length());
    }

    public Vectors sum(Vectors vector){
        return new Vectors(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }

    public Vectors minus(Vectors vector){
        return new Vectors(this.x - vector.x, this.y - vector.y, this.z - vector.z);
    }

    public static Vectors[] generate(int n){
        Vectors[] vectors = new Vectors[n];
        for(int i = 0; i < n; i++){
            vectors[i] = new Vectors(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x: " + x +
                ", y: " + y +
                ", z: " + z + "}";
    }
}
