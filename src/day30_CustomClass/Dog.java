package day30_CustomClass;

public class Dog {

    public String name;
    public String breed;
    public String size;
    public int  age;
    public char gender;
    public String color;

    public void setInfo( String dogName, String dogBreed,String dogSize, int dogAge,char dogGender, String dogColor ) {
        name = dogName;
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        gender = dogGender;
        color = dogColor;
    }
    
    public void eat(){
        System.out.println(name+ " is eating the food");
    }
    public void play(){
        System.out.println(name+ " is playing");
    }
    public void drink(){
        System.out.println(name+ " is drinking water");
    }
    public void bark(){
        System.out.println(name+ " is barking");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                '}';
    }
}
