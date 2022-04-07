package day17_While_Do_While;

public class LoopPractices {

    public static void main(String[] args) {
        System.out.println("--- For Loop ---");

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i +" ");
        }

        System.out.println("\n--- While Loop---");
        int i = 1;
        while (i <= 10) {
            System.out.print(i +" ");
            i++;
        }
        System.out.println("\n----- Do While Loop----");
        i= 1;
        do {
            System.out.print(i +" ");
            i++;
        } while (i<=10);
    }
}
