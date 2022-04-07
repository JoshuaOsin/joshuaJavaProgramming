package day37_OOP_SuperKeyword;

class A {
    public A(int a){
        System.out.println("A"+ a);
    }
}
class B extends A{
    public B(){
        super(9);
        System.out.println("B");
    }
}



public class ConstructorPractice {

    public static void main(String[] args) {
        B objectB = new B();
    }
}
