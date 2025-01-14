public class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26]; // Frequency array for characters

            // Expand the substring from index `i`
            for (int j = i; j < s.length(); j++) {
                freq[s.charAt(j) - 'a']++; // Update frequency for current  
                int maxFreq = 0, minFreq = Integer.MAX_VALUE;
                for (int f : freq) {
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }
                totalBeauty += (maxFreq - minFreq);
            }
        }
        return totalBeauty;
    }
}
