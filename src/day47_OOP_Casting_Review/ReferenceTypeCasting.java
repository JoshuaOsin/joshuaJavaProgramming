package day47_OOP_Casting_Review;

import day37_OOP_SuperKeyword.animaltask.Animal;
import day37_OOP_SuperKeyword.animaltask.Dog;
import day45_Abstraction_Interface_Cont.shape.Circle;
import day45_Abstraction_Interface_Cont.shape.Shape;
import day45_Abstraction_Interface_Cont.shape.Square;

public class ReferenceTypeCasting {

    public static void main(String[] args) {
        
        Shape shape1 = new Circle(5); // upcasting allow us to smaller to larger


        Animal animal = new Dog("Alex", "Husky", 'M',1,"Small","White");

        Dog dog = (Dog) animal;
        
        dog.bark();  // if we are going to use we can create new variable
        
        ((Dog) animal).bark(); // without creating variable we can use method


        Shape shape2 = new Square(4);

        System.out.println(((Square) shape2).getSide());
    }
}
