package day24_CustomMethodReturn;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        int max = maxNumber(10,20);
        System.out.println(max);

        // multiply by 2

        int multiplication = max * 2;
        System.out.println("multiplication = " + multiplication);
    }

    // create method to fing max number between two number
    public static int maxNumber(int firstNumber, int secondNumber) {
        int result = (firstNumber>secondNumber)? firstNumber:secondNumber;
        return result;
    }


}
