package day36_OOP_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setInfo ("Max", "husky", 'M',3,"Big","Black");
        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.move();
        dog1.bark();


        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        // cat.bark();
        //  cat.hunt();
        cat.scratch();
        System.out.println(cat);


        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "Orange");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        System.out.println(tiger);


    }




}
