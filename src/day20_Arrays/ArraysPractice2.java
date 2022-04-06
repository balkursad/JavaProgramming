package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];



        for (int i = 0, j='A'; i < letters.length; i++, j++) {
            letters[i]=(char)j;

        }
        System.out.println(Arrays.toString(letters));


        System.out.println("------------------");

        char[] letters2 = new char[26];

        for (int i = 0, j='Z'; i <letters2.length ; i++, j--) {
        letters2[i]=(char)j;
        }

        System.out.println(Arrays.toString(letters2));


    }
}
