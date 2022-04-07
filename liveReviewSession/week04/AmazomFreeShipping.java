package week04;

import java.util.Scanner;

public class AmazomFreeShipping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Ask user
        System.out.println("Put the price :");

        // User input
        double totalPrice = scan.nextDouble();

        if (totalPrice >= 25) {
            System.out.println("FREE SHIPPING ELIGIBLE. " +
                    "Your order total : $" + totalPrice);
        } else {
            System.out.println("NOT ELIGIBLEFOR FREE SHIPPING. " +
                    "Your order total : $" + totalPrice);
        }
    }
}
