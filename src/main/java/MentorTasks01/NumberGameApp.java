package MentorTasks01;

import java.util.Scanner;
import java.util.Random;

public class NumberGameApp {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();

            int randomNumber = rand.nextInt(101);

            System.out.println("Oyuna başlayaq!");

            System.out.println("Zəhmət olmasa adınızı daxil edin:");
            String name = sc.nextLine();

            while (true) {
                System.out.println("Zəhmət olmasa bir ədəd daxil edin:");
                int userInput = sc.nextInt();

                if (userInput < randomNumber) {
                    System.out.println("Sizin ədədiniz çox kiçikdir. Zəhmət olmasa, yenidən cəhd edin..");
                } else if (userInput > randomNumber) {
                    System.out.println("Sizin ədədiniz çox böyüktür. Zəhmət olmasa, yenidən cəhd edin..");
                } else {
                    System.out.println("Təbrik edirik, " + name + "!");
                    break;
                }
            }


    }}
