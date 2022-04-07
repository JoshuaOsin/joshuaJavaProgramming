package week08;

import java.util.Arrays;

public class SentenceSplit {

    public static void main(String[] args) {

        String searchResult = "1-16 of 829 results for ipad";

        // test case search result over 500

        // split method turns into a String []

        String [] each = searchResult.split(" ");
        System.out.println(Arrays.toString(each));

        String searchAmount = each[2];

        String confirmation = "Id: 2239677\n" +
                "Amount: 790 USD\n"+
                "Card Number: 8548595959595\n"+
                "Name: oscar\n"+
                "Date: 11/10/2021";
        // Array list of each line by using \n line breaker
        String[] split1=confirmation.split("\n");
        System.out.println(Arrays.toString(split1));
        System.out.println(split1[1]);

        // Array lisf of elements in the second line
        String[] split2 = split1[1].split(" ");
        System.out.println(Arrays.toString(split2));
        System.out.println(split2[1]);

    }
}
