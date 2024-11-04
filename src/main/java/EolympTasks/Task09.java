package EolympTasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("4 reqemli eded daxil edin");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        if (num>=1000&&num<=9999){
        int firstdigit=num/1000;
        int lastdigit=num%10;
        int res=firstdigit+lastdigit;
        System.out.println(res);
    }else{
            System.out.println("4 reqemli eded daxil edin");
    }
}}
