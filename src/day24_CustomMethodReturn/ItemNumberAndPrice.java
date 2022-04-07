package day24_CustomMethodReturn;

import java.util.Scanner;

public class ItemNumberAndPrice {


    public static void main(String[] args) {
        String[] items = new String[5];
        double[] prices = new double[5];
        double totalPrice = 0;

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter item name");
            items[i] = scan.next();
            System.out.println("Enter price");
            prices[i] = scan.nextDouble();
        }
        scan.close();

        for (double each : prices) {
            totalPrice += each;
        }
        System.out.println("totalPrice = " + totalPrice);

        for (int i = 0; i < 5; i++) {
            System.out.println(items[i] + "---" + prices[i]);
        }
    }
}
