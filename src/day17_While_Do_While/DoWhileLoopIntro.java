package day17_While_Do_While;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

        boolean a = false;

        for ( ; a ; ) {
            System.out.println("Wooden Spoon For Loop");
        }

        while (a) {
            System.out.println("Wooden Spoon While Loop");
        }

        do {
            System.out.println("Wooden Spoon Do While Loop");
        } while (a);
    }
}
/*
if (numberOfRepetition == Known) {
    USE For Loop
} else {
    if (loopBodyExecuted < Condition){
        USE Do While Loop // rarely
    } else {
        USE While Loop // mostly
    }
 */