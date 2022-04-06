package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();   //remove
        employees.add("Suat");
        employees.add("Alex");
        employees.add("mahmut");
        employees.add("kursad");
        employees.add("kenan");

        System.out.println(employees);
         employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);

        employees.remove("kenan");
        System.out.println(employees);


        boolean r1 = employees.remove("mahmut");
        boolean r2 = employees.remove("kursad");
        System.out.println(employees);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);



    }
}
