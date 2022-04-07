package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls() {
        System.out.println("Welcome Group 32 Software Company");
    }

    public ConstructorCalls(int num) {
        this(); // should be first
        System.out.println("Constructor with parameter "+ num);
    }

    public ConstructorCalls(String str, int num) {
        this(num); // should be first
        // this();  // should be only one constroctor
        System.out.println("Constructor with parameter "+ str);
    }


}
