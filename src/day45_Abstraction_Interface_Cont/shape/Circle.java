package day45_Abstraction_Interface_Cont.shape;

public class Circle extends Shape{
    private double radius;

    public final static double pi;

    static {
        pi = 3.14;
    }

    public Circle( double radius) {
        super("Circle");
        setRadius( radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Invalid radius");
        }
        this.radius = radius;
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
                "radius=" + radius +
                super.toString()+
                '}';
    }
}
