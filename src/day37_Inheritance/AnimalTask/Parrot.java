package day37_Inheritance.AnimalTask;

import day37_Inheritance.AnimalTask.Animal;

public class Parrot extends Animal {

    public Parrot(String name, String bleed, char gender, int age, String size, String color) {
        super(name, bleed, gender, age, size, color);
    }

    public void sinh(){
        System.out.println(name+ " is singing");
    }
}
