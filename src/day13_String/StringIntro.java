package day13_String;

public class StringIntro {
    public static void main(String[] args) {

        String name = "Wooden Spoon";
        String name1 = "Wooden Spoon";
        System.out.println(name==name1);

        String str1= new String("TurnaKusu");
        String str2= new String ("TurnaKusu");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));


    }


}
