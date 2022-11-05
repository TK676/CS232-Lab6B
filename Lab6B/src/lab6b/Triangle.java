package lab6b;


public class Triangle extends Shape {

    private double base;
    private double height;
 

    public Triangle() {
        super(0, 0, 0);
        this.base = 0.0;
        this.height = 0.0;
    }
 

    public Triangle(int x, int y, int z, double b, double h) {
        super(x, y, z);
        this.base = b;
        this.height = h;
    }
 

    public double getBase() {
        return this.base;
    }
 
    public double getHeight() {
        return this.height;
    }
 
    @Override
    public double area() {
        return (this.base * this.height) / 2;
    }
 

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")" + ": " + "/" + this.area() + "\\";
    }
}