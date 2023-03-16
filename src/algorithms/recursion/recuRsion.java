package algorithms.recursion;

public class recuRsion {
    public static int rec(int n){
        if(n==1){
            return 1;
        }
        return n*rec(n-1);
    }

    public static void main(String[] args) {
        int myFac = rec(4);
        System.out.println(myFac);
    }
}
