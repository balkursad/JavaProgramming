package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        //store the elements : 10,20,50,70

        int [] numbers = {1, 20, 50, 70}; //size: 4
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------");

        //create a variable that can contain 5 scores
        int [] scores = new int[5];
        scores[0]=65;
        scores[1]=75;
        scores[2]=85;
        scores[3]=25;
        scores[4]=30;
        System.out.println(Arrays.toString(scores));
        System.out.println(scores[2]);


        System.out.println("-------------------------");

        String[] months= {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);

        }


    }
}
