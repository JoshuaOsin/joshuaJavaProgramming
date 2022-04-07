package day31CustomClassConstuctor;

public class Student {

    public String name;
    public char gender;
    public int age;
    public char grade;
    public int id;

    public Student(String name, char gender, int age, char grade, int id) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
        this.id = id;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }


}
