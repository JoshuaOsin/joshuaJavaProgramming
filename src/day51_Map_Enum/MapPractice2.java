package day51_Map_Enum;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 { public static void main(String[] args) {

    Map<String, Integer> map = new LinkedHashMap<>();
    map.put("John", 123000);
    map.put("Antony", 100000);
    map.put("Jimmy", 115000);
    map.put("Jalil", 145000);
    map.put("James", 110000);
    map.put("Conor", 85000);
    map.put("Josh", 117000);
    map.put("Cory", 118000);
    map.put("Anderson",125000);
    map.put("Steven", 135000);

    //  1 who has the maximum and minimum salary?
    String nameOfMaxSalary = "";
    int maxSalary = Integer.MIN_VALUE;

    String nameOfMinSalary = "";
    int minSalary = Integer.MAX_VALUE;

    for (Map.Entry<String, Integer> each : map.entrySet()) {
        String eachKey = each.getKey();
        Integer eachValue = each.getValue();

        if(eachValue > maxSalary){ //each.getValue() > maxSalary
            maxSalary = eachValue;
            nameOfMaxSalary = eachKey;
        }

        if(eachValue < minSalary){ //each.getValue() < minSalary
            minSalary = eachValue;
            nameOfMinSalary = eachKey;
        }

    }

    System.out.println(nameOfMaxSalary + " has max salary");
    System.out.println(nameOfMinSalary + " has minimum salary");


    System.out.println("-------- how many employees has the salary between 120k ~ 150K ------------");

    //how many employees has the salary between 120k ~ 150K?

    int count = 0;

    for (Integer eachValue : map.values()) {
        if(eachValue >= 120000 && eachValue <= 150000){
            count++;
        }
    }

    System.out.println(count + " employees has the salary between 120k ~ 150K");


    System.out.println("--------- Names of the employees who are making less than 118k -------------");

    //   1.4 display the names of the employees who are making less than 118k?
    for (Map.Entry<String, Integer> each : map.entrySet()) {
        if( each.getValue() < 118000){
            System.out.println(each.getKey());
        }
    }

    System.out.println("--------- increase the salary employee by 10K ----------------");

    // 1.5 increase the salary employee by 10K if the current salary of employee is less than 120K

    System.out.println(map);
    System.out.println("----- if the current salary of employee is less than 120K-----");

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        if(entry.getValue() < 120000){
            entry.setValue(entry.getValue()+10000);
        }
    }

    System.out.println(map);

}


}

/*
1. Given the following map that contains the employee name and thier salary:
     Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
 */