package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please give the radius : ");
        int radius = scan.nextInt();

        double perimeter = radius *3.14*2,
                area = radius *radius*3.14/2;

        System.out.println("\nradius = " + radius);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
