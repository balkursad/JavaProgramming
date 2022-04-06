package day36_Inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small", "brown");

        dog.bark();
        dog.drink();
        dog.eat();
        dog.sleep();

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', 3 ,"Small", "Brown");

        cat.sleep();
        cat.eat();
        cat.drink();
        cat.scratch();

        Lion lion = new Lion();
        lion.setInfo("Hunter","Africa", 'F', 5, "Large", "Orange");

        lion.drink();
        lion.eat();
        lion.sleep();
        lion.move();
        lion.roar();


    }
}
