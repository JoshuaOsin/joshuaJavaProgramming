package week04;

public class NestedIfExample {

    public static void main(String[] args) {

        boolean isRushHours =false;
        int carType = 2; // 1 car, 2 truck.... 6 motorcyles
        double price = 0.0;
        if (carType == 1 ){
            if (isRushHours){
                price = 30.0;
            } else {
                price = 5.0;
            }
        } else if (carType == 2){
            if (isRushHours){
                price = 55.30;
            } else {
                price = 15.99;
            }
        }

    }
}
