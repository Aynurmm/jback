package HackerRankTasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a%3==0){
            if (a%2==0&&a/100==0){
                System.out.println("YES");
            }
            System.out.println("NO");
        }
        else {
            System.out.println("NO");
        }
    }
}