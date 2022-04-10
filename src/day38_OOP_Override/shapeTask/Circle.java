package day38_OOP_Override.shapeTask;

public class Circle extends Shape{

    private double radius;
    public static double  pi;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            System.err.println("Invalid Radius: "+radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle");
        this.radius= radius;
    }

    static {
        pi = 3.14;
    }

    @Override
    public double area() {
        return pi*radius*radius/2;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi='" + pi + '\'' +
                "radius='" + radius + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
