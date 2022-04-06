package day32_Constructors;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Kursad");
        Employee employee2 = new Employee("Zeynep", 'F');
        Employee employee3 = new Employee("Omer", 'M', "SDET");
        Employee employee4 = new Employee("Burak", 'M', "QA", 120000);


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

    }
}
