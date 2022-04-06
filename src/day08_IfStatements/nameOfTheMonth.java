package day08_IfStatements;

import javax.management.monitor.GaugeMonitor;

public class nameOfTheMonth {
    public static void main(String[] args) {
        int month =0;
        boolean caution = month>12||month<1;

        boolean jan = month==1;
        boolean feb = month==2;
        boolean mar = month==3;
        boolean apr = month==4;
        boolean may = month==5;
        boolean jun = month==6;
        boolean jul = month==7;
        boolean agu = month==8;
        boolean sep = month==9;
        boolean oct = month==10;
        boolean nov = month==11;
        boolean dec = month== 12;
        if (jan){
            System.out.println("January");
        }
        if (feb){
            System.out.println("February");
        }
        if (mar){
            System.out.println("March");
        }
        if (apr){
            System.out.println("April");
        }
        if (may){
            System.out.println("May");
        }
        if (jun){
            System.out.println("June");
        }
        if (jul){
            System.out.println("Juli");
        }
        if (agu){
            System.out.println("August");
        }
        if (sep){
            System.out.println("September");
        }
        if (oct){
            System.out.println("October");
        }
        if (nov){
            System.out.println("November");
        }if (dec){
            System.out.println("December");
        }
        if (caution){
            System.out.println("please try again");
        }





    }




}
