import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

class SolutionNotes {

    public List<List<String>> groupAnagrams(String[] strs) {            // Each inner List<Strings> is a group of anagrams
                                                                        // The outer List holds all those groups

        Map<String, List<String>> result = new HashMap<>();             // Each key is a stringified version of a character frequency array
                                                                        // Each value is a List of Strings that share that frequency (are anagrams)
        for (String currentElement : strs) {                            // Loop through each element in the array strs
            int[] count = new int[26];
            for (char currentChar : currentElement.toCharArray()) {     // Convert the currentElement (word) into a character array. cat = ['c','a','t']
                count[currentChar - 'a']++;                             // Counts how many times each letter appears in the word 
            }
            String key = Arrays.toString(count);                        // Converts the count Array to a String format. This string acts as a fingerprint for all anagrams with the same letter counts
            result.putIfAbsent(key, new ArrayList<>());                 // This line ensures that the result map has a list ready to hold anagrams for the given key. 
                                                                        // If the key doesn’t exist yet, it creates a new empty list and inserts it.

            result.get(key).add(currentElement);                        // Adds the current word (currentElement) to the correct group of anagrams in the result map.
  
        }

        return new ArrayList<>(result.values());                        // Returns a list of all the grouped anagrams that were stored in the result map
    }

    public static void main(String[] args) {
        SolutionNotes sol = new SolutionNotes();

        String[] test1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] test2 = {""};
        String[] test3 = {"a"};

        System.out.println(sol.groupAnagrams(test1));
        System.out.println(sol.groupAnagrams(test2));
        System.out.println(sol.groupAnagrams(test3));
    }
}