package day40_FinalKeyword;

public class FinalVariable {

    final String birthday;
    final static String name;

    static {
        name = "Batch EU 8";
    }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        //pi = 5.1;           final degismez.
        //pi = 6.1;

        final String name ;

        name = "Java";
        //name="WoodenSpoon";    ilk assign gecerli
        System.out.println(name);

        System.out.println("-------------------");

        FinalVariable obj = new FinalVariable("May/01");
        //birthday = "June/01";    //tekrar assign yapılmaz
        System.out.println(obj.birthday);

        System.out.println("-------------------");

       // FinalVariable.name = "Python";
        System.out.println(FinalVariable.name);


    }
}
