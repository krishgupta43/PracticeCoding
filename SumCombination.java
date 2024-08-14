package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumCombination {
   
	static public List<List<Integer>> check(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> combination = new ArrayList<>();

		//Arrays.sort(candidates); // Sort the candidates to handle duplicates properly
		helper(candidates, target, 0, combination, result);
		return result;
	}

    static void helper(int[] candidates, int target, int start, List<Integer> combination,
			List<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<>(combination)); // Add a copy of the combination to the result
			return;
		}
		if (target < 0) {
			return;
		}

		for (int i = start; i < candidates.length; i++) {
//			if (i > start && candidates[i] == candidates[i - 1]) {
//				continue; // Skip duplicates to avoid generating duplicate combinations
//			}
			combination.add(candidates[i]);
			helper(candidates, target - candidates[i], i , combination, result);
			combination.remove(combination.size() - 1); // Backtrack
		}
	}
    
	public static void main(String[] args) {

		int[] nums = { 2, 3, 6, 7 };
		int targetSum = 7;
		List<List<Integer>> combinations = check(nums,targetSum);
		System.out.println(combinations);
		
//		 for (List<Integer> combination : combinations) {
//	            System.out.println(combination);
//	        }
	}
}

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class CombinationSum {
//
//    public List<List<Integer>> findCombinations(int[] candidates, int target) {
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> combination = new ArrayList<>();
//        Arrays.sort(candidates); // Sort the candidates to handle duplicates properly
//        findCombinationsRecursive(candidates, target, 0, combination, result);
//        return result;
//    }
//
//    private void findCombinationsRecursive(int[] candidates, int target, int start,
//                                           List<Integer> combination, List<List<Integer>> result) {
//        if (target == 0) {
//            result.add(new ArrayList<>(combination)); // Add a copy of the combination to the result
//            return;
//        }
//        if (target < 0) {
//            return;
//        }
//
//        for (int i = start; i < candidates.length; i++) {
//            if (i > start && candidates[i] == candidates[i - 1]) {
//                continue; // Skip duplicates to avoid generating duplicate combinations
//            }
//            combination.add(candidates[i]);
//            findCombinationsRecursive(candidates, target - candidates[i], i + 1, combination, result);
//            combination.remove(combination.size() - 1); // Backtrack
//        }
//    }
//
//    public static void main(String[] args) {
//        CombinationSum combinationSum = new CombinationSum();
//        int[] nums = {2, 3, 6, 7};
//        int targetSum = 7;
//        List<List<Integer>> combinations = combinationSum.findCombinations(nums, targetSum);
//        System.out.println(combinations);
//    }
//}
//
