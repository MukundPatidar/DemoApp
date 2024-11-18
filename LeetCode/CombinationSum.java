package LeetCode;

import java.util.*;

public class CombinationSum {
	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		System.out.println(combinationSum(candidates, 7));

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		helper(candidates, target, 0, temp, ans);

		return ans;
	}

	public static void helper(int[] candidates, int target, int index, List<Integer> temp, List<List<Integer>> ans) {
		if (0 == target) {
			ans.add(new ArrayList<>(temp));
			return;
		} else if (index == candidates.length) {
			return;
		}

		if (target >= candidates[index]) {
			temp.add(candidates[index]);
			helper(candidates, target - candidates[index], index, temp, ans);
			temp.removeLast();
		}
		helper(candidates, target, ++index, temp, ans);
	}
}
