package week02;

public class EmployeeInfo {

    public static void main(String[] args) {
        /*
        name
        companyName
        jobTitle
        gender
        salary
        emplyeeID
        hasBenefits(Y/N)
        isMarried
         */

        String name = " Joshua",
                companyName = "CYDEO",
                jobTitle = "Assistant Manager";

        double salary = 100;
        int employeeID = 12345;
        char gender = 'M',
                isMarried = 'Y';

        boolean hasBenefits = true;

        System.out.println("name = " + name);
        System.out.println("companyName = " + companyName +"\tJob Title: "+ jobTitle
                + "\tEmployee ID. "+ employeeID+"\tSalary: "+salary);
        System.out.println("gender = " + gender+"\tMarried : "+isMarried+"\tBenefits : "+hasBenefits)
        ;

    }

}
