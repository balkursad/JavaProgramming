package day17_whileDoWhileLoops;

public class LoopPractices {

    public static void main(String[] args) {

        for (int i = 1 ; i<=10; i++){
            System.out.print(i);
        }

        System.out.println("-------------------");

        int j = 1;
        while(j<=10){
            System.out.print(j);
            ++j;
        }

        System.out.println("-------------------");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        }while(k<=10);



    }
}
