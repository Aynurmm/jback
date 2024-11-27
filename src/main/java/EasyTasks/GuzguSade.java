package EasyTasks;

import java.util.Scanner;

public class GuzguSade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = ededsadedirmi(a, b);
        System.out.println(res);

    }

    public static int ededsadedirmi(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i < 2) {
                continue;
            }
            boolean sadeEded = true;
            for (int eded = 2; eded <= i/2; eded++) {
                if (i % eded == 0) {
                    sadeEded = false;
                }
            }
            if (sadeEded) {
                count++;
            }
        }
        return count;
    }



}
