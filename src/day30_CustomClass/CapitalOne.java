package day30_CustomClass;

public class CapitalOne {


    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("Joshua", 'M', 47, 101, "Scrum Master", true, 50000);
        employee2.setInfo("Dijar", 'M', 33, 102, "Scrum Master", false, 51000);
        employee3.setInfo("Hajira", 'F', 47, 103, "Scrum Master", true, 53000);
        employee4.setInfo("Iroda", 'F', 37, 104, "Scrum Master", true, 54000);
        employee5.setInfo("Ugur", 'M', 32, 105, "Scrum Master", true, 52000);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};


        int countFulltime = 0;
        int countParttime = 0;

        double minSalary = employees[0].salary;
        double maxSalary = employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime) {
                countFulltime++;
            } else {
                countParttime++;
            }
            if (employee.salary > maxSalary) {
                maxSalary = employee.salary;
            }
            if (employee.salary < minSalary) {
                minSalary = employee.salary;
            }
        }

        System.out.println("countFulltime = " + countFulltime);
        System.out.println("countParttime = " + countParttime);
        System.out.println("minSalary = " + minSalary);
        System.out.println("maxSalary = " + maxSalary);


    }

}