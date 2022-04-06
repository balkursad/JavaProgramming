package day19_RecapLoopsString;

public class UniqueCh {

    public static void main(String[] args) {
        String result = "";
        String word = "aabbcdeffg";
        String direction = "";
        int num =0;

        for (int i = 0; i < word.length(); i++) {
            String ch = ""+word.charAt(i);
            num = 0;
            for (int j = 0; j < word.length(); j++) {
                if (ch.equals(""+word.charAt(j))){
                    num++;
                }

            }
            if (num==1){
                result +=ch;
            }
        }
        System.out.println(result);

    }
}
