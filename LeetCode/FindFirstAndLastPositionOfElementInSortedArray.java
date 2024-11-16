package LeetCode;

public class FindFirstAndLastPositionOfElementInSortedArray {
	public static int[] searchRange(int[] nums, int target) {
		int ans[] = { -1, -1 };

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				for (int j = nums.length - 1; j >= i; j--) {
					if (nums[j] == target) {
						ans[0] = i;
						ans[1] = j;
						break;
					}
				}
				break;
			}
		}

		return ans;
	}

}