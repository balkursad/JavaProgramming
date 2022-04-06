package day04_Variables;

public class circle {
    public static void main(String[] args) {
        double pi = 3.14;
        double r = 3;

        double Diameter = r * 2;
        double area = pi*r*r;
        double parimeter=2*pi*r;

        System.out.println("pi = " + pi);
        System.out.println("r = " + r);
        System.out.println("Diameter = " + Diameter);
        System.out.println("area = " + area);
        System.out.println("parimeter = " + parimeter);




    }




}
/*
Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI
 */
