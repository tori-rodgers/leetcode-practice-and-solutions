
import java.util.HashSet;
import java.util.Set;

//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.



// Time & Space complexity (O(n)) ✅ 

public class SolutionNotes {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();            // Set is a collection that does not allow duplicate elements
                                                        // HashSet allow contains, add operations
        for (int num : nums) {
            if (seen.contains(num)) {                   // If seen HashSet contains the element (num), return true.
                return true;
            }
            seen.add(num);                              // Adds the element to the seen Hashset
        }

        return false;
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