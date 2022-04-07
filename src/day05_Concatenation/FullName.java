package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Joshua";
        String lastName = "Osin";
        int age =47;
        String jobTitle = "Executive Assistant";
        String companyName = "CYDEO";
        double salary = 1000000.58;
        String fullName = firstName+ " "+ lastName;

        // Full name of a person is -----
        System.out.println("Full name of a person is "+fullName);
        System.out.println("Full name : "+lastName+", "+firstName);

        // ___ is ___ years old.
        System.out.println(fullName+" is "+age+" years old.");

        // fullName is jobTitle, works at companyName, and fullName' salary is salary
        System.out.println(fullName+" is "+jobTitle+", works at "+companyName
                +", and "+ fullName +"'s salary is $"+ salary);

    }

}
