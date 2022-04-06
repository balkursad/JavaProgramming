package day17_whileDoWhileLoops;

public class ReturnFrequencyChar {

    public static void main(String[] args) {

        String word = "AAABBAABCAA";

        char choose = 'B';
        int total = 0;
        for (int i= 0; i <word.length(); i++){
            if (word.charAt(i)==choose){
                total += 1;
            }
        }
        System.out.println(total);



    }
}
