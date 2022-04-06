package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        byte grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("great job");
                break;
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("passed");
                break;
            case 'F':
                System.out.println("failed");
            default:
                System.out.println("invalid");

        }



    }

}
