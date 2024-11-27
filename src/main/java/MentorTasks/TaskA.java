package MentorTasks;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ishciSayi=sc.nextInt();


        if (ishciSayi >= 2){
            double[] maash= new double[ishciSayi];

            for (int i=0;i<=ishciSayi-1;i++){
                maash[i]= sc.nextDouble();
            }
            System.out.println(maashlar(maash));

        }

    }

    public static double maashlar(double [] maashlar){
        double max=maashlar[0];
        for (int i=0;i<maashlar.length;i++){
            if (maashlar[i]>max){
                max=maashlar[i];
            }
        }
        return max;
    }

}
