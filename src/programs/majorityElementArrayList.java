package programs;

import java.util.*;

public class majorityElementArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();//11233
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n;i++){
            numbers.add(sc.nextInt());
        }
        Collections.sort(numbers);
        int i =0;
        while(i<n){// 11233
            int cur = numbers.get(i);//1
            i++;
            while(i<n && cur == numbers.get(i)){//1
                i++;
            }
            System.out.print(cur+ " ");
        }
        System.out.println();
    }
}
