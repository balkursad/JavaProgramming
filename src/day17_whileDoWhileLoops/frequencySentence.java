package day17_whileDoWhileLoops;

public class frequencySentence {

    public static void main(String[] args) {

        String word = "Java Java";
        int frequency = 0;
        for (int i = 0; i <= word.length() - 4; i++) {
            String choose = word.substring(i, i + 4);
            System.out.println(choose);
            if (choose.equals("Java")) {
                frequency++;
            }


        }
        System.out.println(frequency);
    }
}
