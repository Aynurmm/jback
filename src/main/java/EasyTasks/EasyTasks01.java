package EasyTasks;

import java.util.Scanner;

public class EasyTasks01 {
    public static void main(String[] args) {
        System.out.println("Zehmet olmasa 1-99 araliginda bir eded daxil edin");
        int eded= new Scanner(System.in).nextInt();
        int result;
        if(eded>1&&eded<=99){
          int a=  eded/10;
          int b=eded%10;
            System.out.println(a+" "+b);
        }
        else {
            System.out.println("daxil etdiyiniz eded 1-99 araliginda olmalidir");
        }
    }
}
