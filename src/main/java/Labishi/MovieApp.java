package Labishi;

import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movieName = new Movie[3];
        int count = 0;

        while (true) {
            System.out.println(" \n Press 1 to input.\n Press 2 to display movies and ratings.\n Press 3 to input more movies.\n Press 4 to find statistics. \n Press 5 to search for a movie. \n Press 6 to update movie ratings\nPress 0 to exit\n");
            int userInput = sc.nextInt();
            sc.nextLine();

            switch (userInput) {

                case 1:
                    while (count < 3) {
                        if (count < movieName.length) {

                            movieName[count] = inputMovie(sc);
                            count++;
                            System.out.println("Movie added successfully");
                        } else {
                            System.out.println("Movie list is full");
                        }
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No movies added yet");
                    } else {
                        String res = getNameAndRating(movieName, count);
                        System.out.println(res);
                    }
                    break;

                case 3:
                    System.out.println("How many additional movies would you like to add?");
                    int additionalCount = sc.nextInt();
                    sc.nextLine();

                    Movie[] newMovieName = new Movie[movieName.length + additionalCount];

                    for (int i = 0; i < movieName.length; i++) {
                        newMovieName[i] = movieName[i];
                    }

                    for (int i = movieName.length; i < newMovieName.length; i++) {
                        System.out.println("Enter movie name and rating:");
                        newMovieName[i] = inputMovie(sc);
                    }

                    movieName = newMovieName;
                    count += additionalCount;
                    System.out.println(additionalCount + " movies added successfully.");
                    break;
                case 4:
                    double res1 = average(movieName);
                    System.out.println("Average is: " + res1);
                    System.out.println("Max element is: " + maxElement(movieName));
                    System.out.println("Min element is: " + minElement(movieName));
                    break;

                case 5:
                    System.out.println("Search for movie");
                    String text = sc.nextLine();
                    System.out.println(findMovie(movieName, text));

                case 6:
                    System.out.println("Search for a movie");
                    String input = sc.nextLine();
                    System.out.println("Input new Rating");
                    int inputRating = sc.nextInt();
                    System.out.println(changeRating(movieName, input, inputRating));

                    break;

                case 7:

                case 0:
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid input. Try again.");


            }
        }
    }


    public static Movie
    inputMovie(Scanner sc) {
        System.out.println("Enter movie name:");
        String name = sc.nextLine();


        System.out.println("Enter movie rating:");
        int rating = sc.nextInt();
        sc.nextLine();

        return new Movie(name, rating);
    }

    public static String getNameAndRating(Movie[] movie, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += "Movie name: " + movie[i].name + " | Movie rating:" + movie[i].rating + "\n";
        }
        return result;
    }


    public static double average(Movie[] arr) {
        double temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i].rating;
        }
        return temp / arr.length;
    }

    public static double maxElement(Movie[] arr) {
        double max = arr[0].rating;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].rating) {
                max = arr[i].rating;
            }
        }
        return max;
    }

    public static double minElement(Movie[] arr) {
        double min = arr[0].rating;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].rating) {
                min = arr[i].rating;
            }
        }
        return min;
    }


    public static String findMovie(Movie[] arr, String text) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name.equals(text)) {
                return arr[i].name;
            }

        }
        return "Movie not found";
    }

    public static String changeRating(Movie[] arr, String text, int newRating) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name.equals(text)) {
                arr[i].rating = newRating;
            } else {
                return "Not found";
            }

        }
        return String.valueOf(newRating);
    }



}