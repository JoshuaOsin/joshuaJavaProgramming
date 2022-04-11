package day39_OOP_Recap.cydeoTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName() +" is teaching");
    }
}
