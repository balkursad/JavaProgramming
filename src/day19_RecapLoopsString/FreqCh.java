package day19_RecapLoopsString;

public class FreqCh {

    public static void main(String[] args) {
        String direction ="";
        String word = "aabcccd";
        String result ="";
        int num = 0;
        for (int i = 0; i < word.length(); i++) {
            String ch = ""+word.charAt(i);
            if (direction.equals(ch)){
                continue;
            }
            direction=ch;
            num=0;
            for (int j = 0; j < word.length(); j++) {
                if (ch.equals(""+word.charAt(j))){
                num++;

            }


            }
            result +=  ch+num;

        }
        System.out.println(result);





    }
}
