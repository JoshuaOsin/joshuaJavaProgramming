package day35_OOP_Encapsulation.encapsulation;

public class CircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(20);

        System.out.println(circle1.getRadius());


        System.out.println(Circle.pi);
    }
}
