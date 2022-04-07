package week03;

public class UnaryReview {

    public static void main(String[] args) {
       int a = 20;

        System.out.println("a++ = "+a++);   // 20
        System.out.println("a = " + a);     //21


        int b = 20;
        System.out.println("b++ = "+ ++b);   // 21

        int c = 20;
        System.out.println(++c + 1);   // 22

        boolean isMarried = false;
        System.out.println("isMarried = " + !isMarried); // not operator

        int x =12;
        if (++x>12){ // pre-increment
            System.out.println("x in the IF satatement part : "+x);
            } else {
            System.out.println("x in the ELSE satatement part : "+x);
        }
        int y =12;
        if (y++>12){ // post increment
            System.out.println("y in the IF satatement part : "+x);
            } else {
            System.out.println("y in the ELSE satatement part : "+x);
        }



    }



}
