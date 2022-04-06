package day34_Garbage;



import day30_CustomClass.Dog;
import day32_Constructors.Car;
import day33_Statics.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class GarbageCollection {

    public static void main(String[] args) {

        String str = null;

        System.out.println(str);

        Car car1 = new Car("Totoya");

        car1 = null;
        System.out.println(car1);

        System.out.println("-----------------------"); //second method to unrefferenced object

        Dog dog1 = new Dog();
        dog1.name= "Lucy";

        dog1 = new Dog();
        dog1.name = "MAax";

        System.out.println(dog1);

        String language = "Python";
        language = "Java";

        System.out.println(language);

        System.out.println("---------------------");

        ArrayList<Integer> list1 = new ArrayList<>();               //These are not eligible to garbage class

        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println("---------------------");
        Student student1 = new Student("Tahir", 'M', 30, 14, 'B');
        student1.grade='A';
        Student student2 = student1;
        student2.name= "Ahmet";

        System.out.println(student1);
        System.out.println(student2);


        System.out.println("---------------------");

        ArrayList<String> l1 =new ArrayList<>();
        l1.add("Java");
        ArrayList<String> l2 = l1;
        l2.add("Python");

        System.out.println("l1 = "+ l1);
        System.out.println("l2 = " + l2);




    }
}
