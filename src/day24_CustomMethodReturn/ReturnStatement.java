package day24_CustomMethodReturn;

public class ReturnStatement {
    public static void main(String[] args) {
        displayNameOfDayGivenNumber(3);
    }

    public static void displayNameOfDayGivenNumber(int numberOfDay) {

        if (!(numberOfDay >= 1 && numberOfDay <= 7)) {
            System.out.println("Invalid Entry");
            return; // exits displayNameOfDayGivenNumber method
        }
        switch (numberOfDay) { //1,2,3,4,5,6,7

            case 1:
                System.out.println("Monday");
                break; // exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: // only gets executed if none of case is matching
                System.out.println("Invalid Entry");
        }

    }
}
