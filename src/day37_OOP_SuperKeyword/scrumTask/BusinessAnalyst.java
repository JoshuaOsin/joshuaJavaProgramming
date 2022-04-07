package day37_OOP_SuperKeyword.scrumTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int id,  double salary) {
        super(name, age, gender, id, "Business Analyst", salary);
    }

    public void analyze(){
        System.out.println(name + "is analyzing the documents");
    }
}
