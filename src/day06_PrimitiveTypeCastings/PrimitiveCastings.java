package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a = 100;
        short b = a;
        //short b = (short)a;
        //          (short)a
        int c =  b; //implicit casting
        //int c = (int)b

        System.out.println("-------------------");


        int x = 55;
        short y = (short)x;

        System.out.println(x+":"+y);

        int n = -129;
        byte m = (byte) n;

        System.out.println(n+" : "+m);

        double a1 = 20.5;
        short a2 = (short)a1;

        System.out.println(a1+":"+a2);


    }



}
