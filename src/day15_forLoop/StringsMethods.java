package day15_forLoop;

import java.util.Locale;

public class StringsMethods {

    public static void main(String[] args) {

        String str = "             ";
        boolean r = str.isEmpty();
        System.out.println(r);

        boolean r1 = str.isBlank();
        System.out.println(r1);

        String str2 = "Cydeo     ";
        System.out.println(str2.isBlank());
        System.out.println(str2.repeat(4));

        System.out.println("----------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("------------------");

        String sentence ="My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava1 = sentence.contains("java");
        boolean hasJava2 = sentence.toLowerCase(Locale.ROOT).contains("java");
        boolean hasJava3 = sentence.contains("java") || sentence.contains("Java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava1);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("------------------------");

        String input1 = "I love jAvA";
        String input2 = "java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.toLowerCase(Locale.ROOT).contains(input2));
        System.out.println(input1.toUpperCase(Locale.ROOT).contains(input2.toUpperCase(Locale.ROOT)));

        System.out.println("-------------------");

        String a = "Wooden Spoon";

        boolean x =a.startsWith("Woo");
        boolean y=a.endsWith("oon");
        boolean z = a.toLowerCase(Locale.ROOT).startsWith("woo");

        System.out.println(x+"\n"+y+"\n"+z);




    }

}
