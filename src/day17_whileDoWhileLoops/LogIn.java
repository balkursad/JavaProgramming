package day17_whileDoWhileLoops;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String u = scan.next();
        System.out.println("Enter your password");
        String p = scan.next();


        int attempt = 3;
        while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempt > 0) {
            if(attempt==1){
                System.out.println("THIS IS YOUR LAST CHANGE");
            }
            System.err.println("invalid entry. Please er-enter");
            attempt--;
            System.out.println("Enter your username");
            u = scan.next();
            System.out.println("Enter your password");
            p = scan.next();

        }
        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Log in");
        }else{
            System.out.println("Your account is locked");
        }


    }

}