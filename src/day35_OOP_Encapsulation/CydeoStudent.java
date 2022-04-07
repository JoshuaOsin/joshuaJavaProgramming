package day35_OOP_Encapsulation;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    // Constructor for instances
    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy, String secretCode) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
        this.secretCode = secretCode;
    }

    // static blochk for static fiedls
    static{
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printSecretCode() {
        System.out.println(secretCode);
    }

    public void attendClass() {
        System.out.println(name+ " is attending the class");
    }

    public void study(){
        System.out.println(name +" is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
