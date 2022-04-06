package day08_IfStatements;

public class numberOfDays {
    public static void main(String[] args) {
        int number = 12;

        boolean month1 = number==1||number==3||number==5||number==7||number==8||number==10||number==12;
        boolean month2 = number==4||number==6||number==9||number==11;
        boolean month3 = number==2;

        if (month1){
            System.out.println("31Days");
        }
        if (month2){
            System.out.println("30Days");
        }
        if (month3){
            System.out.println("28Days");
        }


    }




}
