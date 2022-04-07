package day17_While_Do_While;

public class WhileLoopIntro {
    public static void main(String[] args) {

        boolean check= true;
        int s = 0;

        while (check) {
            for (int i = 0; i < 10; i++) {
                if (i %5 == 0){
                    s = i;
                    check = false;
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
