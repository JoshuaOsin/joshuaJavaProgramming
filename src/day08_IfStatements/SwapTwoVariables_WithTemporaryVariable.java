package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {
        int a = 47;
        int b = 39;
        System.out.println("before swapping");
        System.out.println("a = " + a); // 47
        System.out.println("b = " + b); // 39
//-----------------------------------
        int c = b; // c= 15;

        b = a; //b= 10
        a = c;
//--------------------------------------
        System.out.println("After swapping");
        System.out.println("a = " + a); // 39
        System.out.println("b = " + b); // 47

    }


}

/*
1. write a program that can swipe two variables' value by using a temporary variable
		    Ex:
		        if a= 10, b=15
		    output:
		        a = 15
		        b = 10
 */
