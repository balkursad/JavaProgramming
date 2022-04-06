package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 185;

        boolean excellent = score<=100 && score>=90;
        boolean great = score<90 && score>=80;
        boolean good = score<80 && score>=70;
        boolean passed = score<70 && score >=60;
        boolean failed = score<60;

        boolean caution = score>100 || score<0;

        if (excellent){
            System.out.println("Excellent");
        }
        if (great){
            System.out.println("Great");
        }
        if (good){
            System.out.println("Good");
        }
        if (passed){
            System.out.println("Passed");
        }
        if (failed){
            System.out.println("Failed");
        }
        if (caution){
            System.out.println("please enter number between 0-100");
        }



    }




}
