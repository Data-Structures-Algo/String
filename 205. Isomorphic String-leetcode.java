import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) {
                    return false; // s[i] maps to a different character in t
                }
            } else {
                mapS.put(charS, charT); // Create a new mapping from s to t
            }
            
            if (mapT.containsKey(charT)) {
                if (mapT.get(charT) != charS) {
                    return false; // t[i] maps to a different character in s
                }
            } else {
                mapT.put(charT, charS);
            }
        }
        
        return true; // Strings are isomorphic if we reach here
    }
}
