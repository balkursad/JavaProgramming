package day17_whileDoWhileLoops;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String word = "AABBcDDDD";
        String result = "";

        for (int i = 0; word.length()>i; i++){
            char ch = word.charAt(i);
            if (!(result.contains(ch+""))){
                result +=ch+"";
            }
        }
        System.out.println(result);
        System.out.println("----------------");
        String result2 = "";
        for (int i = 0; word.length()>i; i++){
            char ch = word.charAt(i);

            if ((result2.contains(ch+""))){
                continue;
            }
            result2+=ch;
        }
        System.out.println(result2);


        }
    }
