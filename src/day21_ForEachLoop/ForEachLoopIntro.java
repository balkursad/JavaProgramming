package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] number = {10,20,30,40,50,60,70};

        for (int i = 0; i < number.length; i++) {
            int eachElement = number[i];
            System.out.println(eachElement);

        }
        System.out.println("----------------------");//forEachLoop

        for (int each : number ){
            System.out.println(each);
        }


    }

}
