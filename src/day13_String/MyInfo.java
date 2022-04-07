package day13_String;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Enter your age");
        int age = scan.nextInt();

        System.out.println("2. Enter your gender");
        String gender = scan.next();

        System.out.println("3. Enter your full name");
        scan.nextLine(); // Clear the scan.next()
        String fullName = scan.nextLine();

        System.out.println("4. Enter your phone number");
        long    phoneNumber = scan.nextLong();

        System.out.println("5. Enter your zip code");
        int zipCode = scan.nextInt();

        System.out.println("6. Enter your School name");
        scan.nextLine(); //Clear the scan.nextInt()
        String schoolName = scan.nextLine();

        System.out.println("7. Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("8. Enter your state name");
        String stateName = scan.next();

        System.out.println("9. Enter your building number");
        int buildingNumber = scan.nextInt();

        System.out.println("Enter your Street name");
        scan.nextLine();
        String  streetName = scan.nextLine();

        System.out.println("1. Full name: " +  fullName);
        System.out.println("2. Age: "+ age);
        System.out.println("3. Gender: "+gender);
        System.out.println("4. Phone Number :"+ phoneNumber);
        System.out.println("5. Address:\n\t"
                + buildingNumber + " " + stateName + "\n\t"
                + cityName + ", " + stateName+ " " + zipCode );
        System.out.println("6. School Name: "+ schoolName);
    }
}
/*
Write a program that can ask the
user to:
1. Enter your age (int)
2. Enter your gender (String- One word ONLY)
3. Enter your full name (String- Multiple
words)
4. Enter your phone number (long)
5. Enter your zip code (int)
6. Enter your School name (String- Can be
Multiple words)
7. Enter your city name (String- Can be
Multiple words)
8. Enter your state name (String- One word
ONLY)
9. Enter your building number (int)
10. Enter your Street name
MAKE SURE USER CAN ENTER ALL THE INPUT
Display all the inputs that user entered in following
order in sperate lines:
1. full name
2. age
3. gender
4. phone number
5. address:
buildingNumber
Street
City, State
ZipCode
6. school name
 */