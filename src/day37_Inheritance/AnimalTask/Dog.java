package day37_Inheritance.AnimalTask;

import day37_Inheritance.AnimalTask.Animal;

public class Dog extends Animal {



    public Dog(String name, String bleed, char gender, int age, String size, String color) {
        super(name, bleed, gender, age, size, color);

    }

    public void bark(){
        System.out.println(name+ " is barking");
    }
}
