package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 69;

        if (score>=0 && score <=100) {

            if (score >= 70) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }

        }else{
                System.out.println("wrong score");
            }



    }

}
