/* Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first. */ 

// Time & Space complexity (O(n)) ✅ 

import java.util.Arrays;
import java.util.HashMap;
                                                                // One Pass because it loops through the array only once
public class SolutionNotes {
    public int[] twoSum(int[] nums, int target) {               // Method twoSum that takes an array of integers nums and a target sum

        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {                 // Loops through each element in nums

            int num = nums[i];                                  // Retrieves number at index [i]
            int diff = target - num;                            // Calculates the complement (difference) of the target and the current number (num)

            if (prevMap.containsKey(diff)) {                    // Checks if the complement (diff) has been seen and stored in the HashMap
                return new int[] { prevMap.get(diff), i };      /* If it has, returns indices:
                                                                    prevMap.get(diff) = gives the index of the complement in the HashMap
                                                                    i = index of current number                                         */
                                                                                                
            }

            prevMap.put(num, i);                                // If not, puts the current number and its index[i] in the HashMap
        }

        return new int[] {};                                    // If no pair is found after the loop, return an empty array.
    }

      public static void main(String[] args) {

        Solution sol = new Solution();

        int[] test1 = sol.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] test2 = sol.twoSum(new int[]{3, 2, 4}, 6);
        int[] test3 = sol.twoSum(new int[]{1, 2, 3}, 7);

        System.out.println(Arrays.toString(test1)); //  [0, 1]
        System.out.println(Arrays.toString(test2)); //  [1, 2]
        System.out.println(Arrays.toString(test3)); //  []
    }
}