package day45_Abstraction_Interface_Cont.shape;

public class Cylinder extends Circle implements Volume{

    private double height;

    public Cylinder(double radius) {
        super(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <=0) {
            throw new RuntimeException("Invalid height");
        }
        this.height = height;
    }

    @Override
    public double area() {
        return perimeter()*(getRadius()+getHeight());
    }

    @Override
    public double perimeter() {
        return 2*pi*getRadius();
    }

    @Override
    public double volume() {
        return pi*getRadius()*getRadius()*getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "perimeter=" + perimeter() +
                "height=" + area() +
                "height=" + volume() +
                '}';
    }
}
