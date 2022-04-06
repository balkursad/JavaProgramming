package day31_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> developersList = new ArrayList<>();
    public int daysOfSplit;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSplit) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.testersList = testersList;
        this.developersList = developersList;
        this.daysOfSplit = daysOfSplit;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }

    public void addDevelopers(Developer[] develelopers){
        developersList.addAll(Arrays.asList(develelopers));
    }

    public void removeTester(int employeeID){
        testersList.removeIf(p-> p.employeeID== employeeID);
    }

    public void removeDeveloper(int employeeID){
        developersList.removeIf(p-> p.empleyeeID==employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + developersList.size() +
                ", daysOfSplit=" + daysOfSplit +
                '}';
    }
}

