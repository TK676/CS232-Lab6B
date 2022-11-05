package lab6b;

public class Circle extends Shape {
    private double radius;
 

    public Circle() {
        super(0, 0, 0);
        this.radius = 0.0;
    }
 

    public Circle(int x, int y, int z, double r) {
        super(x, y, z);
        this.radius = r;
    }
 

    public double getRadius() {
        return this.radius;
    }
 
    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
 
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")" + ": " + "(" + this.area() + ")";
    }
}
