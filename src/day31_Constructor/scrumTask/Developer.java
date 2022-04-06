package day31_Constructor.scrumTask;

public class Developer {

    public String name;
    public int empleyeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int empleyeeID, String jobTitle, double salary) {
        this.name = name;
        this.empleyeeID = empleyeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", empleyeeID=" + empleyeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void unitTesting(){
        System.out.println(name+" is unit testing");
    }

}
