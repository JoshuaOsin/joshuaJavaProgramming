package week03;

public class LogicalOperators {

    public static void main(String[] args) {

        // & And Operator && Bitwise And Operator
        int i1 = 5;
        int i2 = 10;
        //first condition is false no need to check second part
        System.out.println(i2<i1 && ++i1<i2);   //true
        System.out.println("i1 = " + i1);    // we will get 5

        //first condition is true then our code need to check second part
        System.out.println(i2>i1 && ++i1>i2); //true
        System.out.println("i1 = " + i1);    // we will get 6
//----------------------------------------------------------

        // | And Operator || Bitwise And Operator

        i1= 5;
        System.out.println("true|false  "+(true|false));    //true
        System.out.println("true||false  "+(true||false));  // but does not check the second part of the statement
        System.out.println(i2>i1|i1>i2);   //true

        //first condition is true no need to check second part
        System.out.println(i2>i1||++i1>i2); //true
        System.out.println("i1 = " + i1);    // we will get 5

        //first condition is false so our code need to check second part
        System.out.println(i2<i1||++i1<i2);   //true
        System.out.println("i1 = " + i1);    // we will get 6



    }


}
