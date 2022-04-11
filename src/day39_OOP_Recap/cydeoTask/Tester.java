package day39_OOP_Recap.cydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }

    public void createTicket() {
        System.out.println(getJobTitle() + " " + getName() + " is creating ticket");
    }


}
