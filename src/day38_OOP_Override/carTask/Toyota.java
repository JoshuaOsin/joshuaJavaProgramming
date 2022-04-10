package day38_OOP_Override.carTask;

public class Toyota extends Car{

    public Toyota( String model, int year, double price, String color, long miles) {
        super("Totoya", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand +" "+ model + " is reliable");
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition to start "+ brand+" "+model);
    }
}
