package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("----------------------");

        double[] arr2 ={1.5,2.5,3.5,4.5};
        ArraysUtility.printEachElement(arr2);

        System.out.println("-------------------");

        char[] arr3 = {'a','b','c','d'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("+------------------------");

        String[] arr4 = {"Mehmet", "Ahmet", "Mustafa", "Hasan"};
        ArraysUtility.printEachElement(arr4);

        System.out.println("-----------------");

        int[] n1 = {1,2,3,4,5,6};
        int max1 = ArraysUtility.max(n1);
        System.out.println("max1: " + max1);

        System.out.println("-------------------");

        double[] n2 = {1.5,2.5,3.5,4.5};
        double max2 = ArraysUtility.max(n2);
        System.out.println("max2 = " + max2);

        System.out.println("---------------"); //contains int

        int []number1 = {1,2,3,4};
        int number2 = 6;
        System.out.println(ArraysUtility.contains(number1, number2));

        System.out.println("------------------");

        double[] numberDouble = {1.5,1.9,2.5,3.7};
        double numberDouble1=1.9;
        System.out.println(ArraysUtility.contains(numberDouble,numberDouble1));

        System.out.println("--------------------");

        String[] str = {"Ahmet", "Mehmet"};
        String str1 = "Ahmet";
        System.out.println(ArraysUtility.contains(str,str1));







    }



}
