package day37_Inheritance.AnimalTask;

import day37_Inheritance.AnimalTask.Animal;

public class Cat extends Animal {


    public Cat(String name, String bleed, char gender, int age, String size, String color) {
        super(name, bleed, gender, age, size, color);
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }
}
