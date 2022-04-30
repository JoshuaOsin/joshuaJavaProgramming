package day44_Abstraction_Interface.animalTask;

public final class Parrot extends Animal implements Flyable, Playable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats fruits");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " fly over trees");
    }

    @Override
    public void play() {

    }
}
