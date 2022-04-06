package day24_CustomMethod_Return;

public class ReturnMethodsPractice {

    public static void main(String[] args) {

        String str = "aabccdee";
        int freq = frequency(str, 'a');   //frequency of characters
        System.out.println(freq);

        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));
                if (frequency==1){
                    System.out.println(str.charAt(i)+" unique");
                }
            }
        }



    public static int frequency(String str, char ch) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }


}
