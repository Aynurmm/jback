package MentorTasks;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        int[] myarr = new int[5];
        Scanner sc = new Scanner(System.in);
        int max=myarr[0];

        for (int i=0;i< myarr.length;i++) {

            myarr[i] = sc.nextInt();
        }
            for (int i=1;i<myarr.length-1;i++ ) {
                if (myarr[i] > myarr[i + 1] && myarr[i] > myarr[i - 1]) {
                    System.out.println(myarr[i]);


                }
            }


    }
}
