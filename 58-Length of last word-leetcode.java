//Top Interview 150
class Solution {
    public int lengthOfLastWord(String s) {
        // Step 1: Trim any trailing spaces from the string
        s = s.trim();
        
        // Step 2: Find the index of the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // Step 3: Calculate the length of the last word
        // If there's no space found, the entire string is one word
        return s.length() - lastSpaceIndex - 1;
    }
}
