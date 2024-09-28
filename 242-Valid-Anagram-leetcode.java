//Top interview 150
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>seen=new HashMap<>();
        for(char ch:s.toCharArray()){
            seen.put(ch, seen.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            if(!seen.containsKey(ch) || seen.get(ch)==0){
                return false;
            }
            seen.put(ch, seen.get(ch)-1); //decrement the frequency
        }
        return true;

    }
}
