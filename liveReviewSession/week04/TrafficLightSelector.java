package week04;

import java.util.Scanner;

public class TrafficLightSelector {

    public static void main(String[] args) {

        char color = 'r'; // r for red, g for green, y for yellow

        switch (color){
            case 'R': case 'r': // or logic
                System.out.println("Red Light");
                break;
            case 'Y': case 'y':
                System.out.println("Yellow Light");
                break;
            case 'g': case 'G':
                System.out.println("Green Light");
                break;
            default:
                System.out.println("Invalid Light");
        }
    }
}
