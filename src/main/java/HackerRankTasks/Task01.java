package HackerRankTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array in uzunlugunu daxil edin: ");
        int lengArr=sc.nextInt();
        int arr[]=new int[lengArr];
        System.out.println("Array in elementlerini daxil edin ");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int res=arraySum(arr);
        System.out.println("Array elementlerinin cemi: "+ res);




    }
    public static  int arraySum(int newarr[]){
        int sum=0;
        for (int i=0;i<newarr.length;i++){
            sum+=newarr[i];
        }
        return sum;
    }
}
