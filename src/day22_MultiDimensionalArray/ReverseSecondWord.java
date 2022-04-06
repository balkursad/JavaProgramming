package day22_MultiDimensionalArray;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String word = "I love you";
        String[] sentence = word.split(" ");
        String reverse = "";

        for (int i = sentence[1].length()-1; i>=0; i--){
            reverse+=""+ sentence[1].charAt(i);
        }
        word = word.replaceFirst(sentence[1],reverse);
        System.out.println(word);

        sentence[1]= reverse;
        for (String s : sentence) {
            System.out.print(s+" ");
        }



    }
}
