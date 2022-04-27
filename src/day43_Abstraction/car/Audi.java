package day43_Abstraction.car;

public final class Audi extends Car{
    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    public Audi( String model, int year) {
        super("Audi", model, year);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");
    }
    public void autoPark(){
        System.out.println(getModel() + " has auto park feature");
    }
}
