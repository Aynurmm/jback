package OOPpractice;

public class MainApp {
    public static void main(String[] args) {
        Animal animal = new Animal("dog", 1, "brown");
        Animal animal1 = new Animal("white", "aww");
        System.out.println(animal1.voice);
        System.out.println(animal.getName());
        animal.SetName("ala");
        System.out.println(animal.getName());
        animal.SetName("fgjhm");
        animal.SetName("Ali");
        animal.SetName("ase");
        if (animal.getName().equals("dog")){
            System.out.println(5*5);
        }
        else{
            System.out.println(10*2);
        }
        System.out.println(animal.getName());
    }
}
