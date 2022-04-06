package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArrays_Overloading {

    public static void main(String[] args) {

        int[] number ={1,2,3,5,6};
        double[] nums = {2.5, 2.7, 2.9};
        number = addElement(number,10);
        nums = addElement(nums, 3.1);

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(nums));
    }

    public static int[] addElement(int[] array, int element){
        int[] result = new int [array.length+1];

        int i=0;
        for (int each : array) {
            result[i++]= each;
        }
        result[i]=element;
        return result;
    }

    public static double[] addElement(double[] array, double element){
        double[] result = new double [array.length+1];

        int i=0;
        for (double each : array) {
            result[i++]= each;
        }
        result[i]=element;

        return result;
    }
}
        //yaptigimiz sey variable adini degistirdik. Overloading ile oldugunu gorduk.