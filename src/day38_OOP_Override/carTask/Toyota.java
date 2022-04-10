package day38_OOP_Override.carTask;

public class Toyota extends Car{

    public Toyota(String brand, String model, int year, double price, String color, long miles) {
        super(brand, model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand +" "+ model + " is reliable");
    }


}
