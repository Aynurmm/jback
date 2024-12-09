package Polimorfizm;

public class Animal1 {
    private String name;
    private int age;


    public Animal1(String name, int age){
        this.name=name;
        this.age=age;

    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }



    public void makeSound(){
        System.out.println("heyvanlarin sesleri");
    }

}
