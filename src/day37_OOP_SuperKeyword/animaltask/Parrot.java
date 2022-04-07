package day37_OOP_SuperKeyword.animaltask;

public class Parrot extends Animal{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void sing(){
        System.out.println(name +" is singing");
    }
}
