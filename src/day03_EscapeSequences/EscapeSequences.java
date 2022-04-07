package day03_EscapeSequences;
/*
Escape sequences : MUST be givin with double quote
\n Newline Advances the cursor to the next line for subsequent printing
\t Horizontal Tab Causes the cursor to skip over to the next tab stop
\\ Backslash Causes a backslash to be printed
\" Double quote Causes a double quotation mark to be printed
 */
public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");
        System.out.println("--------------------------");

        System.out.println("Hello Cyde \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");
        System.out.println("--------------------------");

        System.out.println("\tJava is Cool Programming Language");
        System.out.println("--------------------------");

        System.out.println("/ \\"); // in order to give one \ need \\
        System.out.println("--------------------------");

        System.out.println("My favorite TV show is \"Game of Thrones\""); // in order to have double qoute we need \"

    }



}
