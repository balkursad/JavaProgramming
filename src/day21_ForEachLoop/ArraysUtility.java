package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]);

        System.out.println("-----------------"); //sort

        int[] scores = {95,100,55,65,85,78};
        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));
        System.out.println("Min score :"+scores[0]);
        System.out.println("Max score :"+scores[scores.length-1]);

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinema"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("---------------"); //equals

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};
        boolean r1= Arrays.equals(arr1,arr2);

        System.out.println(r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2);

        System.out.println(r2);

        System.out.println("--------------------------");

        char[] ch1 = {'a', 'b', 'c'};
        char[] ch2 = {'b', 'a', 'c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);









    }





}
