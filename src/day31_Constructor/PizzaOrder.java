package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {

    public static void main(String[] args) {

        ArrayList<PizzaTask> pizzas = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            PizzaTask smallPizza = new PizzaTask('S',2,3);
            PizzaTask mediumPizza = new PizzaTask('M',3,4);
            PizzaTask largePizza = new PizzaTask('L',4,5);

            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));
        }
        System.out.println(pizzas);

        System.out.println("Total number of Pizza : "+ pizzas.size());
        double totalPrice = 0;

        for (PizzaTask pizza : pizzas) {
            totalPrice += pizza.calcCost();
        }
        System.out.println("totalPrice = " + totalPrice);



    }
}
