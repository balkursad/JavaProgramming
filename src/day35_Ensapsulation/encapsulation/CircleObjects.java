package day35_Ensapsulation.encapsulation;
import day35_Ensapsulation.encapsulation.Circle;
public class CircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        System.out.println(circle1);
        System.out.println(circle1.getRadius());


        Circle circle2 = new Circle(10);
        System.out.println("area 2 :" +circle2.calcArea());



    }
}
