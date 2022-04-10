package day38_OOP_Override.shapeTask;

public class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle(double length ,double width) {
        super("Rectangle");
        this.length= length;
        this.width =width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "length='" + length + '\'' +
                "width='" + width + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
