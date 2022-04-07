package day09_IfStatements;

import java.util.Scanner;

public class PosNegZero {

    public static void main(String[] args) {
        // Create scanner object
        Scanner inputInteger = new Scanner(System.in);
        // request user input
        System.out.print("Please give number :");
        // create int variable, read user input and assign the int
        int requestedNumber = Integer.parseInt(inputInteger.next());

        // use the input

        if (requestedNumber>0){
            System.out.println(requestedNumber+" is positive");
        } else if (requestedNumber<0){
            System.out.println(requestedNumber+" is negative");
        } else {
            System.out.println(requestedNumber+" is zero");
        }



    }



}
