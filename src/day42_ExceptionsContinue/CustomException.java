package day42_ExceptionsContinue;

class FaddyException extends RuntimeException {

    public FaddyException() {
        super("It is time for break");
    }

    public FaddyException(String message) {
        super(message);
    }
} //uncheck exception

class NoBreakException extends Exception {
    public NoBreakException() {
        System.out.println("Class time");
    }
}


public class CustomException {

    public static void main(String[] args) {


        //throw   new FaddyException("It is time for lunch");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }

}
