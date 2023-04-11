
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class frequencyOfCharacterArrayList {
    public static void main(String[] args) {
        ArrayList<Character> c = new ArrayList<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements");
        for (int i = 0; i <n; i++){
            char l = sc.nextLine().charAt(0);
            add(c,l);
        }
        System.out.println("Enter the target element");
        char target = sc.nextLine().charAt(0);
        count(c,target);
    }
    public static void add(ArrayList<Character> c, char l){
        c.add(l);
    }
    public static void count(ArrayList<Character> c, char l ){
        if(c.contains(l)){
            System.out.println(Collections.frequency(c,l));
        }else {
            System.out.println("not found");
        }
    }
}