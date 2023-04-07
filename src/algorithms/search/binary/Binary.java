package algorithms.search.binary;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int []pratik = {5,6,4,3,2,7,8};
        System.out.println("original array: " + Arrays.toString(pratik));
        Arrays.sort(pratik);
        System.out.println("sorted array: " + Arrays.toString(pratik));
        int target = 9;
        int ans = search(pratik,target);
        if(ans == -1){
            System.out.println("-1");
        }else {
            System.out.println(ans);
        }
    }
    public static int search(int arr[],int t){
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == t){
                return mid;
            } else if (t>right) {
                left = arr[mid]-1;
            }else {
                right = arr[mid]+1;
            }
        }
        return -1;
    }
}
