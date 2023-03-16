package algorithms.search.linear;

public class linearSearch {
    public static int linearsearch(int[]arr, int target){
        for(int i =0;i<arr.length;i++){
           if(arr[i]==target){
                return i;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        int target = 4;
        int result = linearsearch(arr,target);
        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element is present in index : " + result);
        }
    }
}
