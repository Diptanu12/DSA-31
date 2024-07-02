public class LargestElementinanArray {
    public static void main(String[] args) {
        int arr[] = {1, 93, 5, 9, 41, 25};
       // lergest(arr);
        lergest2(arr);
      //  System.out.println("largest = " + arr[arr.length-1]);
    }

//    static void lergest(int arr[]) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - 1; j++) {
//                if (arr[j+1] < arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }
    static void lergest2(int arr[]){
        int largest=arr[0];
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest = " + largest);
    }
}
