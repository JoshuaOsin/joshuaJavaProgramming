package day31CustomClassConstuctor;

public class PersonObject {

    public static void main(String[] args) {


        Person person1 = new Person("Joshua Osin", 'M',47);

        System.out.println(person1);

        Person person2 = new Person("Dijar", 'M',32);

        person2.age=33;

        System.out.println(person2);


    }
}
