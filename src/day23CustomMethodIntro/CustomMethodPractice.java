package day23CustomMethodIntro;

public class CustomMethodPractice {

    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("-----------------------");
        helloCydeo5Times();
        System.out.println("-----------------------");
        evenNumbers1To10();
    }

    // create function that print "Hello World" five times
    public static void helloWorld5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World");
        }
    }
    // create function that print "Hello Cydeo" five times
    public static void helloCydeo5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello Cydeo");
        }
    }
    // create function that print even numbers 1-10
    public  static void evenNumbers1To10(){
        for (int i = 2; i <11 ; i+=2) {
            System.out.print(i + " ");
        }
    }
}
