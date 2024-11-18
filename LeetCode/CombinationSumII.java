package LeetCode;

import java.util.*;

public class CombinationSumII {
	public static void main(String[] args) {
		int[] candidates = { 2, 5, 2, 1, 2 };
		System.out.println(combinationSum(candidates, 5));

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		helper(candidates, target, 0, temp, ans);

		return ans;
	}

	public static void helper(int[] candidates, int target, int index, List<Integer> temp, List<List<Integer>> ans) {
		if (0 == target) {
			ans.add(new ArrayList<>(temp));
			return;
		}

		for (int i = index; i < candidates.length; i++) {
			if (i > index && candidates[i] == candidates[i - 1])
				continue;
			if (candidates[i] > target)
				break;
			
			temp.add(candidates[i]);
			helper(candidates, target - candidates[i], i + 1, temp, ans);
			temp.remove(temp.size() - 1);
		}
	}
}
