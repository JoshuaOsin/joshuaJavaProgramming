package day37_OOP_SuperKeyword.scrumTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int id,  double salary) {
        super(name, age, gender, id, "Product Owner", salary);
    }

    // no toString Method since same as Employee.toString()

}
