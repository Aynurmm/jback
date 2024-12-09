package Polimorfizm;

public class Dog extends Animal1 {
    public Dog(String name,int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(getName()+" "+"hurur");
    }
}
