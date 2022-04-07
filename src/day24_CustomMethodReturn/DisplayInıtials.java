package day24_CustomMethodReturn;

public class DisplayInıtials {
    //Create a method that can display the initials of the person
    public static void displayInitialOfPerson (String firstName, String lastName){
        System.out.println(firstName.charAt(0) + "." +lastName.charAt(0));
    }

    public static void main(String[] args) {
        String firstName = "Joshua";
        String lastName = "Osin";
        displayInitialOfPerson(firstName,lastName);
    }

}
