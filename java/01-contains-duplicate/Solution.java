
import java.util.HashSet;
import java.util.Set;

//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

class Solution {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
