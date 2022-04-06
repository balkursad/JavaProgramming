package day18_NestedLoops;

import java.util.Scanner;

public class AdditionOfTwoNumbers {

    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = scan.nextInt();

            System.out.println("Enter second number");
            int b = scan.nextInt();

            System.out.println("Addiction = "+ (a+b));

            System.out.println("Continue?");
            String answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.err.println("please try again. yes or no.");
                System.out.println("Continue?");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")){
                System.out.println("okay");
                break;
            }

        }

    }
}
