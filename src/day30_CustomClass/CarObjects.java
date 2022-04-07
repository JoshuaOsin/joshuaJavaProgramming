package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("BMW", "525i", "Grey",2017,11000);

        System.out.println(car1);

        car1.start();
        car1.drive();
        car1.stop();

        Car car2 = new Car();

        car2.setInfo("Audi", "A6", "Grey",2017,9000);
        System.out.println(car2);

        Car car3 = new Car();

        car3.setInfo("Toyota", "Camry", "White",2017,8000);
        System.out.println(car3);

        ArrayList <Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(carsList);

        for (Car each : carsList) {
            System.out.println(each.model+each.brand+" : "+each.price);
        }

        carsList.removeIf(p-> p.brand.equals("BMW")&& p.year>=2005 && p.year<=2008);
        carsList.removeIf(p-> p.brand.equals("Toyota")&& p.year>=1995 && p.year<=1997);

    }
}
