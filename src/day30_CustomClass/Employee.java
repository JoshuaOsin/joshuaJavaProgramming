package day30_CustomClass;

public class Employee {

    public String name;
    public char gender;
    public int age;
    public int id;
    public String jobTitle;
    public boolean isFullTime;
    public double salary;

    public void work() {
        System.out.println(jobTitle+" "+ name +" is working");
    }

    public void setInfo(String name, char gender, int age, int id, String jobTitle, boolean isFullTime, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.isFullTime = isFullTime;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", isFullTime=" + isFullTime +
                ", salary= $ " + salary +
                '}';
    }
}
