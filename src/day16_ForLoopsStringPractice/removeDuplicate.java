package day16_ForLoopsStringPractice;

public class removeDuplicate {

    public static void main(String[] args) {

        String word = "AABBCCDDEEBDA";
        String result ="";
        for (int i = 0; word.length()>i; i++){
            String letter =""+ word.charAt(i);

            if (!result.contains(letter)){
            result +=  letter;

            }
        }
        System.out.println("result = " + result);



    }
}
