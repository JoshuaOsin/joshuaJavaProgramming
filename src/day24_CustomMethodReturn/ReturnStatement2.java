package day24_CustomMethodReturn;

public class ReturnStatement2 {

    public static void main(String[] args) {
        displayNameOfMonthGivenNumber(12);
    }

    public static void displayNameOfMonthGivenNumber (int numberOfMonth){
        String month = "" ; // initialize string with given empty ""
        if (numberOfMonth < 1 || numberOfMonth >12) {
            System.out.println("Invalid");
            return;
        }

        switch (numberOfMonth){ // 1,2,3,4,5,6,7,8,9,10,11,12
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month ="Invalid Entry";
        }
        System.out.println(month);
    }

}
