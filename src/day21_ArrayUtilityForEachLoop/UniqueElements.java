package day21_ArrayUtilityForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] names = {"Günay", "Anna", "Anna", "Zuhal", "Maria", "Sinem"};

        for (String each : names) {
            int count = 0;
            for (String element : names) {
                if (each.equals(element)) {
                    count++;
                }
            }
            if (count ==1) {
                System.out.println(each);
            }
        }
    }
}
