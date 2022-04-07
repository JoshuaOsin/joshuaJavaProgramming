package week07;

import java.util.Scanner;

public class ShoppingList2ReplitTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.nextLine();
            price = scan.nextDouble();
            shoppingListReport += "Item" + countinue +": "+ item +" Price: " +price+",";
            count++;
            totalPrice += price;
            System.out.println("Ad one more item?");
            scan.nextLine(); //takes the enter from previous doble method
            countinue = scan.nextLine();

        } while (countinue.equalsIgnoreCase("yes"));

        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-1));
        System.out.println("Total Price = " + totalPrice);
    }
}


/*
In this assignment, you will write a program that will generate a shopping list. It's more advanced version of assignment Shopping list I.

Your program should ask use to enter items followed by its price. After adding item, ask user if he wants to add one more item. If so, repeat previous steps again. If no, print shopping list report and total price as show in examples. Your program should accept up to 10 items.

Hint: use do while loop.

Example:

output: Enter Item1 and its price:
input: Tomatoes
input: 5.5
output: Add one more item?
input: yes
output: Enter Item2 and its price:
input: Cheese
input: 3.5
output: Add one more item?
input: yes
output: Enter Item3 and its price:
input: Apples
input: 6.3
output: Add one more item?
input: no
output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
output: Total price: 15.3
 */