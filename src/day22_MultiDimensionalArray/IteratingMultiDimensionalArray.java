package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3}, {4,5,6,7,8,9} , {10,11,12,13}};

        for (int i = 0; i < arr2D.length; i++) {

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();
        }




    }
}
