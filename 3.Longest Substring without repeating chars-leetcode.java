class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>charset=new HashSet<>();
        int maxLength=0;
        int left=0;
        // Expand the window with the right pointer
        for(int right=0;right<s.length();right++){
            // If the character is already in the window, shrink the window from the left
            while(charset.contains(s.charAt(right))){
                charset.remove(s.charAt(left));
                left++;
            }
            charset.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
        
    }
}
