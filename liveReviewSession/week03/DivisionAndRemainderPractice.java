package week03;

import java.util.Scanner;

public class DivisionAndRemainderPractice {

    public static void main(String[] args) {

        //input is some amount of seconds
        // turn into hours:minutes:seconds

        // Create scanner object
        Scanner input = new Scanner(System.in);



        // request use input about second
        //System.out.print("How many seconds :");

        // get user input
        //inputSeconds = input.next();

        int hours, minutes, seconds,inputSeconds=3662 ; // declared variables
        hours   = inputSeconds/3600;        // find hours
        minutes = (inputSeconds%3600)/60;   // find minutes from remained seconds / 60
        seconds = inputSeconds%60;          // find seconds

        // assign to clock String and print the result
        String clock = "Hours : "+hours+ " Minutes : "+ minutes+" Seconds : "+ seconds;
        System.out.println("clock = " + clock);






    }



}
