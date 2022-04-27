package day42_ExceptionsContinue;

public class DisadvantagesofThrowsKeyword {

    public static void main(String[] args) {

        System.out.println("hello");

        // sleep(2); // method that has throw keyword called and compiler error


        System.out.println("world");

        MorningWorkOut.sleep(2);

        System.out.println("Cydeo");
    }
    // use sleep for selenuim
    public static void sleep(double seconds) throws InterruptedException {

        Thread.sleep( (long) (seconds * 1000) );
    }
}
