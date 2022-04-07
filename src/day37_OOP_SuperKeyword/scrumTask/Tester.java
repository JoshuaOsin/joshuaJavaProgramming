package day37_OOP_SuperKeyword.scrumTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender,  String jobTitle, int id, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void creatingTicket(){
        System.out.println(name + " is creating ticket");
    }

}
