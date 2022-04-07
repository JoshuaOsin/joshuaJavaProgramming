package day34GarbageCollectorAccessModifier;

import static day34GarbageCollectorAccessModifier.Circle.*;
import static day25_CustomMethods_Overloading.SumOfNumbers.*;

public class StaticAllMembers {

    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("----- import sum of ----");

        int num1 = numbers.get(0);
        int num2 = numbers.get(1);;
        System.out.println(sumOf2Numbers(num1,num2));

    }
}
