package day38_OOP_Override.shapeTask;

public class Circle extends Shape{

    double radius;
    static double  pi;


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
        return "Shape{" +
                "name='" + name + '\'' +
                "pi='" + pi + '\'' +
                "radius='" + radius + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
