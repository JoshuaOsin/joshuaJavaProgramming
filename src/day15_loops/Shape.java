package day15_loops;

public class Shape {
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++ ) {
            System.out.println();
            for (int i2 = 1; i2 <= 6; i2++) {
                System.out.print("* ");
            }
        }
    }
}
/*
 * * * * * * //6 *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * * / 8 times
 */