class Solution {
    public int firstUniqChar(String s) {
        int[]freq=new int[26];
        //array to store freq of a to z according to ascii values, a=97 so index of 
        //every c=c-'a' in this array ;
        char[] c=s.toCharArray();
        for(int chars:c){
            freq[chars-'a']++; //updating freqs of string in freq array
        }
        for(int i=0;i<c.length;i++){
            if(freq[c[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
