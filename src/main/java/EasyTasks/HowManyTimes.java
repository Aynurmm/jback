package EasyTasks;

import java.util.Scanner;

public class HowManyTimes {
    public static void main(String[] args) {
        System.out.println("eded daxil edin");
        int numb = new Scanner(System.in).nextInt();
        int count = 0;

        int reqemlerincemi = reqemlerincemi(numb);
        System.out.println(reqemlerincemi);

        while (numb > 0) {
             numb = numb - reqemlerincemi(numb);
            count++;
        }
        System.out.println(count);

    }

    public static int reqemlerincemi(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }




}

