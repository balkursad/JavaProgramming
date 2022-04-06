package day17_whileDoWhileLoops;

import java.util.Scanner;

public class MarryMe {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = scan.next();

        while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.err.println("invalid Entry. please try again");
            System.out.println("Will you marry me?");
            answer = scan.next();
        }

            System.out.println(answer.equalsIgnoreCase("yes") ? "congrat" : "hayirlisi");



    }
}
