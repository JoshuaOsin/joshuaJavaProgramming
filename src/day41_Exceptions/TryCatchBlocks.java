package day41_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {


        System.out.println("Test1 started");

        try{
            System.out.println(9/0);
            System.out.println("Try Block");

        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception was occurred");
        }


        System.out.println("Test1 completed");


        System.out.println("--------------------------------");



        System.out.println("Test2 started");

        int [] numbers = {1,2,3,4,5};
        try{
            System.out.println(numbers[200]);
            System.out.println("Try Block");

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        System.out.println("Test2 completed");


    }
}
