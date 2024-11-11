package LeetCode;

public class SearchInRotatedSortedArray {
	public static int search(int[] nums, int target) {
		int min = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < nums[min]) {
				min = i;
			}
		}

		int ans = -1;
		int left = 0;
		int right = nums.length - 1;

		if (target >= nums[min] && target <= nums[right]) {
			left = min;
		} else if (target <= nums[Math.max(0, min-1)] && target >= nums[left]) {
			right = min-1;
		}

		while (left < right) {
			int idx = (right + left) / 2;
			if (nums[idx] == target) {
				return idx;
			} else if (nums[left] == target) {
				return left;
			} else if (nums[right] == target) {
				return right;
			} else if (nums[idx] > target) {
				right = idx - 1;
			} else if (nums[idx] < target) {
				left = idx + 1;
			}
		}

		if (left == right && nums[left] == target) {
			return left;
		}
		

		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(search(arr, 1));
	}
}
