package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
       //trim()
        String str1 = "                          batch                 EU8       ";
        str1 = str1.trim();
        System.out.println(str1);


        //indexOf()
        String str2 = "Cydeo School";
        int n1=  str2.indexOf("h");
        System.out.println("n1= "+n1);
        int n2= str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("a");
        System.out.println("n3 = " + n3);
        int n4 = str3.indexOf("amm");
        System.out.println("n4 = " + n4);



        //lastindexOf()
        int n5 = str3.lastIndexOf("g");                   //sagdan okumaya baslar
        System.out.println("n5 = " + n5);
        int n6 = str3.indexOf("g");
        System.out.println("n6 = " + n6);





    }

}
