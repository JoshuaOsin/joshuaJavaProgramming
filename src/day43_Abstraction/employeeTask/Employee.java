package day43_Abstraction.employeeTask;

public abstract class Employee extends Person{

    private final int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id) {
        super(name, age, gender);
        if(id <= 0){
            throw new RuntimeException("Invalid ID: "+id);
        }
        this.id = id;
    }

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        this(name, age, gender, id);
        setJobTitle(jobTitle);
        setSalary( salary);
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty()){
            throw new RuntimeException("Invalid job title ");
        }
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        if(salary <= 0){
            throw new RuntimeException("Invalid salary: "+salary);
        }
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + getId() +
                ", job title=" + getJobTitle() +
                ", salary=" + getSalary() +
                '}';
    }
}
