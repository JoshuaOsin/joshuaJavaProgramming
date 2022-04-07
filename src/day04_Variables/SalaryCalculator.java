package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        // hourly rate and weekly hour

        int hourlyRate = 65;
        int weeklyHour = 45;
        int numberOfWeeks =52;
        int weeklySalary = hourlyRate*weeklyHour;

       /* System.out.print("Employee One Week Salary : $ ");
        System.out.println(weeklySalary);
        System.out.print("Employee One Year Salary : $ ");
        System.out.println(52*weeklySalary);
       */
        System.out.println("Hourly Rate = $ " + hourlyRate); //soutv for printing variable, modify inside ""
        System.out.println("Weekly Hour = " + weeklyHour);
        System.out.println("\nWeekly Salary = $ " + weeklySalary);
        System.out.println("Yearly Salary = $ " + numberOfWeeks*weeklySalary);
    }


}
