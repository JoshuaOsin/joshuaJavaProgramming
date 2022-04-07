package day34GarbageCollectorAccessModifier;

public class ConstructorVsStaticBlock {

    static {
        System.out.println("Static Block"); // use for static variable
    }

    public ConstructorVsStaticBlock() { // use for instance variable
        System.out.println("Constuctor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        new ConstructorVsStaticBlock();
        new ConstructorVsStaticBlock();
        new ConstructorVsStaticBlock();
        new ConstructorVsStaticBlock();
        new ConstructorVsStaticBlock();

    }
}
