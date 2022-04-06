package day35_Ensapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();
      //  p1.name = "Daniel";   'name' private olduğu için direkt burada kullanılamıor.

        p1.setName("Daniel");
        p1.setAge(28);

       // System.out.println(p1.name);   name diyemiyosun cünkü getter setter kullanmı böyle. get dicen.

        System.out.println(p1.getName()+" : "+p1.getAge());




    }

}
