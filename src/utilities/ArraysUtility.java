package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }


    //prints each double of double array in separate lines
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }


    //prints each char of char array in separate lines
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }


    //prints each String of String array in separate lines
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }

    }

    //returns the maximum number from integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the maximum number from double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //returns the minimum number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //returns the minimum number from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if the given integer is contained in the given array. returns boolean. contains(int[], int)
    public static boolean contains(int[] array, int element){

        boolean result = false;
        for (int each : array ) {
            if (each ==element){
                result = true;
            }

        }
       return result;
    }

    //checks if the given double is contained in the given array. returns boolean. contains(double[], double)
    public static boolean contains(double[] array, double element){

        boolean result = false;
        for (double each : array ) {
            if (each ==element){
                result = true;
            }

        }
        return result;
    }

    //checks if the given char is contained in the given array. returns boolean. contains(char[], char)
    public static boolean contains(char[] array, char element){

        boolean result = false;
        for (char each : array ) {
            if (each ==element){
                result = true;
            }

        }
        return result;
    }

    //checks if the given String is contained in the given array. returns boolean. contains(String[], String)
    public static boolean contains(String[] array, String element){

        boolean result = false;
        for (String each : array ) {
            if (each ==element){
                result = true;
            }

        }
        return result;
    }

    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    // adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){

        int count=0;
        for (int each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){

        int count=0;
        for (double each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){

        int count=0;
        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){

        int count=0;
        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement( array ,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement( array ,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement( array ,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement( array ,each)==1){
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){

        if (index<0||index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        int[] result = new int [array.length-1];
        int j=0;
        for (int i = 0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if (index<0||index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        double[] result = new double [array.length-1];
        int j=0;
        for (int i = 0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if (index<0||index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        char[] result = new char [array.length-1];
        int j=0;
        for (int i = 0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if (index<0||index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }
        String[] result = new String [array.length-1];
        int j=0;
        for (int i = 0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static int[] merge (int[] arr1, int[] arr2){
        int[] result=new int[arr1.length+ arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i]=arr1[i];
        }
        for (int i = arr1.length,j=0; i < arr2.length+ arr1.length ;j++, i++) {
            result[i]=arr2[j];
        }
        return result;

    }

    //merge the given two arrays and returns the new array
    public static double[] merge(double [] nums1, double[] nums2){
        double[] result=new double[nums1.length+ nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i]=nums1[i];
        }
        for (int i = nums1.length,j=0; i < nums2.length+ nums1.length ;j++, i++) {
            result[i]=nums2[j];
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static char[] merge(char [] char1, char[] char2){
        char[] result=new char[char1.length+ char2.length];
        for (int i = 0; i < char1.length; i++) {
            result[i]=char1[i];
        }
        for (int i = char1.length,j=0; i < char2.length+ char1.length ;j++, i++) {
            result[i]=char2[j];
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static String[] merge(String [] str1, String[] str2){
        String[] result=new String[str1.length+ str2.length];
        for (int i = 0; i < str1.length; i++) {
            result[i]=str1[i];
        }
        for (int i = str1.length,j=0; i < str2.length+ str1.length ;j++, i++) {
            result[i]=str2[j];
        }
        return result;
    }


    public static int[] reverse(int[]nums){
        int[] rev = new int[nums.length];

        for (int i = nums.length-1, j=0 ; i >=0 ;j++, i--) {
            rev[j] = nums[i];
        }
        return rev;
    }

    public static double[] reverse(double[]nums){
        double[] rev = new double[nums.length];

        for (int i = nums.length-1, j=0 ; i >=0 ;j++, i--) {
            rev[j] = nums[i];
        }
        return rev;
    }

    public static char[] reverse(char[]nums){
        char[] rev = new char[nums.length];

        for (int i = nums.length-1, j=0 ; i >=0 ;j++, i--) {
            rev[j] = nums[i];
        }
        return rev;
    }

    public static String[] reverse(String[]nums){
        String[] rev = new String[nums.length];

        for (int i = nums.length-1, j=0 ; i >=0 ;j++, i--) {
            rev[j] = nums[i];
        }
        return rev;
    }

    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;

    }

    //replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;

    }

    //replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;

    }

    //replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if (index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;

    }

    //replaces all the matching old values of the arrays with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old values of the arrays with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old values of the arrays with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue){
                array[i] = newValue;
            }
        }
        return array;
    }

    //replaces all the matching old values of the arrays with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){
                array[i] = newValue;
            }
        }
        return array;
    }

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[]array){
        int[] result = {};
        for (int each : array){
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[]array){
        double[] result = {};
        for (double each : array){
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[]array){
        char[] result = {};
        for (char each : array){
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[]array){
        String[] result = {};
        for (String each : array){
            if (!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    //insert
    public static int[] insert(int[] arr, int index, int insert){
        int [] inserted = new int[arr.length+1];
        for (int i = 0, j=0; i <= index;j++, i++) {
            if (i!=index){
                inserted[i]= arr[j];
            }else
                inserted[i]=insert;
        }
        for (int i = index+1; i <= arr.length ; i++) {
            inserted[i]=arr[i-1];
        }
        return inserted;
    }

    public static double[] insert(double[] arr, int index, double insert){
        double [] inserted = new double[arr.length+1];
        for (int i = 0, j=0; i <= index;j++, i++) {
            if (i!=index){
                inserted[i]= arr[j];
            }else
                inserted[i]=insert;
        }
        for (int i = index+1; i <= arr.length ; i++) {
            inserted[i]=arr[i-1];
        }
        return inserted;
    }

    public static char[] insert(char[] arr, int index, char insert){
        char [] inserted = new char[arr.length+1];
        for (int i = 0, j=0; i <= index;j++, i++) {
            if (i!=index){
                inserted[i]= arr[j];
            }else
                inserted[i]=insert;
        }
        for (int i = index+1; i <= arr.length ; i++) {
            inserted[i]=arr[i-1];
        }
        return inserted;
    }

    public static String[] insert(String[] arr, int index, String insert){
        String [] inserted = new String[arr.length+1];
        for (int i = 0, j=0; i <= index;j++, i++) {
            if (i!=index){
                inserted[i]= arr[j];
            }else
                inserted[i]=insert;
        }
        for (int i = index+1; i <= arr.length ; i++) {
            inserted[i]=arr[i-1];
        }
        return inserted;
    }


}
