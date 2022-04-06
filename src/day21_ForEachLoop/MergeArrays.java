package day21_ForEachLoop;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] arr1 ={1,2,3,4};
        int[] arr2 ={5,6};

        int[] merge = new int[arr1.length+arr2.length];

        for (int i = 0, j=0; i < arr1.length;j++, i++) {
            merge[i]=arr1 [j];
        }
        for (int i = arr1.length, j=0; i < arr2.length+arr1.length;j++, i++) {
            merge[i]=arr2[j];
        }
        System.out.println(Arrays.toString(merge));

    }
}
