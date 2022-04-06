package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        String  word= "Today is good day to learn Java";
        String[] sentence = word.split(" ");
        String newSentence = "";

        for (int i = sentence.length - 1; i >= 0; i--) {
            newSentence+=sentence[i]+" ";
        }

        System.out.println(newSentence);
    }
}
