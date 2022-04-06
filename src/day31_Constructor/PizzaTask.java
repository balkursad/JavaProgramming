package day31_Constructor;

public class PizzaTask {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;


    public PizzaTask(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }



    public double calcCost(){
        double cost = 0;
        if (size=='S'){
            cost=10;
        }else if (size=='M'){
            cost=12;
        }else{
            cost=14;
        }
        cost+=2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        return cost;
    }
    public String toString() {
        return "PizzaTask{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +"Total Price = $"+calcCost()+
                '}';
    }


}
