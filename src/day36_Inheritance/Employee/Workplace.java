package day36_Inheritance.Employee;

public class Workplace {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("Kursad", 'M',33, "QA", 2201, 70000, "Mercedes");

        tester.test();
        tester.work();

        Developer developer = new Developer();
        developer.setInfo("Hasan", 'M', 32, "Developer", 1250, 75000, "VW");

        developer.develop();
        developer.work();

        Teacher teacher = new Teacher();
        teacher.setInfo("Nevin", 'F', 58, "Teacher", 1225, 50000, "MEB" );

        teacher.teach();
        teacher.work();

        Driver driver = new Driver();
        driver.setInfo("Mahmut", 'M', 45, "Truck driver", 4125, 49000, "NEbilim");

        driver.drive();
        driver.work();








    }
}
