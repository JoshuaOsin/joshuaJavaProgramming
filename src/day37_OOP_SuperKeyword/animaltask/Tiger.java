package day37_OOP_SuperKeyword.animaltask;

public class Tiger extends Animal{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void roar(){
        System.out.println(name +" is roaring");
    }

    public void hunt(){
        System.out.println(name +" is hunting");
    }
}
