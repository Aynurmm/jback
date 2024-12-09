package Polimorfizm;

import OOPpractice.Animal;

public class MainApp {
    public static void main(String[] args) {
        Animal1 myCat = new Cat("Tom", 1);
        Animal1 myDog = new Dog("Rex", 1);
        Animal1 herCat = new Cat("Avion", 3, "Black");
        Animal1 cat = new Cat("Oskar", 2, "black");
        System.out.println(((Cat) cat).getColor());
        myCat.makeSound();
        myDog.makeSound();

        myCat.setName("Kitty");
        System.out.println("Pishiyinizin yeni adi: " + myCat.getName());
        myDog.setAge(2);
        System.out.println("Itimizin yeni yashi: " + myDog.getAge());

    }
}
