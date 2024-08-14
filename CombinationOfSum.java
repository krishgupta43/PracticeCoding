package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationOfSum {
	
    public static List<List<Integer>> findCombinations(int[] nums, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates efficiently
        backtrack(nums, target, new ArrayList<>(), combinations, 0, 0);
        return combinations;
    }

    private static void backtrack(int[] nums, int target, List<Integer> currentCombination,
                                  List<List<Integer>> combinations, int sum, int startIndex) {
        if (sum == target) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            int num = nums[i];
            if (sum + num > target) {
                break; // Stop exploring this branch if the sum exceeds the target
            }
            if (i > startIndex && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates to avoid repetitions
            }
            currentCombination.add(num);
            backtrack(nums, target, currentCombination, combinations, sum + num, i + 1);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,6,7};
        int target = 7;

        List<List<Integer>> combinations = findCombinations(nums, target);

        System.out.println(combinations);
        // Print the combinations
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

}




