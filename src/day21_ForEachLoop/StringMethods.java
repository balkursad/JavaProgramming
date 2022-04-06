package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (char each  : chars){
            System.out.println(each);
        }
        System.out.println("---------------------");//split()

        String sentence = "Wooden Spoon";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String email = "WoodenSpoon@cydeo.com";
        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------");
        String s = "Today is nice day. Today is Monday. Today we learn java";
        String[] sentences = s.split("\\. ");
        System.out.println(Arrays.toString(sentences));



    }
}
