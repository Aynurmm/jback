package MentorTasks01;
import java.util.Random;
import java.util.Scanner;

public class ShootingSquare {
    public static void main(String[] args) {
        char[][] lovhe = new char[5][5];
        Random num = new Random();
        int setir = num.nextInt(5);
        int sutun = num.nextInt(5);

        lovhenidoldur(lovhe);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hər şey hazır. Mübarizəyə başla!");

        while (true) {
            lovhenicapet(lovhe);

            int row = deyeriyoxla(scanner, "Sətir nömrəsini daxil edin (1-5): ") - 1;

            int col = deyeriyoxla(scanner, "Sütun nömrəsini daxil edin (1-5): ") - 1;

            if (row == setir && col == sutun) {
                lovhe[row][col] = 'x';
                lovhenicapet(lovhe);
                System.out.println("Qazandınız!");
                break;
            } else {
                lovhe[row][col] = '*';
            }
        }

    }

    public static void lovhenidoldur(char[][] lovhe) {
        for (int i = 0; i < lovhe.length; i++) {
            for (int j = 0; j < lovhe[i].length; j++) {
                lovhe[i][j] = '-';
            }
        }
    }

    public static void lovhenicapet(char[][] lovhe) {
        System.out.println("0 | 1 | 2 | 3 | 4 | 5 |");
        for (int i = 0; i < lovhe.length; i++) {
            for (int j = 0; j < lovhe[i].length; j++) {
                System.out.print(lovhe[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static int deyeriyoxla(Scanner scanner, String prompt) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 1 && input <= 5) {
                    break;
                } else {
                    System.out.println("Xəta: Daxil etdiyiniz rəqəm 1 ilə 5 arasında olmalıdır.");
                }
            } else {
                System.out.println("Xəta: Zəhmət olmasa rəqəm daxil edin.");
                scanner.next();

            }
        }
        return input;
    }
}
