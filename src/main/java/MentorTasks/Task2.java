package MentorTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        System.out.println("zehmet olmasa bir soz daxil edin");
//        Scanner sc=new Scanner(System.in);
//        String str= sc.nextLine();
////        String lastch;
//        char arr[]={'a','e','o','u','ə','ö','ü','i','ı'};
//        for (int i=0;i<=str.length();i++){
//            if(str.length()==i){
//                if(lastch==str.charAt(i-1)){
//
//                }
//            }
//        }


//        for (int i=1;i<=4;i++){
//for (int j=1;j<=i;j++){
//    System.out.print("* ");
//}
//if (i>2){
//    break;
//}
//            System.out.println();
//        }

//
//        for (int i=1;i<=3;i++){
//            for (int j=1;j<=3;j++){
//                if (j%2==0||i%2==0){
//                    System.out.print("- ");
//                }
//                else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }


//        int [] numbers={13,4,2,22,34,17};
//        int a=numbers[0];
//        for (int i=1;i<numbers.length;i++){
//            if (numbers[i]<a){
//                a=numbers[i+2];
//            }
//        }
//        System.out.println(a);
//
//        int[]arr1={1,2,3};
//        int[]arr2={1,2,3};
//        int [] arr3=arr1;
//        arr2[1]=5;
//        arr3[1]=4;
//        System.out.println(arr1[1]+" "+arr2[1]+" "+arr3[1]);

//        int[][]nums={{1,2},{2,4,5},{6,7,8,9}};
//        System.out.println(nums[3][1]+nums[0][0]);
//
//        for (int i=1;i<=3;i++){
//            for (int j=3;j>=i;j--){
//                System.out.print(i*j +" ");
//            }
//            System.out.println();
//        }


        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;
        int arrayLength = numbers.length;


        // access all elements using for each loop
        // add each element in sum
        for (int number : numbers) {
            sum += number;
        }


        // calculate the average
        // convert the average from int to double
        average = ((double) sum / (double) arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

//}
//
