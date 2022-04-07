package week06;

public class BasicLoopExamples {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i+=10) { // ( initilization ; condition ; iteration)
            System.out.print( i +" ");
        }
        System.out.println("------------------");

        int z = 0; //initilization
        for ( ; z <= 1000 ; ) { // only condition
            if ( z % 10 == 0) {
                System.out.println(z + " ");
            }
            z +=10; //iteration
        }
        System.out.println("-------------------");
        for (int i = 3; i < 130 ; i += 2) {
            System.out.print( i + " ");
        }
        System.out.println("-------------------");
        int countOfEven = 0;
        for (int i = 5; i <= 50 ; i += 2) {
            countOfEven ++ ;
        }
        System.out.println("countOfEven = " + countOfEven);

        System.out.println("---------");
        int x = 1;
        for (; x <=10 ; x++) {
            System.out.println( "12 x " + x + " = "+ 12*x );
        }


    }
}
/*
 * Question-1:

 Write a for loop that displays the following set of numbers:

 0,10,20,30,40,50,...1000


 */