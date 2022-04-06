package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your firstname");
        String firstname = scan.nextLine();
        System.out.println("Enter your Last name");
        String lastName = scan.nextLine();

        char f = firstname.charAt(0);
        char l = lastName.charAt(0);
        String name = ""+ f+l;
        System.out.println(name);



    }



}
