package EasyTasks;

import java.util.Scanner;

public class BigAccuracy {
    public static void main(String[] args) {
        System.out.println("3 eded daxil edin");
        Scanner sc = new Scanner(System.in);
String st= sc.next();
        double m = sc.nextDouble();
        double n = sc.nextDouble();
        int k = sc.nextInt();

        if (m>0&&m<=100 && n>0&&n<=100 && k>=0&&k<=1000){
            double res = m / n;
            String format = "%." + k + "f";
            System.out.printf(format, res);
        }
        else {
            System.out.println("enter correct value");
        }
    }
}
