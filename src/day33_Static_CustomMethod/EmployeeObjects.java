package day33_Static_CustomMethod;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name= "Joshua";

        Employee employee2 = new Employee();
        employee2.name= "Iroda";

        Employee employee3 = new Employee();
        employee3.name= "Dijar";

        System.out.println(employee1.name);
        System.out.println(employee2.name);
        System.out.println(employee3.name);

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);


    }



}
