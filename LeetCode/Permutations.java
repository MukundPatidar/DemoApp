package LeetCode;

import java.util.*;

public class Permutations {
	public static void main(String[] args) {
		int nums[] = {1,2,3};
		System.out.println(permute(nums));
	}

	static List<Integer> temp = new ArrayList<>();
	static List<List<Integer>> ans = new ArrayList<>();

	public static List<List<Integer>> permute(int[] nums) {
		helper(0, nums);
		return ans;
	}
	
	static void helper(int i, int[] nums) {
		if (i == nums.length){
			ans.add(new ArrayList<>(temp));
			temp.removeLast();
			return;
		}
		
		for (int j = 0; j < nums.length; j++) {
			if(!(temp.contains(nums[j]))){
				temp.add(nums[j]);
				helper(i+1, nums);
				
			}
		}
	}
}
