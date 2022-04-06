package day18_NestedLoops;

import java.util.Locale;
import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your age:");
            int age = scan.nextInt();

            while (!(age >= 1 && age <= 120)){
                System.err.println("Invalid Entry, Please re-enter your age");
                age = scan.nextInt();
            }
            System.out.println("would like to continue?");
            String a = scan.next().toLowerCase(Locale.ROOT);

            while(!(a.equals("yes")|| a.equals("no"))){
                System.err.println("Invalid Entry, please re enter. Would you like to continue?");
                a = scan.next().toLowerCase(Locale.ROOT);
            }

            if(a.equals("no")){
                break;
            }
        }
    }
}
