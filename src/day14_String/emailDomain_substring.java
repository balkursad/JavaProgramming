package day14_String;

public class emailDomain_substring {
    public static void main(String[] args) {

        String email = "kursadbal@gmail.com";

        int begin = email.indexOf("@")+1;
        int end = email.lastIndexOf(".");

        String domain = email.substring( begin, end);
        System.out.println(domain);

        System.out.println("---------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        String str2 = str1.substring(0, 10+1);
        System.out.println(str2);

        int beg = str1.lastIndexOf(", J")+2;
        int ending = str1.lastIndexOf(",");
        String str3 = str1.substring(beg, ending);
        System.out.println(str3);


        String str4 = str1.substring(str1.lastIndexOf("I"));
        System.out.println(str4);

    }

}
