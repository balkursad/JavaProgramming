package day24_CustomMethod_Return;

public class removeDuplicated {

    public static void main(String[] args) {
        String word = "aaabbccc";
        String dublicate = duplicate(word);

    }
    public static String duplicate(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!(result.contains(""+each))){
                result+=each;
            }



        }
        System.out.println(result);
        return result;

    }

}
