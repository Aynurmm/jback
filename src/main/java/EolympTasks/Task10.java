package EolympTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(" zehmet olmasa 1-12 araliginda eded daxil edin");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 12:
            case 1:
            case 2:
                System.out.println("first");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("second");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("third");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("fourth");
                break;
            default:
                System.out.println("daxil etdiyiniz eded 1-12 araliginda olmalidir");
        }
    }
}
