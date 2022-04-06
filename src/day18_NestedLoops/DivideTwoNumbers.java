package day18_NestedLoops;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two positive number");
        int num1 = scan.nextInt(), num2= scan.nextInt();
        int solution = 0;
        while(num1>=num2){
            num1 -= num2;
            solution++;
        }
        System.out.println( solution+"with remainder of "+num1);

    }
}
