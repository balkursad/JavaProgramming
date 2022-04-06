package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n= 100;


        String result = (n%2==0)? "Even" :  "Odd";
        System.out.println(result);

        System.out.println("************************");
        //TernariesWithNestedIf
        int score = 10;

        String resultScore = (score>=0&&score<=100)?  (score>=90)? "Exculusive" : (score>=80)? "good" :(score>=60)? "pass" : "NotPassed" :"Wrong Entry";

        System.out.println(resultScore);


    }

}
