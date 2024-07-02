public class checkTheArraySortedorNot {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,4,5};
        System.out.println(check(arr));

    }
    static boolean check(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
