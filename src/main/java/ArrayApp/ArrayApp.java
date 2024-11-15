package ArrayApp;

import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {-12, -58, -85, -4, -78, 25};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
