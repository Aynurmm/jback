package AbsTask;

import java.util.Scanner;

public class Iphone15 extends Iphone{
    Scanner scanner=new Scanner(System.in);
    private double price;

    public Iphone15(double price){
        this.price=price;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        if (price>2500){
            this.price=price;
        }
        else {
            System.out.println("yeni qiymeti daxil edin");
            this.price=scanner.nextDouble();
        }
    }

    @Override
    public void On(){
        System.out.println("Your Iphone15 is on");
    }

    @Override
    public void of() {

    }
}
