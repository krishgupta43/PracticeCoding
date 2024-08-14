package Problems;

import java.util.ArrayList;
import java.util.List;

//Given an integer array of unique elements, return all possible subsets (the power set).
//
//The solution set must not contain duplicate subsets. Return the solution in any order.
//
// 
//
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
//Input: nums = [0]
//Output: [[],[0]]
public class Problem_2 {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3 ,4};
		check(A);
	}

	private static void check(int[] A) {

		List<List<Integer>> li = new ArrayList<>();
		int n = A.length;
		double p = Math.pow(2, n);

		for (int i = 0; i < (1 << n); i++) {
			List<Integer> v = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if (((1 << j) & i)>=1) {
					v.add(A[j]);
				}

			}
			li.add(v);

		}
		System.out.println(li);

	}
}
