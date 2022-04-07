package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please give your hourly rate : ");
        int hourlyRate = scan.nextInt();

        System.out.print("\nPlease give your weekly Hours : ");
        int weeklyHours = scan.nextInt();

        System.out.print("\nPlease give your state Tax Rate : ");
        double stateTaxRate = scan.nextInt();

        System.out.print("\nPlease give your federal Tax Rate : ");
        double federalTaxRate = scan.nextInt();

        //--------------------------------------

        int salaryBeforeTax = hourlyRate * weeklyHours * 52; // salary is equal to one week' salary * 52
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        //-----------------------------------------
        System.out.println("Gross pay is: $" + salaryBeforeTax  );
        System.out.println("State tax = $" + stateTax);
        System.out.println("Federal tax = $" + federalTax );
        System.out.println("Total tax = $" +totalTax );
        System.out.println("Net income = $"+salaryAfterTax);
    }
}
