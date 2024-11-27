package EasyTasks;

import java.util.Scanner;

public class BagbanRessam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int agacsayi = sc.nextInt();
        int temp = 3;
        if (agacsayi >= 1 && agacsayi <= 50) {
            for (int i = 1; i < agacsayi; i++) {
                temp *= 2;
            }
        }
        System.out.println(temp);
    }
}
