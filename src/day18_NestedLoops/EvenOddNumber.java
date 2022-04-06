package day18_NestedLoops;

import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number");
            int a = scan.nextInt();

            if (a%2 == 0){
                System.out.println("Even Number");
            }else{
                System.out.println("Odd Number");
            }
            System.out.println("Would you like continue?");
            String answer = scan.next();

            while(!(answer.equalsIgnoreCase("no")||answer.equalsIgnoreCase("yes"))){
                System.err.println("Please enter correct form");
                answer = scan.next();
            }

            if(answer.equalsIgnoreCase("no")){
                break;
            }


        }
    }
}
