package day35_Ensapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("", 'Q', -20, -25);


        System.out.println(employee1.getName());
        System.out.println(employee1.getGender());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getSalary());
        System.out.println(employee1);

        Employee employee2 = new Employee("Aykut", 'M', 31, 115000);
        employee2.setName("Elvira");
        employee2.setGender('F');
        employee2.setSalary(employee2.getSalary()+15000);

        System.out.println(employee2);

    }
}
