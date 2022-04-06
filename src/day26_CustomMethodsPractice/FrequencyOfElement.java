package day26_CustomMethodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4,2,1,5,1,7,1,8,2,9,2};
        int freq = frequencyOfElement(arr,1);
        System.out.println(freq);



    }

    public static int frequencyOfElement(int[] array, int element){

        int count=0;
        for (int each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(double[] array, double element){

        int count=0;
        for (double each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(char[] array, char element){

        int count=0;
        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String[] array, String element){

        int count=0;
        for (String each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }



}
