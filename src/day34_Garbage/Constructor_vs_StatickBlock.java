package day34_Garbage;

public class Constructor_vs_StatickBlock {

    static {
        System.out.println("Static block");

    }

    public Constructor_vs_StatickBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Constructor_vs_StatickBlock();

    }



}
