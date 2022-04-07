package day11_SwitchScanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch= 'A';

        switch (ch){ // using or || logic in switch
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");
        }

    }

}
