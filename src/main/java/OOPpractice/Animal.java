package OOPpractice;

public class Animal {
    private String name;
    private int age;
    private String color;
    public String voice;


    public Animal(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
public void SetName(String name){
        if(name.equals("Ali")){
            name="salam";
            System.out.println(name);
        }
        else {
            System.out.println("try again");
        }
}

    public Animal(String color,String voice){
        this.color=color;
        this.voice=voice;
    }
}
