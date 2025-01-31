/*
Bucket sort approach:
1-Count character frequencies:

2-Use a HashMap to store the frequencies of characters in the string.
Group characters by frequency:

3-Create an array of StringBuilder (buckets) where the index represents the frequency. Store characters in the bucket corresponding to their frequency.
Build the result string:

4-Traverse the buckets from the highest frequency to the lowest, appending characters to the result string.
*/
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        StringBuilder result=new StringBuilder();

        //frequency count
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //max frequency
        int maxfreq=0;
        for(int freq:map.values()){
            maxfreq=Math.max(maxfreq,freq);
        }

        //StringBuilder[]bucket for frequencies
        StringBuilder[]buckets=new StringBuilder[maxfreq+1];

        //creation if buckets[i] 
        for(int i=0;i<=maxfreq;i++){
            buckets[i]=new StringBuilder();
        }

        //populating the buckets using the method entrySet() of HashMap
        for(Map.Entry<Character,Integer>entry : map.entrySet()){
            char ch = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].append(ch);
        }

        //building the result from the buckets
        for(int i=maxfreq;i>=0;i--){
            for(char ch:buckets[i].toString().toCharArray()){
                result.append(String.valueOf(ch).repeat(i));
            }
        }
        
        return result.toString();
    }
}
