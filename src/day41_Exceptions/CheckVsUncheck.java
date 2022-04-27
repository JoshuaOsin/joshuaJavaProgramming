package day41_Exceptions;

import java.io.FileInputStream;

public class CheckVsUncheck {

    // check when compile, uncheck when runtime
    public static void main(String[] args) {

        // uncheck exception
        int a = 10;
        int b = 0;



        System.out.println( a/b); // runtime error
        System.out.println("Wooden Spoon");

        // check exception
        System.out.println("hello");

        // Thread.sleep(3000); // compile error, needs to be handled immediately

        System.out.println("Cydeo");

        // FileInputStream file = new FileInputStream("path of the file"); // compile error



    }



}
