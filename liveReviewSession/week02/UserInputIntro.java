package week02;

import java.util.Scanner;

public class UserInputIntro {


    public static void main(String[] args) {

        // output goes to console --- print or println
        System.out.println("Output");

        // input from console for my JAVA Class

        // 1. Create your scanner object (object name anything
        Scanner input = new Scanner(System.in); // creating an object,
                                                // we do not see anything in this step

        // 2. Prompt the user putting input

        System.out.print("Put your name : "); // printed out

        // 3. Get the input

        String name; // before getting create string to put in
        name = input.next(); // reads the data from console and assign the value to my variable

        // 4. Use the input
        System.out.println("\nname = " + name);

        // step 1 and 3 are MUST but step 2 and 4 depends on the situation



    }
}
