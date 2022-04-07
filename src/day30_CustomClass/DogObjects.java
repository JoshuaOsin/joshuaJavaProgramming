package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1= new Dog(); // object created from Dog Class

        dog1.name = "Tomstone";
        dog1.breed = "Kangal";
        dog1.age = 3;
        dog1.color ="Brown";
        dog1.gender= 'M';
        dog1.size = "Big";


        System.out.println(dog1);
        
        
        Dog dog2 = new Dog();

        dog2.name = "Lucy";
        dog2.breed = "husky";
        dog2.age = 5;
        dog2.color ="White";
        dog2.gender= 'F';
        dog2.size = "Small";

        System.out.println(dog2);


        Dog dog3 = new Dog();

        dog3.setInfo("Jack", "German Shepard", "Big", 4,'M',"Black");

        System.out.println(dog3);

        dog1.play();
        dog2.bark();
        dog3.sleep();

        Dog dog4 = new Dog();
        dog4.setInfo("Lizz", "Kangal", "Big", 3,'F',"Black");

        Dog dog5 = new Dog();
        dog5.setInfo("Sweet", "German Shepard", "Big", 2,'F',"Black");

        Dog [] dogs = {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();

        femaleDogs.addAll(Arrays.asList(dogs));

        femaleDogs.removeIf(p-> !(p.gender=='F')); // remove all

        System.out.println(femaleDogs.size());


    }


}
