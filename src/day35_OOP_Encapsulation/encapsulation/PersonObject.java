package day35_OOP_Encapsulation.encapsulation;

public class PersonObject {

    public static void main(String[] args) {

        Person p1= new Person();

        p1.setName("Joshua");
        p1.setAge(47);

        System.out.println(p1.getName()+" is "+ p1.getAge()+" years old");
    }
}
