package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Joshua";
        int age = 47;
        String citizen = "CAN";

        boolean isEligible = age >= 21 && citizen == "USA"; //True

        // Eligible
        if(isEligible){ // True
            System.out.println("Eligible");
        }

        //Not Eligible
        if(!isEligible){ // !True ==> not true==> false
            System.out.println("Not Eligible");
        }


    }

}
