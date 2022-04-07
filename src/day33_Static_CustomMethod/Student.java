package day33_Static_CustomMethod;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int id;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int id) {
        this(name, gender, age);
        this.id = id;
    }

    public Student(String name, char gender, int age, int id, char grade) {
        this(name, gender, age, id);
        this.grade = grade;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name, int age, char grade) {
        this(name, age);
        this.grade = grade;
    }

}
