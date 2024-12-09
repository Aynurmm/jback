package AbsTask;

import java.util.Scanner;

public class MainApp {
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        Iphone15 iphone15=new Iphone15(2000);
        System.out.println(iphone15.getPrice());
        iphone15.setPrice(1200);
        System.out.println(iphone15.getPrice());

    }
}
