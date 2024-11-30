package Improving;

import javax.xml.namespace.QName;

public class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }

}
