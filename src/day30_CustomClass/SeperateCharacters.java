package day30_CustomClass;

import java.util.ArrayList;

public class SeperateCharacters {

    public static void main(String[] args) {

        String str = "ABCD123$%#@456EFG";

        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character> letters =new ArrayList<>(chars);

        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println("letters= "+letters);

        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character> special = new ArrayList<>(chars);
        special.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println("Special: "+special);

    }
}
