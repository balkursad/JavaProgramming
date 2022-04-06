package day19_RecapLoopsString;

public class firstDuplicate {

    public static void main(String[] args) {

        String word = "abeczdeff";
        int num =0;
        String result = "";
        String direction = "";

        for (int i = 0; i < word.length(); i++) {
            String ch = ""+ word.charAt(i);
            direction = ch;
            num = 0;
            for (int j = 0; j < word.length(); j++) {
                if (ch.equals(""+word.charAt(j))) {
                    num++;
                }
                if (num>1){
                    result += direction+direction;
                }
            }
        }
        System.out.println(result.substring(0,2));

    }
}
