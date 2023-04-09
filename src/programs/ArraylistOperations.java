package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Problem Statement
//        Given an ArrayList of integers. The task is to perform operations on ArrayList according to the queries and print output for the required queries.
//
//        Note: use Collections.sort() to sort the list in the natural order, Collections.reverseOrder() to arrange the elements in reverse, get() to return the element at the index of the list, linear search for finding a specified element in the list. If multiple positions exist, print the smallest one.
//        Input
//        Constraints:-
//        1 < = N < = 1000
//        1 < = Arr[i] < = 100000
//        Output
//        Print the index of element if found else print -1 in Search function add a white-space after every output.
//        Example
//        Sample Input:-
//        6
//        a 2 a 3 a 4 a 2 i s 2
//
//        Sample output:-
//        0
//
//        Sample Input:-
//        5
//        a 2 a 3 a 3 d s 5
//
//        Sample Output:-
//        -1
//
//        Explanation:
//        Testcase 1: After inserting elements, list is (2, 3, 4, 2) and arranging them in ascending order, we have list as (2, 2, 3, 4). Now, serching for 2, first occurence is at 0th index.
//
//        Testcase 2: After inserting elements, list is (2, 3, 3) and arranging them in descending order, we have list as (3, 3, 2). Finding 5 gives -1, as 5 is not present.
public class ArraylistOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element to insert: ");
        int n = sc.nextInt();
        for (int i =0;i<n;i++){
            System.out.println("Enter the element to insert");
            int x = sc.nextInt();
            insert(list,x);
        }
        sort(list);
        System.out.println("Sorted element in increasing order: " + list);
        System.out.println("Enter the element to search for: ");
        int val = sc.nextInt();
        search(list,val);

        desending(list);
        System.out.println("element in decreasing order: " + list);
    }
    public static void insert(ArrayList<Integer> list,int x){
        list.add(x);
    }
    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);
    }
    public static void search(ArrayList<Integer>list,int val){
        boolean found = false;
        for (int i = 0; i<list.size();i++){
            if (list.get(i) == val){
                System.out.println("Element found");
                found = true;
                break;
            }
            if(!found){
                System.out.println(" element not found");
            }
        }
    }
    public static void desending(ArrayList<Integer>list){
        Collections.sort(list, Collections.reverseOrder());
    }
}
