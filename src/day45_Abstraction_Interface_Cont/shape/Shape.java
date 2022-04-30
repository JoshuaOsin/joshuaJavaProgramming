package day45_Abstraction_Interface_Cont.shape;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public Shape() {
        name = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'';

    }
}
