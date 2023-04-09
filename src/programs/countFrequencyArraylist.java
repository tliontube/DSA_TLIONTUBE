package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class countFrequencyArraylist {
        public static void main(String[] args) {
            ArrayList<Character> clist = new ArrayList<Character>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of arraylist: ");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the char elements: ");
            for(int i =0;i<n;i++){
                char c = sc.nextLine().charAt(0);
                add(clist,c);
            }
            System.out.println("Enter the char to find for:");
            char c = sc.nextLine().charAt(0);
            frequency(clist,c);
        }
        public static void add(ArrayList<Character> clist, char c){
            clist.add(c);
        }
        public static void frequency(ArrayList<Character> clist, char c){
            if (clist.contains(c)){
                System.out.println(Collections.frequency(clist,c));
            }else {
                System.out.println("not present");
            }
        }
}
