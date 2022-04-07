package day37_OOP_SuperKeyword.scrumTask;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, String jobTitle, int id,  double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void fixBug(){
        System.out.println(name + " is fixing bug");
    }

    public void coding(){
        System.out.println(name + " is coding");
    }


}
