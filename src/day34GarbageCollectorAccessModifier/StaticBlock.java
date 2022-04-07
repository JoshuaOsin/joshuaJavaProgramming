package day34GarbageCollectorAccessModifier;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("main method");
    }

    // first executed and only one time
    static { // used for initilization
        System.out.println("Static block");
    }
}
