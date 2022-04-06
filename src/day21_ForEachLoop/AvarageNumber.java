package day21_ForEachLoop;

public class AvarageNumber {

    public static void main(String[] args) {

        int[] number = {10,20,30,40,50};
        double sum = 0;
        for (int i : number) {
            sum+= i;
        }

double average = sum/number.length;
        System.out.println(average);

    }
}
