package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {
        // declaring multiple variable by using comma (,)
        String name = "Joshua",
                streetName = "Rose Street",
                city = "Istanbul",
                buildingNumber ="11",
                state = "IST",
                zipCode = "123456";

        // print by using concatenation
        System.out.println("Name\t:\t"+name);
        System.out.println("Adress\t:\t"+streetName+",  "+buildingNumber+"\n\t\t\t"
                +city +",\t" + state +"  " + zipCode);
    }

}
