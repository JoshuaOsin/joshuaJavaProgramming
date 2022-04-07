package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your score : ");

        int score = scan.nextInt();

        if ( score > 0 && score <= 100 ){
            if (score > 90){
                System.out.println("Grade = A");
            } else if (score > 80){
                System.out.println("Grade = B");
            } else if (score > 70){
                System.out.println("Grade = C");
            } else if (score > 60){
                System.out.println("Grade = D");
            } else {
                System.out.println("Grade = F");
            }
        } else{
            System.out.println("Invalid entry");
        }
    }
}
