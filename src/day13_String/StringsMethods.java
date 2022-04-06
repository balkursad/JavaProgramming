package day13_String;

import java.util.Locale;

public class StringsMethods {
    public static void main(String[] args) {
        String word = "Cydeo";
                    // 01234
        char thirdChar =word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        System.out.println("*-----------------------------*");

        String s1 = "EU8 is the best batch, isnt it";
        int totalChar = s1.length();
        System.out.println("totalChar = " + totalChar);
        char lastChar = s1.charAt(s1.length()-1);
        System.out.println("lastChar = " + lastChar);


        System.out.println("---------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();      //UPPER
        System.out.println(str);


        String s= "JAVA";
        s= s.toLowerCase();                //LOWER
        System.out.println(s);




        String stri = "kursad";
        stri = "bal";
        System.out.println(stri);

    }
}
