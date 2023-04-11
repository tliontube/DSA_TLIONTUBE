package programs;

    import java.util.*;

    public class binaryInsertion  {
        public static void main(String[] args) {
            int arr[] = {5,4,3,2,1};
            System.out.println("Original Array : " + Arrays.toString(arr));
            int target = 4;
            insertionSort(arr);
            System.out.println("Sorted Array : " + Arrays.toString(arr));
            int ans = binarySearch(arr, target);
            if(ans == -1){
                System.out.println("Element not found: ");
            }else{
                System.out.println("Element found at : " + ans);
            }
        }
        public static int binarySearch(int arr[], int target){
            int left = 0;
            int right = arr.length-1;
            while(left<=right){
                int mid = (left+right)/2;
                if(arr[mid] == target){
                    return mid;
                }else if(arr[mid]<target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
            return -1;
        }
        public static void insertionSort(int []arr){
            for(int i =1; i<arr.length;i++){
                int temp = arr[i];
                int j = i-1;
                while(j>-1 && temp<arr[j]){
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    j--;
                }
            }
        }
    }
