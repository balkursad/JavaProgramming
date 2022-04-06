package day16_ForLoopsStringPractice;

public class UniqueCharacter {


    public static void main(String[] args) {

        String word = "AABCCD";

        System.out.println("UniqueCharacters:");
        for (int i = 0; i<word.length() ; i++){
            char x = word.charAt(i) ;
            if (word.indexOf(x)==word.lastIndexOf(x)){
                System.out.print(x+" ");
            }
        }


    }
}
