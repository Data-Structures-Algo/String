/* You are given an array of strings str[] representing filenames. Each filename follows a specific format, such as "file_1", "file_2", etc., where "file_" is a constant prefix and the suffix is a number.
Your task is to write a function that finds the filename with the latest version based on the numeric suffix.
If multiple files have the same prefix, return the one with the highest number. If no valid file is found, return null.*/
import java.util.*;
public class demo{

    public static String findlatestFile(String str[]){
        String Prefix="file_";
        int maxNum=Integer.MIN_VALUE;
        String LatestFile=null;
        for(String s:str){
            if(s.startsWith(Prefix)){
                String numberpart=s.substring(Prefix.length());
                try{
                    int number=Integer.parseInt(numberpart);

                    if(number>maxNum){
                        maxNum=number;
                        LatestFile=s;
                    }
                }catch(NumberFormatException e){
                    System.out.println("invalid number format in string"+s);
                }
            }

        }
        return LatestFile;
        
       
    }
    public static void main(String args[]){
        String str[]={"File_2","file_3","file4","file 5"};
        String LatestFile=findlatestFile(str);

        if(LatestFile!=null){
            System.out.println("latest file="+LatestFile);
        }else{
            System.out.println("invalid");
        }

        
        
    }    
}
