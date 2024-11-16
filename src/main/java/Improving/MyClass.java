package Improving;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
int res=mymethod(4,5);
int result2=mymethod(4,5,6);
String yourname=enterName("");
        System.out.println("your name is: "+yourname);
        System.out.println(res*3);

        System.out.println(res);
        System.out.println(result2);



    }

    public static int mymethod(int x, int y){
        int res=x+2*5+y;
//        System.out.println(res);
        return res;
    }

    public static int mymethod(int x,int y,int z){
        int sum=x+y+z;
//        System.out.println(sum);
        return sum;
    }


    public static String enterName(String name){
//        String myname=name;
        Scanner scanner=new Scanner(System.in);
        String myname=scanner.nextLine();
        return myname;
    }
}
