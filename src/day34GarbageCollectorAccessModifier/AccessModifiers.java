package day34GarbageCollectorAccessModifier;

public class AccessModifiers {

    public static int publicData = 100;

    static int defaultData = 200;

    private static  int privateData = 300;

    public static void publicMethod() {
        System.out.println("Public");
    }

    static void defaultMethod(){
        System.out.println("Default");
    }

    private static void privateMethod() {
        System.out.println("Private");
    }


    public static void main(String[] args) {
        System.out.println("publicData = " + publicData);
        System.out.println("defaultData = " + defaultData);
        System.out.println("privateData = " + privateData);

        publicMethod();
        defaultMethod();
        privateMethod();
    }


}
