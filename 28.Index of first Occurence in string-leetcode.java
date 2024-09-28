class Solution {
    public int strStr(String haystack, String needle) {
       
        if (needle.isEmpty()) {
            return 0;
        }
        
        int haystackLen = haystack.length();
        int needleLen = needle.length();
        
        
        if (needleLen > haystackLen) {
            return -1;
        }
        
        // Iterate over haystack to check for the needle
        for (int i = 0; i <= haystackLen - needleLen; i++) {
            // Check if the substring from current position matches the needle
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i; // Return the starting index if match is found
            }
        }
        
        // If no match is found, return -1
        return -1;
    }
}
