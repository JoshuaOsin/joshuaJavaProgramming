package day31CustomClassConstuctor.ScrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        //4 testers objects
        Tester tester1 = new Tester("Layan", 11, "QA", 110000 );
        Tester tester2=new Tester("Ali",43,"SDET",142000);
        Tester tester3=new Tester("Alex",44,"SE",135000);
        Tester tester4= new Tester("Lala", 23,"SDET",115000);

        Tester[] testers = {tester1,tester2,tester3,tester4};


        //4 developers objects
        Developer developer1 = new Developer("Olga", 22, "Java Developer", 125000);
        Developer developer2= new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "Software Developer", 135000);
        Developer developer4= new Developer("Sinem", 13, "Senior Developer",200000);

        Developer [] developers ={ developer1,developer2,developer3,developer4};


        // 1 ScrumTeam Object
        ScrumTeam scrum = new ScrumTeam("Joshua", "Iroda", "Dijar", 14);

        scrum.addTester(testers);

        scrum.addDeveloper(developers);

        System.out.println(scrum);

        System.out.println("-----------------------------");


        double totalSalary =0;
        for (Tester tester : scrum.testersList) {
            System.out.println(tester.name + " : "+ tester.salary);
            totalSalary +=tester.salary;
        }
        System.out.println("totalSalary of Testers= " + totalSalary);

        System.out.println("----------------------------");

        for (Developer developer : scrum.devopsList) {
            System.out.println(developer.name +" : "+ developer.salary);
        }

        System.out.println("-----------------------------");
        scrum.removeTester(23);
        totalSalary =0;
        for (Tester tester : scrum.testersList) {
            System.out.println(tester.name + " : "+ tester.salary);
            totalSalary +=tester.salary;
        }
        System.out.println("totalSalary of Testers= " + totalSalary);


    }
}
