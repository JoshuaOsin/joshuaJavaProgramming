package day10_NestedIF;

public class GradeReport2 {
    public static void main(String[] args) {
        int s = 95;
        String result ="";
        if ( s >= 0 && s <= 100){
            result = (s > 89)? "A" :  (s > 79)? "B"
                    : (s > 69)? "C" : (s > 59)? "D" : "F";
        } else{
            result = "Invalid";
        }
        System.out.println("result = " + result);
    }

}
