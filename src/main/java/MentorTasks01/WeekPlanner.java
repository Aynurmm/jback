package MentorTasks01;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        System.out.println("Please enter the day of week");
        Scanner sc=new Scanner(System.in);

        String[][] schedule = new String[7][2];

        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";

        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";

        schedule[2][0] = "Tuesday";
        schedule[2][1] = "do sports;work on projects";

        schedule[3][0] = "Wednesday";
        schedule[3][1] = "read a book";

        schedule[4][0] = "Thursday";
        schedule[4][1] = "meet friends";

        schedule[5][0]="Friday";
        schedule[5][1]="Start a new course";

        schedule[6][0]="Saturday";
        schedule[6][1]="spend time with family";


        String input=sc.nextLine().toLowerCase();

        if (input.equals("exit")) {
            System.out.println("Exiting the program. Goodbye!");
            return;
        }

        boolean flag=false;

        for (int i = 0; i < schedule.length; i++) {
            if (input.equals(schedule[i][0].toLowerCase())) {
                flag = true;

                switch (schedule[i][0]) {
                    case "Sunday":
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                    case "Saturday":
                        System.out.println("Your task for " + schedule[i][0] + ": " + schedule[i][1]);
                        break;
                }
            }
        }

        if (!flag) {
            System.out.println("Sorry, I don't understand you. Please try again.");
        }

    }
}
