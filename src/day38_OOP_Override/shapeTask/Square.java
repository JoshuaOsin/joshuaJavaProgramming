package day38_OOP_Override.shapeTask;

public class Square extends Shape{

    double length;

    public Square(double length) {
        super("Square");
        this.length=length;
    }

    @Override
    public double area() {
        return length*length;
    }

    @Override
    public double perimeter() {
        return 4*length;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "length='" + length + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
