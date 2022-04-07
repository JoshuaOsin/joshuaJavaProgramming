package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // all <,>,>=,<= returns true or false

        boolean result1 = 200>40; // false
        System.out.println("result1 = " + result1);

        boolean result2 = 400 >= 150; // true
        System.out.println("result2 = " + result2);

        int score = 57;
        boolean hasFailed= score <= 59;
        System.out.println("hasFailed = " + hasFailed);
        System.out.println("-------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x==y; // false
        System.out.println("equal = " + equal);

        boolean results8 = "Muhtar"=="short";
        System.out.println("results8 = " + results8);

        boolean results0 = "muhtar"!="Muhtar";
        System.out.println("results0 = " + results0);



    }


}
