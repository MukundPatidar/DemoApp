package LeetCode;

import java.util.Arrays;

public class _temp {
	public static boolean search(int[] nums, int target) {
		Arrays.sort(nums);

		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int idx = (right + left) / 2;
			if (nums[idx] == target) {
				return true;
			} else if (nums[left] == target) {
				return true;
			} else if (nums[right] == target) {
				return true;
			} else if (nums[idx] > target) {
				right = idx - 1;
			} else if (nums[idx] < target) {
				left = idx + 1;
			}
		}

		if (left == right && nums[left] == target) {
			return true;
		}

		return false;
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3 };
		System.out.println(Arrays.toString(arr));
	}
}
