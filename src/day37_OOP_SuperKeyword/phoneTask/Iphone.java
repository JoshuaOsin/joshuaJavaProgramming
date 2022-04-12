package day37_OOP_SuperKeyword.phoneTask;

public final class Iphone extends Phone{

    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    @Override
    public void call(long phoneNumber) {
        super.call(phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        super.text(phoneNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public void faceTime(long phoneNumber) {
        System.out.println("Apple "+model+ "is having facetime with "+phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println("Apple "+model+ "is calling "+email);
    }
}
