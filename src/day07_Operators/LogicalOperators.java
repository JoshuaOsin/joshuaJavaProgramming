package day07_Operators;

public class LogicalOperators {

    public static void main(String[] args) {

      /*
      ********** Logical operators in Java *************
      Definition : Java Logical Operators work on the Boolean operand.
        It's also called Boolean logical operators.
        It operates on two Boolean values, which return Boolean values as a result.

                     	&&, ||, !

      && (AND): both  expressions need to be TRUE in order to return true

      || (OR) : either (only one) expression needs to be TRUE in order to return true

      ! (NOT) : opposite of expression True -> False , False -> True

       */
        boolean bool1 = true,
                bool2 = false; // also be written bool2 = !bool1

        //Logical AND
        System.out.println("bool1 && bool2 = " + (bool1 && bool2));

        //Logical OR
        System.out.println("bool1 || bool2 = " + (bool1 | bool2) );

        //Logical Not
        System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));

    }
}
