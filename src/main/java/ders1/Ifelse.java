package ders1;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        System.out.println("zehmet olmasa eded daxil edin");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String result;

        if(a%2==0&&a>0){
            result="Daxil etdiyiniz eded cutdur ve musbetdir";
            System.out.println(result);
        }
        else if(a%2==1&&a>0){
            result="Daxil etdiyiniz eded tekdir ve musbetdir";
            System.out.println(result);
        }
        else if(a%2==0&&a<0){
            result="Daxil etdiyiniz eded cutdur ve menfidir";
            System.out.println(result);
        }
        else if(a%2==1&&a<0){
            result="Daxil etdiyiniz eded tekdir ve menfidir";
            System.out.println(result);
        }
        else{
            result="Daxil etdiyiniz eded 0-a beraberdir";
            System.out.println(result);
        }
        int d=10;
        int k=10;
//        System.out.println(d==k);

        StringBuffer st=new StringBuffer("aa");
        StringBuilder sm=new StringBuilder("aa");
        System.out.println(st.equals(sm));


//       String s="Aaaa";
//       String m="Aaaa";
//       System.out.println(s==m);
//       System.out.println(s.equals(m));






    }
}
