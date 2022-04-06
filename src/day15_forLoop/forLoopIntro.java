package day15_forLoop;

public class forLoopIntro {

    public static void main(String[] args) {

        for (int i = 1; i<5; i++){
            System.out.println("i = " + i);
        }

        /*
        System.out.print(15);
        System.out.print(16);
        ...
        System.out.print(45);
         */
        //15 16 17 18 19

        for (int i = 15; i<=45; i++){
            System.out.println(i+" ");
        }
        System.out.println("-----------------------");

        //100 99 98 97 96 95 94 93 92 .... 50
        for (int i = 100; i>=50; i--){
            System.out.println(i+" ");
        }

        //print all even numbers between 1-55

        for (int i = 1; i<55; i++){
            if (i % 2 == 0){
                System.out.println(i+" ");
            }
        }

        System.out.println("---------------");




    }
}
