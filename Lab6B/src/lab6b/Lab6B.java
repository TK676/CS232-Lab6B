package lab6b;


public class Lab6B {
    public static void main(String[] args) {
        Circle circ = new Circle(2, 3, 5, 4.0);

        Rectangle rect = new Rectangle(5,5,5, 4.0, 10.0);

        Triangle tri = new Triangle(2,1, 3, 4.0, 8.0);

        System.out.println(circ.toString());

        System.out.println(tri.toString());

        System.out.println(rect.toString());

        System.out.printf("Area of circle: %.1f ", circ.area());
        System.out.println();
       
        System.out.printf("Area of Rectangle: %.1f ", rect.area());

        System.out.printf("\nArea of Triangle: %.1f ", tri.area());
    }
}
