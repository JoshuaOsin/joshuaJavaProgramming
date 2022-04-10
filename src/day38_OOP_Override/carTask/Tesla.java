package day38_OOP_Override.carTask;

public class Tesla extends Car{

    public Tesla(String brand, String model, int year, double price, String color, long miles) {
        super(brand, model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand +" "+ model + " has autopilot");
    }
}
