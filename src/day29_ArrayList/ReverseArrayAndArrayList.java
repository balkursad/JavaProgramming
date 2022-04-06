package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};
        int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length-1;  i >=0 ; i-- , j++) {
            result[j]= array[i];
        }
        System.out.println(Arrays.toString(result));

        System.out.println("------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        Collections.reverse(list);

        System.out.println(list);


    }
}
