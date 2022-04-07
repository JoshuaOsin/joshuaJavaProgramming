package day35_OOP_Encapsulation.encapsulation;

public class Person {

    private String name;
    private int age;


    // Getter for name
    public String getName() {
        return name;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // setter for age
    public void setAge(int age) {
        if (age <=0 || age >=150) {
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
