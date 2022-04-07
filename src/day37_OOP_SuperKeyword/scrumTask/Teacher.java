package day37_OOP_SuperKeyword.scrumTask;

public class Teacher extends Employee{


    public Teacher(String name, int age, char gender, int id,  double salary) {
        super(name, age, gender, id, "Teacher", salary);
    }

    public void teaching(){
        System.out.println(name + " is teaching");
    }


}
