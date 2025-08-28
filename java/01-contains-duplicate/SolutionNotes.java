//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

import java.util.Arrays;

// Time & Space complexity (O(n)) ✅ 

public class SolutionNotes {

    public boolean containsDuplicate(int[] nums) {

        return Arrays.stream(nums).distinct().count() < nums.length;            /* Arrays.stream(nums) converts the int[] nums array into an IntStream (stream of primitive int values) 
                                                                                    which supports functional-style operations like distinct.
                                                                                    .distinct() returns a stream containing only unique values.
                                                                                    .count() counts how many unique elements are in the stream.
                                                                                    < nums.length compares the number of unique elements to the original array length. */
    }

    public static void main(String[] args) {

        SolutionNotes sol = new SolutionNotes();

        System.out.println(sol.containsDuplicate(new int[] {1, 2, 3, 4}));
        System.out.println(sol.containsDuplicate(new int[] {1, 2, 3, 1}));

        // or

        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {1, 2, 3, 1};
        int[] test3 = {};
        int[] test4 = {5, 5, 5, 5};

        System.out.println(sol.containsDuplicate(test1));
        System.out.println(sol.containsDuplicate(test2));
        System.out.println(sol.containsDuplicate(test3));
        System.out.println(sol.containsDuplicate(test4));

    }
}