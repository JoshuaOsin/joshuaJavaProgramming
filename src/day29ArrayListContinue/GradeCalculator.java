package day29ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {


    public static void main(String[] args) {


        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(100,90,75,85,65,85,44,55,73,73,35,47));

        ArrayList<Integer> gradeOfA = new ArrayList<>();

        gradeOfA.removeIf( p -> !(p >=90 && p<=100));

        System.out.println(gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>();

        gradeOfB.removeIf( p -> !(p >=80 && p<90));

        System.out.println(gradeOfB);


        ArrayList<Integer> gradeOfC = new ArrayList<>();

        gradeOfC.removeIf( p -> !(p >=70 && p<80));

        System.out.println(gradeOfC);


        ArrayList<Integer> gradeOfD = new ArrayList<>();

        gradeOfD.removeIf( p -> !(p >=60 && p<70));

        System.out.println(gradeOfD);


        ArrayList<Integer> gradeOfF = new ArrayList<>();

        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);

        System.out.println(gradeOfF);

        System.out.println("gradeOfA = " + gradeOfA.size());
        System.out.println("gradeOfB = " + gradeOfB.size());
        System.out.println("gradeOfC = " + gradeOfC.size());
        System.out.println("gradeOfD = " + gradeOfD.size());
        System.out.println("gradeOfF = " + gradeOfF.size());
    }
}
