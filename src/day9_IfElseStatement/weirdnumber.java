package day9_IfElseStatement;

public class weirdnumber {
    public static void main(String[] args) {
        int n = 3;

        if (n%2==1){
            System.out.println("Weird");
        }else if (2<=n&&n<=5){
            System.out.println("Not Weird");
        }else if (6<=n&&n<=20){
            System.out.println("Weird");
        }else if(100>n&&n>20){
            System.out.println("Not Weird");
        }




    }
}
