package day34_Garbage;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("MAin Method");

    }



    static {                                    //once static yazdiriliyor.
        System.out.println("Static");
    }
}
