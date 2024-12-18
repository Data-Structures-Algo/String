class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        String prefix=strs[0]; //consider first string be the prefix
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){  //compare the prefix 
                prefix=prefix.substring(0,prefix.length()-1); 
                //reduce the prefix until it matches the start of strs[i]
            }
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }
}
