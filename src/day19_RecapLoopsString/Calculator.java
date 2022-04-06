package day19_RecapLoopsString;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scan.nextInt();

        System.out.println("Enter math operator:");
        char operator = scan.next().charAt(0);

        if (!(operator=='+'||operator=='-')){
            System.err.println("Invalid Operator");
            System.exit(0);
        }

        System.out.println("Enter a number:");
        int number2 = scan.nextInt();
        if(operator=='+'){
            System.out.println(number2+number);
        }else{
            System.out.println(number-number2);
        }

    }
}
