/* Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first. */ 


import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seenMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int diff = target - number;

            if (seenMap.containsKey(diff)) {
                return new int[] { seenMap.get(diff), i };
            }

            seenMap.put(number, i);
        }

        return new int[] {};
    }
}