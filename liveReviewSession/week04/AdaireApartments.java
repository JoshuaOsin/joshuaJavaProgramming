package week04;

import java.util.Scanner;

public class AdaireApartments {
    public static void main(String[] args) {

        // welcome message
        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        System.out.println("How many rooms ar you looking for?");

        // creat scanner
        Scanner scan = new Scanner ( System.in );
        //get user input
        int numberOfBedrooms = scan.nextInt();
        double startingPrice = 0;

        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println(numberOfBedrooms + " bedroom currently unavailable");
        }
        System.out.println("Starting price $" + startingPrice);
    }
}
/*
#### WELCOME TO ADAIRE APARTMENTS ####

numberOfBedrooms = 0, 1, 2

startingPrice = 0;

when numberOfBedrooms 0:
print: "Studio apartment selected"
startingPrice -> 1454

when numberOfBedrooms 1:
print: "One bedroom apartment selected"
startingPrice -> 1725

when numberOfBedrooms 2:
print: "Two bedroom apartment selected"
startingPrice -> 2899

default:
print "5 bedroom currently unavailable"

------
"Starting price $1454"
 */