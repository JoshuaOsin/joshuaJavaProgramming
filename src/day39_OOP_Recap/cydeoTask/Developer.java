package day39_OOP_Recap.cydeoTask;

public class Developer extends Employee{

    //private String depertment;

    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName() +" is coding");
    }

    public void fixingBugs() {
        System.out.println(getJobTitle() + " " + getName() + " is fixing bugs");
    }
}
