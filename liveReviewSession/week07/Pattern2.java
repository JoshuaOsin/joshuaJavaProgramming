package week07;

public class Pattern2 {
    public static void main(String[] args) {

        int count = 5;
        for (int i = 1; i <= count ; i++) { // handle row
            for (int j = 1; j <= i; j++) {  // handle column
                if (j % 2 == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1+ " ");
                }
            }
            System.out.println();
        }
    }
}
