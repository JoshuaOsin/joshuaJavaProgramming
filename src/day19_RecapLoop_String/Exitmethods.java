package day19_RecapLoop_String;

public class Exitmethods {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3){
                //continue; // terminates the current iteration
                //break;    // terminates the loop
                System.exit(0);  // terminates the program
            }
            System.out.println(i);

        }
        System.out.println("Wooden Spoon");
    }
}
