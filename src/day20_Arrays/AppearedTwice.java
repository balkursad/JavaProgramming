package day20_Arrays;

public class AppearedTwice {

    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C','D','D','D'};
        for (int i = 0; i < chars.length; i++) {
            char element = chars[i];
            int freq=0;
            for (int j = 0; j < chars.length; j++) {
                char elo=chars[j];
                if (elo == element){
                    freq++;
                }

            }
            if (freq==2){
                System.out.println(element);
            }
            
            
        }



    }
}
