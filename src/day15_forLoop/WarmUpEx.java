package day15_forLoop;

import java.util.Locale;
import java.util.Scanner;

public class WarmUpEx {

    public static void main(String[] args) {

        //Question 1
        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();
        if (word.charAt(0)=='x'){
            String word2 = word.replaceFirst("x", "a");
            System.out.println(word2);
        }





        //Question 2
        String str = "xcodeX";

        String str1 = str.replace("x","a").replace("X","a");
        System.out.println(str1);



        //Question 3

        String firstName= "cyDEo";
        String lastName = "SCHOOL";

        String fullName = firstName.substring(0,1).toUpperCase(Locale.ROOT) + firstName.substring(1).toLowerCase()+" "+lastName.substring(0,1).toUpperCase(Locale.ROOT) +
                lastName.substring(1).toLowerCase();
        System.out.println(fullName);



    }


}
