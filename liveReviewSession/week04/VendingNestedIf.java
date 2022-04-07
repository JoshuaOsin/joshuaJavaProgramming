package week04;

public class VendingNestedIf {
    public static void main(String[] args) {

        String selection = "drink",
                drinkItem = "tea",
                snackItem = "chips";

        if (selection == "drink") {
            System.out.println("drink option is selected");

            if (drinkItem == "tea") {
                System.out.println("tea is selected");
            } else {
                System.out.println("coke is selected");
            }
        } else {
            System.out.println("snack option is selected");
            if (snackItem == "chips") {
                System.out.println("chips item is selected");
            } else {
                System.out.println("candy item is selected");
            }
        }

    }
}
/*
add new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coke":
        "coke is selected"
when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
 */