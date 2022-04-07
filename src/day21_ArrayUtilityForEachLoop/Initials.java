package day21_ArrayUtilityForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] words = { "Java Programming", "Cydeo School", "Cydeo Company"};

        for (String each : words) {
            String initial = each.charAt(0) + "." + each.charAt( each.indexOf(" ") + 1 );
            System.out.println(initial);
        }


    }
}
