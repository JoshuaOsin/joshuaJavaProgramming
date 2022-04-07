package day21_ArrayUtilityForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }

        for (int each : numbers ) {
            System.out.print(each+ "  ");
        }

    }
}
