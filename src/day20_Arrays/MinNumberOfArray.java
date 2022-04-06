package day20_Arrays;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int [] number = {100, 500, 30, 40, 600, 80, 90};
        int min =number[0];
        for (int i = 0; i < number.length; i++) {

            if (min>number[i]){
                min=number[i];
            }

        }
        System.out.println(min);


    }
}
