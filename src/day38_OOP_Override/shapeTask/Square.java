package day38_OOP_Override.shapeTask;

public class Square extends Shape{

    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if(size <= 0){
            System.err.println("Invalid size: "+size);
            System.exit(1);
        }
        this.size = size;
    }

    public Square(double size) {
        super("Square");
        this.size=size;
    }

    @Override
    public double area() {
        return size*size;
    }

    @Override
    public double perimeter() {
        return 4*size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size='" + size + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
