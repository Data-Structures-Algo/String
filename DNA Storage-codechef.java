/*For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right and replace the characters as follows:

00 is replaced with A
01 is replaced with T
10 is replaced with C
11 is replaced with G
Given a binary string 
S
S of length 
N
N (
N
N is even), find the encoded sequence.
*/import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();

            // Your code goes here
            HashMap<String,String>map=new HashMap<>();
            map.put("00","A");
            map.put("01","T");
            map.put("10","C");
            map.put("11","G");
            
            StringBuilder result=new StringBuilder();
            for(int i=0;i<n;i+=2){
                String pair=s.substring(i,i+2);
                if(map.containsKey(pair)){
                    result.append(map.get(pair));
                }
            }
            System.out.println(result.toString());
        }
    }
}
