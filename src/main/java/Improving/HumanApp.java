package Improving;

public class HumanApp {
    public static void main(String[] args) {

        Mother mymother=new Mother("Aygul","Shainova",39);
        System.out.println(mymother.name);

        Mother mother1=new Mother(42);
        System.out.println(mother1.toString());

        Mother mother2=new Mother(174,"Mammadova");
        System.out.println(mother2.height);
        System.out.println(mother2.toString());

        Father myftaher=new Father("Ali","Aliyev",184);
        System.out.println(myftaher.name);


    }
}
