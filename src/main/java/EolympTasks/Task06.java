package EolympTasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        System.out.println("Ucbucagin tereflerini daxil edin");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double aKvadrat = Math.pow(a, 2);
        double bKvadrat = Math.pow(b, 2);
        double cKvadrat = Math.pow(c, 2);

        if ((aKvadrat + bKvadrat == cKvadrat) || (aKvadrat + cKvadrat == bKvadrat) || (cKvadrat + bKvadrat == aKvadrat)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
