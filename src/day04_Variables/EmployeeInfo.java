package day04_Variables;

public class EmployeeInfo {
    /*	    1. name (String)    2. age (int)   3. gender (char)
			4. company (String)	5. jobTitle (String)
			6. yearsOfExpereince (double)   	7. salary (int)
			8. isFullTime (boolean)		9. isMarried (boolean)
			10. employeeId (String)		11. SSN (String)
     */

    public static void main(String[] args) {
        String name = "Joshua";
        int age = 47;
        char gender = 'M';
        String company = "CYDEO";
        String jobTitle = "Assistant Manager";
        double yearsOfExperience = 0.3;
        int salary = 10;
        boolean isFullTime = false;
        boolean isMarried = true;
        String employeeId = "CYDEO1234";
        String snn = "(123)456789";

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("snn = " + snn);
    }


}
