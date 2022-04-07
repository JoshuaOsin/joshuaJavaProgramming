package day32_Constructor;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Joshua");
        Employee employee2 = new Employee("Iroda", 'F');
        Employee employee3 = new Employee("Dijar", 'M',"Developer");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}
