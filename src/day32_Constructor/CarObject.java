package day32_Constructor;

public class CarObject {

    public static void main(String[] args) {

        Car audi = new Car("Audi");
        Car bmw = new Car("BMW", "525i");
        Car mercedes = new Car("Mercedes", "E200",2020);
        Car toyota = new Car("Toyota", "Corolla",2022,21000);
        Car ford = new Car("Ford", "Mustang", 2021,19000,"Red");

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(mercedes);
        System.out.println(toyota);
        System.out.println(ford);

    }
}
