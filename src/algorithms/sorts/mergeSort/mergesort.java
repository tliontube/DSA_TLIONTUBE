package algorithms.sorts.mergeSort;

import java.util.Arrays;

public class mergesort {
    public static int[] merge(int[]arr1,int[]arr2){
        int []combined = new int[arr1.length+arr2.length];
        int index =0;
        int i = 0;
        int j = 0;
        while(i<arr1.length && j< arr2.length){
            if(arr1[i] < arr2[j]){
                combined[index]=arr1[i];
                index++;
                i++;
            }else{
                combined[index]=arr2[j];
                index++;
                j++;
            }
        }
        while (i<arr1.length){
            combined[index]=arr1[i];
            index++;
            i++;
        }
        while (j<arr2.length){
            combined[index]=arr2[j];
            index++;
            j++;
        }
        return combined;
    }
    public static int[] mergeSrt(int[]array){
        if(array.length==1){
            return array;
        }
        int midIndex = array.length/2;
        int [] left= mergeSrt(Arrays.copyOfRange(array,0,midIndex));
        int [] right = mergeSrt((Arrays.copyOfRange(array,midIndex,array.length)));
        return merge(left,right);
    }

    public static void main(String[] args) {
        int[] originalArray={3,1,4,2};
        int [] sortedArray = mergeSrt(originalArray);
        System.out.println("\n Original Array: " + Arrays.toString(originalArray));
        System.out.println("\n Sorted Array: " + Arrays.toString(sortedArray));
    }
}
