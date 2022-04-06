package day19_RecapLoopsString;

import java.util.Scanner;

public class OddOrEven {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            System.out.println("would you like continue?");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("yes")) {
                continue;
            }else if(answer.equalsIgnoreCase("no")){
                System.out.println("thank you for using");
                break;
            }else{
                System.out.println("invalid");
                System.exit(0);               //asagida baska cod yazili olsaydi exittan  sonra yazmayacakti.
            }

        }

    }
}
