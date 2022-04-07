package day15_loops;

public class ForLoopPractice {

    public static void main(String[] args) {

        //15 45
        for (int i = 15; i <=45; i++ ) {
            System.out.print(i+" ");
        }
        System.out.println("--------------------");

        for (int i = 100; i>=50 ; i--) { // i:
            System.out.print(i +" ");
        }
        System.out.println("--------------------");

        for (int i = 1 ; i <= 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }

    }
}
