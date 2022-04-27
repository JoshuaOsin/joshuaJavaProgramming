package day35_OOP_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public static double pi;

    static {
        pi = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <=0) {
            System.err.println("Invalid Entry");
            System.exit(0);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calcArea() {


        return pi*getRadius()*getRadius()/2;
    }

    public double calcPerimeter() {
        return 2*pi*getRadius();
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Area=" + calcArea() +
                "Perimeter=" + calcPerimeter() +
                '}';
    }
}
