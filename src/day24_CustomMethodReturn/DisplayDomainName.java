package day24_CustomMethodReturn;

public class DisplayDomainName {
    // Create a method that can display the domain of the email
    public static void displayDomainOfEmail (String email){
        int indexOfDomain = email.lastIndexOf('@');
        int indexOfDot = email.lastIndexOf('.');
        System.out.println(email.substring(indexOfDomain +1 ,indexOfDot));
    }

    public static void main(String[] args) {
        String email = "joshua@gmail.com";
        displayDomainOfEmail(email);
    }
}
