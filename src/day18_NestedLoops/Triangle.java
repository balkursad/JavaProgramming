package day18_NestedLoops;

public class Triangle {

    public static void main(String[] args) {
        String a= "* ";
        String solution = "";
        for (int i = 0; i < 8; i++) {

            //for (int j = 0; j < 1; j++) {
                solution += a;
                System.out.print(solution);


                System.out.println();

        }


        for (int i = 0; i <=7 ; i++) {

            for (int j = 0; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        
    }

}
