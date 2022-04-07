package day20_Arrays;

public class MedianNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double avarageNum = sum/ numbers.length;

        System.out.println(avarageNum);
    }
}
