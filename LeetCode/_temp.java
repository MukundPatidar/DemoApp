package LeetCode;

import java.util.Arrays;

public class _temp {
	public static void main(String[] args) {
		int[][] nums = { { 1, 4 }, { 3, 2 }, { 5, 3 }, { 4, 1 }, { 2, 3 }, { 1, 1 } };
		System.out.println(Arrays.deepToString(nums));
		Arrays.sort(nums, (a, b) -> {
			if (a[0] != b[0]) {
				return Integer.compare(a[0], b[0]);
			} else {
				return Integer.compare(a[1], b[1]);
			}
		});
		System.out.println(Arrays.deepToString(nums));
	}
}
