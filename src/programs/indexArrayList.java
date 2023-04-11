package programs;
import java.util.*;
public class indexArrayList {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("apple");
        List.add("banana");
        List.add("grapes");
        List.add("avacado");
        List.add("berry");
        String element = "berry";
        int index = -1;
        for(int i =0;i<List.size();i++){
            if(element.equals(List.get(i))){
                index=i;
                break;
            }
        }
        System.out.println(element+ " : " + index);
    }
}
