package EolympTasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("1-12 araliginda eded daxil edin");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 12:
            case 1:
            case 2:
                System.out.println("WINTER");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("SPRING");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("SUMMER");
            case 9:
            case 10:
            case 11:
                System.out.println("AUTUMN");
                break;
            default:
                System.out.println("Daxil etdyiniz eded 1-12 araliginda olmalidir");
        }
    }
}
