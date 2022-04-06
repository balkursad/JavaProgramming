package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {
                                        //parseInt
        String str = "123";

        int num = Integer.parseInt(str);

        System.out.println(num+1);

        String str2= "10.5";

        double num1 = Double.parseDouble(str2);

        System.out.println(num1+0.7);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = "+max);
        System.out.println("min = " + min);

        long max1 = Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;

        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);

        String s1 ="maybe";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);

        System.out.println("--------------------"); //valueOf

        String s2 = "123";
        Integer x = Integer.valueOf(s2);
        int y = Integer.valueOf(s2);

        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        double z = Double.valueOf(s3);
        Double k = Double.valueOf(s3);



        System.out.println(z);
        System.out.println(k);

        System.out.println("-----------------------------");

        //isDigit()
        char ch1 = '0';
        boolean r2 = Character.isDigit(ch1);

        //isLetter
        char ch2 = '!';
        boolean r3 = Character.isLetter(ch2);



        //special char

        boolean r4 = Character.isLetterOrDigit(ch1);

        //Upper case
        boolean r5 = Character.isUpperCase(ch1);

        //Lower case
        boolean r6 = Character.isLowerCase(ch2);



        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each: s.toCharArray()) {
            if (Character.isDigit(each)){
                sum+= Integer.parseInt(""+ each);
            }
        }
        System.out.println(sum);






    }
}
