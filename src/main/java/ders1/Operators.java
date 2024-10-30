package ders1;

public class Operators {
    public static void main(String[] args) {
        int i=10;
        int z=i++;
        int j=++i;
        i+=4;
        System.out.println(i);
        i-=5;
        System.out.println(i);
        i*=2;
        System.out.println(i);
        i/=3;
        System.out.println(i);
        System.out.println(z);
        System.out.println(j);

        for (int a=0;a<7;a++){
            System.out.println("*");
        }
        System.out.println(" ");

        for(int b=0;b<7;++b){
            System.out.println("*");
        }
    }
}
