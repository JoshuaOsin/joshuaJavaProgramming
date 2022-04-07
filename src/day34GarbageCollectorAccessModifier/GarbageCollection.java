package day34GarbageCollectorAccessModifier;

import day30_CustomClass.Dog;
import day32_Constructor.Car;
import day33_Static_CustomMethod.Iphone;
import day33_Static_CustomMethod.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        // int num = null; // primitive type not

        String str= null;  // can be used only non-primitive type

        // System.out.println(str.toLowerCase());

        String str2 = "Wooden Spoon"; // after line 15, "Wooden Spoon" is eligible for Garbage Collection

        str2 = null;

        System.out.println(str2);


        Car car1 = new Car("toyota");
        car1 = null;

        System.out.println(car1);


        System.out.println("------- second way of unreferencing ------");

        Dog dog1 = new Dog();
        dog1.name ="Lucy";  // now eligible for garbage collection

        dog1= new Dog();
        dog1.name = "Max";

        System.out.println(dog1);


        String language = "Phyton"; // now eligible for garbage collection
        language ="Java";

        System.out.println(language);

        System.out.println("------- multiple reference -------");
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;  // now referencing same object
        list1.add(100);

        System.out.println(list1);
        System.out.println(list2);

        list2.addAll(Arrays.asList(200,300,4000));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println("------- multiple reference -------");

        Student student1 = new Student("joshua",'M',47,1233,'B');
        student1.grade= 'A';

        Student student2 = student1;
        student2.name = "Dijar";

        System.out.println("--------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Java");

        ArrayList<String> list4 = list3; // new ArrayList<>() if we want new object
        list4.add("Phyton");

        System.out.println("list3 = " + list3);
        System.out.println("list4 = " + list4);

   }
}
