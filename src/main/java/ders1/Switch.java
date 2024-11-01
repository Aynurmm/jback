package ders1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Zehmet olmasa eded daxil edin");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        String ay;
        String fesil;

        switch (a){
            case 1:
                ay="Yanvar";
                fesil="Qish";
                break;
            case 2:
                ay="fevral";
                fesil="qish";
                break;
            case 3:
                ay="mart";
                fesil="yaz";
                break;
            case 4:
                ay="aprel";
                fesil="yaz";
                break;
            case 5:
                ay="may";
                fesil="yaz";
                break;
            case 6:
                ay="iyun";
                fesil="yay";
                break;
            case 7:
                ay="iyul";
                fesil="yay";
                break;
            case 8:
                ay="avgust";
                fesil="yay";
                break;
            case 9:
                ay="sentyabr";
                fesil="payiz";
                break;
            case 10:
                ay="oktyabr";
                fesil="payiz";
                break;
            case 11:
                ay="noyabr";
                fesil="payiz";
                break;
            case 12:
                ay="dekabr";
                fesil="qish";
                break;

            default:
                ay="tapilmadi";
                fesil="tapilmadi";
        }
        System.out.println("ay: " +ay );
        System.out.println("fesil: "+fesil );


    }
}
