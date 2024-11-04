package EolympTasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        System.out.println("3 reqemli eded daxil edin");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>=100&&a<1000){
        int a3 = a % 10;
        int a1 = a / 100;
        int a2 = (a / 10) % 10;
        int cem = a1 + a2 + a3;
        double res = Math.sqrt(cem);
        System.out.printf("%.3f", res);
    }else {
            System.out.println("3 reqemli eded daxil edin");
        }
}}
