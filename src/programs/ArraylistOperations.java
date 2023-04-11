import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraylistOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            int x = sc.nextInt();
            add(list,x);
        }
        System.out.println(list);
        increasing(list);
        System.out.println(list);
        decreasing(list);
        System.out.println(list);
        int target = 4;
        searching(list,target);


    }
    public static void add(ArrayList<Integer> list, int x){
        list.add(x);
    }
    public static void increasing(ArrayList<Integer> list){

        Collections.sort(list);

    }
    public static void decreasing(ArrayList<Integer> list){
        Collections.sort(list,Collections.reverseOrder());
    }
    public static void searching(ArrayList<Integer> list, int target){
        boolean found = false;
        int ans = 0;
        for(int i =0; i< list.size();i++){
            if(list.get(i) == target){
                ans = i;
                found = true;
                break;
            }else {
                ans = -1;
            }
        }
        if(ans == -1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index: " + ans);
        }
    }
}