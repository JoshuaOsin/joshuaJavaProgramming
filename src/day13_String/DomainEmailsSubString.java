package day13_String;

public class DomainEmailsSubString {
    public static void main(String[] args) {

        String email = "Cydeo.company@gmail.com";
        System.out.println("email = " + email);
        //domain

        int beginningIndex = email.indexOf("@") +1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex,endingIndex);

        System.out.println("domain = " + domain);

        System.out.println("--------------------");
        String str1 = "Java is fun, Java is cool";

        String s1 = str1.substring(0,10+1);
        System.out.println("s1 = " + s1);

        int beg = str1.lastIndexOf("J");

        String s2 = str1.substring(beg);
        System.out.println("s2 = " + s2);



    }
}
