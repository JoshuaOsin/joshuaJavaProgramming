package day21_ArrayUtilityForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];
        double count =0;
        for (int number : numbers) {
            if (number > max ) {
            max = number;
            count += number;
            }
        }

        System.out.println(max);
        System.out.println("Average = " + count/numbers.length);
    }
}
