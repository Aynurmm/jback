package EolympTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("3 eded daxil edin");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c < 1000 && b < 1000 && a < 1000) {
            if ((a > b && a < c) || (a > c && a < b)) {
                System.out.println("orta reqem: " + a);
            } else if ((b > a && b < c) || (b > c && b < a)) {
                System.out.println("orta eded: " + b);
            } else {
                System.out.println("orta eded: " + c);
            }
        } else {
            System.out.println("daxil etdiyiniz eded 0-1000 araliginda olmalidir");
        }
    }
}
