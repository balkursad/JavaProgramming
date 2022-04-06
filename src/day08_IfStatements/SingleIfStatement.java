package day08_IfStatements;

public class SingleIfStatement {
    public static void main(String[] args) {
        int number = 103;

        boolean evenNumber = number %2==0;
        boolean oddNumber = number%2==1;

        if(evenNumber){
            System.out.println(number +" is a even number.");

        }
        if (oddNumber){

            System.out.println(number+ " is an odd number.");
        }





    }






}
