package ArrayApp;

public class ArrayApp {
    public static void main(String[] args) {
        int[] arr={12,58,85,4,78,25};
        int max=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
