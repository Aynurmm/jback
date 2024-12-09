package Polimorfizm;

import OOPpractice.Animal;

public class Cat extends Animal1 {
    private  String color;

    public Cat(String name,int age){
        super(name,age);
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    @Override
    public void makeSound(){
        System.out.println(getName()+" "+"miyovlayir");

    }

}
