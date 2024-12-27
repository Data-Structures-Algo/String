class Solution {
    public boolean wordPattern(String pattern, String s) {
        return helper(pattern,s);
    }
    private boolean helper(String pattern, String s){
        String[]words=s.split(" "); //string s to string array to map with pattern ch
        if(words.length!=pattern.length()){
            return false;
        }
        HashMap <Character,String> hm = new HashMap<>(); 
        for(int i=0;i<pattern.length();i++){
            Character ch=pattern.charAt(i); //character i of pattern
            Boolean containskey=hm.containsKey(ch); 
            if(containskey){ 
                if(!hm.get(ch).equals(words[i])){ //if the character already maps to a word
                    return false;
                }
                
            }
            else{
                if(hm.containsValue(words[i])){ // Word is already mapped to another character
                return false;

                }
                hm.put(ch,words[i]);

            } 
        }
        return true;
    }
}
