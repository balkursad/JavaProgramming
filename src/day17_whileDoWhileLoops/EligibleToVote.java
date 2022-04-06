package day17_whileDoWhileLoops;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt();

        while(!(age>0&&age<120)){
            System.err.println("try again please");
            age = scan.nextInt();
        }
        System.out.println("Are you a German citizen");
        String citizen = scan.next();
        while(!(citizen.equalsIgnoreCase("yes") || citizen.equalsIgnoreCase("no"))){
            System.err.println("Please try again");
            citizen = scan.next();
        }
        System.out.println((age>18 && citizen.equalsIgnoreCase("yes")? "eligible to vote" : "not eligible to vote" ));


    }

}
