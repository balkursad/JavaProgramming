package day40_FinalKeyword;

public class AnimalObject {

    public static void main(String[] args) {

        Dog dog = new Dog("Elmas", "husky", 'M', "white", "large", 1);

        Dog dog2 = new Dog("gh","d", 'F', "fsg","dfs",5);

        System.out.println(dog);
        dog.eat();
        dog.drink();
        System.out.println(dog2);
        dog2.eat();
        dog2.drink();

        Cat cat = new Cat("Seker", "klg", 'F', "ha", "fkd", 22);

        System.out.println(cat);
        cat.eat();
        cat.drink();

    }
}
