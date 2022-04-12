package day40_ProtectedModifier_FinalKeyword;

public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }
/*
   @Override
   public void drink() { // final method cannot be overriden
        System.out.println(getName() +" is drinking lemonade");
    }
 */

    public void bark(){
        System.out.println(getName()+ " is barking");
    }

}

