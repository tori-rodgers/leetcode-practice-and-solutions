import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> result = new HashMap<>();
        for (String currentElement : strs) {
            int[] count = new int[26];
            for (char currentChar : currentElement.toCharArray()) {
                count[currentChar - 'a']++;
            }
            String key = Arrays.toString(count);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(currentElement);
        }
        return new ArrayList<>(result.values());
    }
}
