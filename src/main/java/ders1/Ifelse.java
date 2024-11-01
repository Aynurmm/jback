package ders1;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        System.out.println("zehmet olmasa eded daxil edin");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String result;

        if(a%2==0&&a>0){
            result="Daxil etdiyiniz eded cutdur ve musbetdir";
            System.out.println(result);
        }
        else if(a%2==1&&a>0){
            result="Daxil etdiyiniz eded tekdir ve musbetdir";
            System.out.println(result);
        }
        else if(a%2==0&&a<0){
            result="Daxil etdiyiniz eded cutdur ve menfidir";
            System.out.println(result);
        }
        else if(a%2==1&&a<0){
            result="Daxil etdiyiniz eded tekdir ve menfidir";
            System.out.println(result);
        }
        else{
            result="Daxil etdiyiniz eded 0-a beraberdir";
            System.out.println(result);
        }
    }
}
