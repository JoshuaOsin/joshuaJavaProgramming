package day18_NestedLoop;

public class NestedLopIntro {
    public static void main(String[] args) {
// Method 1 Nested Loop
for (int i = 1; i <= 10; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println("");
}
// Method 2 For loop with String
String output = "";
for (int i = 1; i <=10 ; i++) {
    output += "* " ;
    System.out.println(output);
}
// Method 3 For loop with String repeat() method
output = "* " ;
for (int i = 1; i <=10 ; i++) {
    System.out.println(output.repeat(i));
}
    }
}
