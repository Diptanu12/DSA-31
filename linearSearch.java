import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,6,4,8,6,5};
        int n=arr.length;
        System.out.println("Enter key : ");
        int d=sc.nextInt();


        System.out.println( linear(arr, n, d));
    }

     static int linear(int[] arr, int n, int d) {
        for(int i=0;i<n;i++){
            if(arr[i]==d){
                return i;
            }
        }
        return -1;
    }
}
