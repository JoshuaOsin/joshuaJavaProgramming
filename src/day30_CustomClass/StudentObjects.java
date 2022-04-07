package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun", 'M', 39, 2211, 'A');

        Student student2 = new Student();
        student2.setInfo("Hajira", 'F', 39, 2212, 'B');

        Student student3 = new Student();
        student3.setInfo("Iroda", 'F', 39, 2213, 'A');

        Student student4 = new Student();
        student4.setInfo("Vasilica", 'F', 39, 2214, 'B');

        Student student5 = new Student();
        student5.setInfo("Joshua", 'M', 39, 2215, 'B');

        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("-------- ArrayList--------");

        ArrayList <Student> earlyBirds = new ArrayList<>();
        earlyBirds.addAll(Arrays.asList(students));
        earlyBirds.removeIf(p-> !(p.grade=='A')); // remove all if not 'A'
        System.out.println(earlyBirds);



    }
}
