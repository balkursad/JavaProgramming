package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {

    public static void main(String[] args) {

        String[] group1 = {"Hasan", "Ali", "Osman"};
        String[] group2 = {"Mehmet", "John", "Ayse"};
        String[] group3 = {"Kursad", "Zeynep", "Omer"};

        String[][]groups = new String[3][];
        groups[0]= group1;
        groups[1]= group2;
        groups[2]= group3;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("-----------------------");
        int[][] arr2D = { {1,2,3}, {4,5,6,7,8,9} , {10,11,12,13}};

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[2][1]);



    }
}
