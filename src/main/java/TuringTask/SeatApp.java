package TuringTask;

import java.util.Random;

public class SeatApp {
    public static void main(String[] args) {
        String[] names = {"Lale Hemidova", "Fexri Babayev", "Senuber Abbasova", "Revan Agayev", "Ella Piriyeva", "Rena Mehdiyeva", "Nicat Mecidova", "Elimurad",
                "Dilber", "Guler Ebilova", "Ibrahim", "Aynur Memmedova", "Ruslan Cerkezov", "Yeter Nebiyeva", "Tural Nezerov", "Famil Memmedov"};

        int[] seats = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        randomSeat(seats);
        System.out.println("Grupun telebeleri ve onlarin yerleri:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "-" + seats[i]);
        }
    }

    public static void randomSeat(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
