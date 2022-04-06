package day15_forLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int min = 2144836487 ;

        for (int i =0; i<5; i++){
            System.out.println("Enter a number:");
        int num = scan.nextInt();
        if (num<min){
            min=num;
        }

        }
        System.out.println("min = " + min);




    }
}
