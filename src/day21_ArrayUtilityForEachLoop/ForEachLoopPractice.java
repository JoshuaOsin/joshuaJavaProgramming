package day21_ArrayUtilityForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        String[] words = { "Java Programming", "Cydeo School", "Cydeo Company"};

        for (String each:words) {
            System.out.println(""+ each.charAt(0)+each.charAt(each.length()-1));
        }
    }
}
