package EolympTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("bir eded daxil edin");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res1 = num / 10;
        int res2 = num % 10;
        System.out.println(res1 + " " + res2);

    }
}
