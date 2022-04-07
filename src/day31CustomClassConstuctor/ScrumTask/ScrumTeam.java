package day31CustomClassConstuctor.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of tester" + testersList.size() +
                ", total number of developers" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }

    public void addTester (Tester tester){
        testersList.add(tester);
    }
    public void addTester (Tester[] tester){
        testersList.addAll(Arrays.asList(tester));
    }

    public void addDeveloper (Developer developer){
        devopsList.add(developer);
    }
    public void addDeveloper (Developer[] developer){
        devopsList.addAll(Arrays.asList(developer));
    }

    public void removeTester (int employeeID){
        testersList.removeIf( p-> p.employeeID==employeeID);
    }

    public void removeDeveloper (int employeeID){
        devopsList.removeIf( p-> p.employeeID==employeeID);
    }


}
