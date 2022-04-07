package day37_OOP_SuperKeyword.animaltask;

public class Animal {

    public String name, breed;
    public char gender;
    public int age;
    public String size , color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(this.name + " is eating");
    }

    public void drink(){
        System.out.println(this.name + " is drinking");
    }

    public void move(){
        System.out.println(this.name + " is moving");
    }

    public void sleep(){
        System.out.println(this.name + " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
