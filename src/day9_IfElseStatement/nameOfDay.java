package day9_IfElseStatement;

public class nameOfDay {
    public static void main(String[] args) {
        byte day = 7;

        if (day==1){
            System.out.println("Monday");
        }else if (day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if (day==6){
            System.out.println("Saturday");
        }else if (day==7){
            System.out.println("Sunday");
        }else{
            System.out.println("invalid");
        }
        System.out.println("-----------------");
        String day1;
        if (day==1){
            day1= "Monday";
        }else if (day==2){
            day1= "Tuesday";
        }else if (day==3){
            day1= "Wednesday";
        }else if (day==4){
            day1="Thursday";
        }else if (day==5){
            day1="Friday";
        }else if (day==6){
            day1="Saturday";
        }else {
            day1="Sunday";
        }
        System.out.println("day = " + day1);




    }
}
