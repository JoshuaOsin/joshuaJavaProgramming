package day51_Map_Enum;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println(employeeMap);

        System.out.println("----------Updating gender------------");

        //  1. Update the "M" to Male and "F" to Female
/*
        for (String key : employeeMap.keySet()) {
            if(employeeMap.get(key).equalsIgnoreCase("m") ){
                employeeMap.replace(key, "Male");
            }
            if(employeeMap.get(key).equalsIgnoreCase("f")){
                employeeMap.replace(key, "Female");
            }
        }
*/
        for (Map.Entry<String, String> each : employeeMap.entrySet()) {
            if (each.getValue().equalsIgnoreCase("M")) {
                each.setValue("Male"); // employeeMap.replace(each.getKey(), "Male");
            }
            if (each.getValue().equalsIgnoreCase("F")) {
                each.setValue("Female"); // employeeMap.replace(each.getKey(), "Female");
            }
        }

        System.out.println(employeeMap);

        System.out.println("---------- Display all females ----------------");

        //  2. Display the names of all female employees

        for (Map.Entry<String, String> each : employeeMap.entrySet()) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            if(eachValue.equals("Female")){ // (each.getValue().equalsIgnoreCase("female"))
                System.out.println(eachKey); // System.out.println(each.getKey());
            }

        }

    }
}
