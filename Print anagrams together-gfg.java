/*Given an array of strings, return all groups of strings that are anagrams. The groups must be created in order of their appearance in the original array. Look at the sample case for clarification.

Note: The final output will be in lexicographic order.*/
import java.util.*;

public class AnagramGroups {

    private static List<List<String>> groupAnagrams(String[] strs) {
        // Map to store sorted string as key and its group as value
        Map<String, List<String>> map = new LinkedHashMap<>();
        
        for (String str : strs) {
            // Sort the string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Add to the map
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(str);
        }

        // Create the result list
        List<List<String>> result = new ArrayList<>();
        for (List<String> group : map.values()) {
            //Collections.sort(group); // Sort each group lexicographically
            result.add(group);
        }

        return result;
    }
}
