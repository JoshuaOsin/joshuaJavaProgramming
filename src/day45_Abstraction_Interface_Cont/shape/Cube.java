package day45_Abstraction_Interface_Cont.shape;

public class Cube extends Shape implements Volume{

    private double side;

    public Cube( double side) {
        super("Cube");
        setSide( side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0) {
            throw new RuntimeException("Invalid entry");
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side*6;
    }

    @Override
    public double perimeter() {
        return 12*side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                super.toString()+
                "volume=" + volume() +
                '}';
    }
}
