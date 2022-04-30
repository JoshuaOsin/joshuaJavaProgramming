package day44_Abstraction_Interface.animalTask;

public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName()+ " barks");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats Pizza");
    }

    @Override
    public void play() {

    }
}
