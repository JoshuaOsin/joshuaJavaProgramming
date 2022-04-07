package day20_Arrays;

public class NameOfMonths {
    public static void main(String[] args) {
        // How many and what are they KNOWN
        String months[] = { "January", "February", "March", "April", "May" , "June",
                "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println("-------------------------");
        for (int i = months.length; i > 0 ; i--) {
            System.out.println(months[i-1]);
        }
        System.out.println("-------------------------");
        int number = 9;
        if (number < 0 || number > 12) {
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(months[number-1]);

    }
}
