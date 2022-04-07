package day24_CustomMethodReturn;

public class ReturnPractice2 {

    public static void main(String[] args) {

        //Creat function that calculate grade
        String str = grade(99);

        //Check grade and display
        if (str.equals("A")) {
            System.out.println("Excelent");
        } else if (str.equals("B")) {
            System.out.println("Great");
        } else if (str.equals("C")) {
            System.out.println("Good");
        } else if (str.equals("D")) {
            System.out.println("Passed");
        } else {
            System.out.println("Try Again");
        }

    }

    //Creat function that calculate grade
    public static String grade(int score) {
        String result = "";
        if (score < 0 || score > 100) {
            result = "invalid";
        } else {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        }
        return result;
    }

}
