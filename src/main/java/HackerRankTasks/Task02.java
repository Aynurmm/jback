package HackerRankTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int res = myMethod(number);
        System.out.println(res);


    }

    public static int myMethod(int a) {
        int count = 0;
        while (a > 0) {
            int sum = 0;
            int temp = a;
            while (temp > 0) {
                sum += a % 10;
                temp /= 10;
            }
            a = a - sum;
            count++;
        }
        return count;
    }

}
