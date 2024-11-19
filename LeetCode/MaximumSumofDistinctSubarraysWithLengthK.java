package LeetCode;

import java.util.*;

public class MaximumSumofDistinctSubarraysWithLengthK {
	public static void main(String[] args) {
		int arr[] = { 1,1,1,7,8,9 };
		System.out.println(maximumSubarraySum(arr, 3));
	}

	public static long maximumSubarraySum(int[] nums, int k) {
		long ans = 0;

		List<Set<Integer>> liSet = new ArrayList<>();

		for (int i = 0; i <= nums.length - k; i++) {
			System.out.println("i is: "+i);
			liSet.add(i,new HashSet<>());
			for (int j = i; (j < i + k) && (j < nums.length); j++) {
				liSet.get(i).add(nums[j]);
			}
		}
		System.out.println(liSet);
		for (int i = 0; i < liSet.size(); i++) {
			if(liSet.get(i).size() == k){
				long temp = 0;
				for (int j : liSet.get(i)) {
					temp += j;
				}
				ans = Math.max(ans, temp);
			}
			
		}

		return ans;
	}
}
