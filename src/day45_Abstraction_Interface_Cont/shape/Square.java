package day45_Abstraction_Interface_Cont.shape;

public class Square extends Shape{

    private double side;

    public Square( double side) {
        super("Square");
        setSide( side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <=0 ) {
            throw new RuntimeException("Invalid entry");
        }
        this.side = side;
    }


    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                super.toString()+
                '}';
    }
}
