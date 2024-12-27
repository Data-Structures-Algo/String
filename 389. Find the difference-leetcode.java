class Solution {
    public char findTheDifference(String s, String t) {
        int total=0; 
        //using ascii values
        for(int i=0;i<t.length();i++){
            total=total+t.charAt(i); //ascii value sum of t
        }
        for(int i=0;i<s.length();i++){
            total=total-s.charAt(i); //ascii vallue difference of t and s
        }
        return (char)total; // the extra char
    }
}
