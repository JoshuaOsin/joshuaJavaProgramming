package day38_OOP_Override.carTask;

public class BMW extends Car{

    public BMW( String model, int year, double price, String color, long miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(brand +" "+ model + " is breaks down");
    }

    public void racing(){
        System.out.println(brand +" "+ model + " is racing");
    }

    public void start() {
        System.out.println("It is required to push the key to start "+ brand+" "+ model);
    }
}
