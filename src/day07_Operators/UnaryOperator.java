package day07_Operators;

public class UnaryOperator {
    public static void main(String[] args) {
        int num1 = +25;
        int num2 = -25;
        System.out.println( num1 < 0 );
        System.out.println( num2 < 0 );
        // Pre Increment Operator ++ before the variable (immediately)


        int a = 5;
        System.out.println(a++);//5

        System.out.println(a);//6

        --a;// 5
        System.out.println(a);


        // Post Increment Operator ++ after the variable
        int b = 100;
        System.out.println(b++);    // 100 (after the step change the value to 101)
        System.out.println(b);      // 101

        int c = 100;
        System.out.println(c--);
        System.out.println(c--);



    }


}
