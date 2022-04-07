package day06_PrimitiveTypeCasting;

public class BirthDay {

    public static void main(String[] args) {

        String name = "Joshua", month= "January";
        int birthDay =19, birthYear = 1975;

        //Joshua was born on January/19/1975.
        System.out.println(name+" was born on "+month+"/"+birthDay+"/"+birthYear+".");

        // My favorite book is "bookName" we need escape sequence \"
        String bookName ="Harry Potter";
        System.out.println("My favorite book is \""+bookName+"\"");

    }
}
/*
1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), month(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    month = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
 */