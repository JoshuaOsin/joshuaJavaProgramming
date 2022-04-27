package day39_OOP_Recap.cydeoTask;

public class ScrumMaster extends Employee{

    private String deparment;

    public ScrumMaster(String name, int age, char gender, int employeeID, String jobTitle, double salary,String deparment) {
        super(name, age, gender, employeeID, jobTitle, salary);
        setDeparment(deparment);
    }

    public ScrumMaster(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        if (deparment.isEmpty()) {
            System.err.println("Invalid Entry");
            System.exit(1);
        }
        this.deparment = deparment;
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is having a meeting");
    }

    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                "age=" + getAge() +
                "gender=" + getGender() +
                "employeeID=" + getEmployeeID() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                ", department=" + getDeparment() +
                '}';
    }

    public static void main(String[] args) {

        ScrumMaster s1 = new ScrumMaster("Joshua",23,'M',122,"Tester",221,"A1");

        s1.work();
    }
}
