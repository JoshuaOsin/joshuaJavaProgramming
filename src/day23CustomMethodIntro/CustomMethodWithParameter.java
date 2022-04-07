package day23CustomMethodIntro;

public class CustomMethodWithParameter {

    public static void main(String[] args) {
        System.out.println(" Test start with number 10");
        oddOrEven(10);
        System.out.println(" Test  with number 9");
        oddOrEven(9);
        System.out.println(" Check age of person");

        ageOfPerson(1975);
        allNumbersBetweenXandY(2, 6);

    }

    // create a function that can check if a number odd or even
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    // create a function that can display age of the person
    public static void ageOfPerson(int birthYear) {
        int age = 2022 - birthYear;
        System.out.println("Your age is " + age);
    }

    // create a function that can display all the numbers between X to Y
    public static void allNumbersBetweenXandY(int x, int y) {
        if (x < y) {
            System.out.println("Here are all the numbers between " + x + " and " + y);
            for (int i = x + 1; i < y; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("first number must be smaller than second number");
        }
    }


}
