import java.util.* ;
import java.io.*; 
public class Solution{
	public static String convertString(String str) {
            // Write your code here
            if(str==null || str.length()==0){
                return str;
            }
            StringBuilder result=new StringBuilder();
            String[]words=str.split(" ");

            for(String word : words){
                if(word.length()>0){
                    result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
                }
            }
            return result.toString().trim();

    }

}
