package Improving;

public class Mother {
    public  String name;
    public  String surname;
    public int age;
//    private  constructorApp;

    public static int height;



    public Mother(String nameOfMother,String surnameOfMother, int ageOfMother){
        this.name=nameOfMother;
        this.surname=surnameOfMother;
        this.age=ageOfMother;

    }

    public Mother(int ageMother){
        this.age=ageMother;
    }

    public Mother(int height,String mysurname){
        this.surname=mysurname;
        this.height=height;
    }

    @Override

    public String toString(){

        return ("name: "+name+" "+"surname: "+surname+" "+"age: "+age+" "+"height: "+height);

    }
}
//classimizi kapsullayiriq birbasha elcatanligin qarsh alir