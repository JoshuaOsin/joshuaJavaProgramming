package day45_Abstraction_Interface_Cont;

public interface PropertiesOfInterface {
    int a = 100;  // static & final by default
    static int b = 200; // final by default

    /*
    public PropertiesOfInterface(int a){
        this.a =a;
    }
    */

    /*
    static{
        b = 100;
    }
    */

    /*
    public void method1(){
        System.out.println("Instance method");
    }
     */

    static void method2(){  // most of the time no need for project
        System.out.println("Static method");
    }

    void method3(); // purpose of creating Interface by default it is abstract

    default void method4(){ // in special case might be needed
        System.out.println("Default method");
    }

}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4(); // default method need object
        new Test().method3(); // abstract method need object

        PropertiesOfInterface.method2(); // static method can be called by Interface name

    }

}
