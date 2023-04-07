package programs;

public class stringReversed {
        public static void main(String[] args) {
            String n = "HELLO";
            char[] chars = n.toCharArray();
            int left = 0;
            int right = n.length()-1;
            while (left<right){
                char temp =chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
            String reversed = new String(chars);
            System.out.println(reversed);
        }
    }

