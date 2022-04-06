package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] number = new int[10];


        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter a numbers:");
            number[i] = scan.nextInt();
        }
        int max = number[0];
        int min = number[0];
        for (int i = 0; i < number.length; i++) {

            if (max<number[i]){
                max=number[i];
            }
            if (min>number[i]){
                min=number[i];
            }

        }
        System.out.println("number = " + Arrays.toString(number));
        System.out.println("min = " + min);
        System.out.println("max = " + max);



    }
}
