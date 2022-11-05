package lab6b;


public class Rectangle extends Shape {
    private double length;
    private double width;
 

    public Rectangle() {
        super(0, 0, 0);
        this.length = 0.0;
        this.width = 0.0;
    }
 

    public Rectangle(int x, int y, int z, double l, double w) {
        super(x, y, z);
        this.length = l;
        this.width = w;
    }
 

    public double getLength() {
        return this.length;
    }
 
    public double getWidth() {
        return this.width;
    }
 
    @Override
    public double area() {
        return this.length * this.width;
    }
 

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")" + ": " + "[" + this.area() + "]";
    }
}