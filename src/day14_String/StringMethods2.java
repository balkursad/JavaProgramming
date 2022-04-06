package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        //replace()
        String str = "Java is fun, I love learning Java";
        String str1 =str.replace("Java", "Phyton");
        System.out.println(str);
        System.out.println(str1);


        String email = "kursadbal@yahoo.com";
        String email1 = email.replace("yahoo", "gmail");
        System.out.println(email);
        System.out.println(email1);

        //replaceFirst()

        System.out.println("-----------------------");

        String result = "Java Java Java";

        result = result.replaceFirst("Java", "Phyton");

        System.out.println(result);

        String result2 = "C# is fun, C# is cool";
        String result3 = result2.replaceFirst("C#", "Java");

        System.out.println(result2+"\n"+result3);



    }

}
