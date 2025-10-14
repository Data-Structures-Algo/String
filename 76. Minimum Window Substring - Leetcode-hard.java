/*
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

 

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
*/

class Solution {
    public String minWindow(String s, String t) {
        //base condition
        if(s.length()==0 || t.length()==0 || s.length()<t.length()){
            return "";
        }
        //map to put chars of string-t
        Map<Character,Integer> mapT = new HashMap<>();
        
        int left = 0, right=0;
        //var to define how many chars we have currently
        int have = 0;
        //for making ans -> length,left,right
        int[] ans = {-1,0,0};
        //substring -> window
        Map<Character,Integer> window = new HashMap<>();
        //populate mapT from string-t
        for(int i=0;i<t.length();i++){
            mapT.put(t.charAt(i),mapT.getOrDefault(t.charAt(i),0)+1);
        }
        //defines how many chars we need to make a substring
        int need = mapT.size();

        while(right<s.length()){
            char c = s.charAt(right);
            int count = window.getOrDefault(c,0);
            window.put(c,count+1); //populate the window
            //if that char is also in tmap and frequencycount also equals then we have the required char so update have 
            if(mapT.containsKey(c) && window.get(c).intValue() == mapT.get(c).intValue()){
                have++;
            }
            while(left<=right && need==have){
                c = s.charAt(left);
                //if we got the substring then update the ans
                if(ans[0]==-1 || ans[0]>right-left+1){
                    ans[0] = right-left+1;
                    ans[1] = left;
                    ans[2] = right;
                }
                //shrink the window to get the minimum window
                window.put(c,window.get(c)-1);
                //if after shrinking it affects the have count means the char was also in tmap which is what we need then decrement the have count
                if(mapT.containsKey(c) && window.get(c).intValue()<mapT.get(c).intValue()){
                    have--;
                }
                left++;

            }
            right++;
        }
        if(ans[0]==-1){
            return "";
        }
        //ans will be substring from length left to right+1
        return s.substring(ans[1],ans[2]+1);
    }
}
