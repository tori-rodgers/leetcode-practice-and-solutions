//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

import java.util.Arrays;

public class Solution {

    public boolean containsDuplicate(int[] nums) {

        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}