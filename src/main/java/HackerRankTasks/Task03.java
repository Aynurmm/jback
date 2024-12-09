package HackerRankTasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int x= new Scanner(System.in).nextInt();
        if(2*x-3!=0&&Math.pow(x,2)-(5*x)+7 !=0) {
            double y = ((Math.pow(x, 2) + 3 * x - 4) / (2 * x-3)) - ((x + 2) / (Math.pow(x, 2) - 5 * x + 7));
            System.out.printf("%.3f",y);

        }
        else {
            System.out.println( "Sifira bolme yoxdur");
        }

    }
}
