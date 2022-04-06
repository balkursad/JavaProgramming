package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Kursad";
        int age = 27;
        String citizen = "German";

        boolean isEligible = age>18 && citizen=="German";

        System.out.println(name+ "is Eligible to Vote :"+ isEligible);
        System.out.println("-----------------------");


        String name1 = "Ismail";
        int age1 = 30,
                creditScore = 800,
                income = 44000;
        boolean isEligible2 = age>21 && income>=45000||creditScore>=900;
        System.out.println(name+ "  is eligible for loan: "+isEligible2);

        System.out.println("----------------------------------");
        int score = 50 ;
        boolean passed = score>=60;
        boolean failed = !passed;
        System.out.println(score + " is enough to pass: "+passed);
        System.out.println(score + " is not enough to pass: "+failed);


    }




}
