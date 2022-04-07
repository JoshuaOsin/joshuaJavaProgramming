package day32_Constructor;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(3,2,300,true);
        Carpet carpet2 = new Carpet(3,2,300,false);

        System.out.println(carpet1);
        System.out.println(carpet2);


    }
}
