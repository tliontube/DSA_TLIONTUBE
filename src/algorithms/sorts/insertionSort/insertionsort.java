package algorithms.sorts.insertionSort;

import java.util.Arrays;

public class insertionsort {
    public static void insertion(int []arr){
        for(int i = 1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>-1&& temp<arr[j]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int []arr= {4,2,6,5,1,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
