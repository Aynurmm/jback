package EolympTasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lastnum = num % 10;
        int firstnum = num / 100;
        if (lastnum > firstnum) {
            System.out.println(lastnum);
        } else if (lastnum < firstnum) {
            System.out.println(firstnum);
        } else {
            System.out.println("=");
        }
    }
}
