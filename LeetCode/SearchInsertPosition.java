package LeetCode;

public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
		if (nums[0] > target) {
			return 0;
		} else if (nums[nums.length - 1] < target) {
			return nums.length;
		}

		int left = 0;
		int right = nums.length - 1;
		int mid;

		while (left < right) {
			mid = (left + right) / 2;

			if (nums[left] == target) {
				return left;
			} else if (nums[right] == target) {
				return right;
			} else if (nums[mid] == target) {
				return mid;
			} else if (left + 1 == right) {
				return right;
			}

			if (nums[mid] > target) {
				right = mid;
			} else {
				left = mid;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
		System.out.println(searchInsert(arr, 7));
	}
}
