package EasyTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        System.out.println("enter a positive number");
        int val = new Scanner(System.in).nextInt();
        int bolen = 10;
        int regemsayi = 1;
        if (val > 0) {
            while (val / bolen > 0) {
                bolen *= 10;
                regemsayi++;
            }
            System.out.println("regemlerin sayi: " + regemsayi);
        } else {
            System.out.println("this number is not positive");
        }

    }
}
