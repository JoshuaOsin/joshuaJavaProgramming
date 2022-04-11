package day39_OOP_Recap.cydeoTask;

public class Person {

    private String  name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age >130) {
            System.err.println("Invalid age (0-130) : "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (!(gender =='M' || gender =='F')) {
            System.err.println("Invalid gender (M/F): "+gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
