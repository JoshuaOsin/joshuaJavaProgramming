package day44_Abstraction_Interface.animalTask;

public final class Eagle extends Animal implements Flyable, WildAnimal{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats fish");
    }

    @Override
    public void fly() {
        System.out.println(getName()+ " fly high");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+ " hunts in the sky");
    }
}
